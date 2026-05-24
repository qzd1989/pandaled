package com.pandaled.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    val prefs = remember { context.getSharedPreferences("pandaled_prefs", android.content.Context.MODE_PRIVATE) }

    val systemLang = java.util.Locale.getDefault().language
    var selectedLang by remember { mutableStateOf(prefs.getString("language", "") ?: "") }
    val resolvedLang = selectedLang.ifEmpty {
        if (systemLang.startsWith("zh")) "zh" else "en"
    }
    var selectedColorMode by remember { mutableStateOf(prefs.getString("color_mode", "system") ?: "system") }

    var langExpanded by remember { mutableStateOf(false) }
    var colorExpanded by remember { mutableStateOf(false) }

    val langOptions = mapOf(
        "system" to "随系统",
        "zh" to "中文",
        "en" to "English"
    )
    val colorModeOptions = mapOf(
        "system" to "随系统",
        "light" to "浅色",
        "dark" to "深色"
    )

    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        topBar = {
            TopAppBar(
                title = { Text("设置") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // ─── Language ────────────────────────────────
            Text("语种", style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)

            ExposedDropdownMenuBox(
                expanded = langExpanded,
                onExpandedChange = { langExpanded = it }
            ) {
                OutlinedTextField(
                    value = langOptions[selectedLang.ifEmpty { "system" }] ?: "随系统",
                    onValueChange = {},
                    readOnly = true,
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = langExpanded) },
                    modifier = Modifier.fillMaxWidth().menuAnchor(),
                    singleLine = true
                )
                ExposedDropdownMenu(
                    expanded = langExpanded,
                    onDismissRequest = { langExpanded = false }
                ) {
                    langOptions.forEach { (key, label) ->
                        DropdownMenuItem(
                            text = { Text(label) },
                            onClick = {
                                langExpanded = false
                                val value = if (key == "system") "" else key
                                selectedLang = value
                                prefs.edit().putString("language", value).apply()
                            }
                        )
                    }
                }
            }

            // ─── Theme ───────────────────────────────────
            Text("主题", style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)

            ExposedDropdownMenuBox(
                expanded = colorExpanded,
                onExpandedChange = { colorExpanded = it }
            ) {
                OutlinedTextField(
                    value = colorModeOptions[selectedColorMode] ?: "随系统",
                    onValueChange = {},
                    readOnly = true,
                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = colorExpanded) },
                    modifier = Modifier.fillMaxWidth().menuAnchor(),
                    singleLine = true
                )
                ExposedDropdownMenu(
                    expanded = colorExpanded,
                    onDismissRequest = { colorExpanded = false }
                ) {
                    colorModeOptions.forEach { (key, label) ->
                        DropdownMenuItem(
                            text = { Text(label) },
                            onClick = {
                                colorExpanded = false
                                selectedColorMode = key
                                prefs.edit().putString("color_mode", key).apply()
                            }
                        )
                    }
                }
            }

            // ─── Cache ───────────────────────────────────
            Text("缓存", style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold)

            val cacheSize = remember { calculateCacheSize(context) }
            var cacheText by remember { mutableStateOf("计算中...") }
            LaunchedEffect(Unit) {
                cacheText = if (cacheSize <= 0) "0 B"
                else when {
                    cacheSize < 1024 -> "${cacheSize} B"
                    cacheSize < 1024 * 1024 -> "${cacheSize / 1024} KB"
                    else -> String.format("%.1f MB", cacheSize / (1024.0 * 1024.0))
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    "未使用缓存: $cacheText",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.weight(1f)
                )
                Button(onClick = {
                    clearUnusedCache(context)
                    cacheText = "0 B"
                }) {
                    Text("清理缓存")
                }
            }
        }
    }
}

private fun collectReferencedPaths(context: android.content.Context): Set<String> {
    val referenced = mutableSetOf<String>()
    try {
        val projectsDir = java.io.File(context.filesDir, "projects")
        if (projectsDir.exists()) {
            val gson = com.google.gson.Gson()
            projectsDir.listFiles()?.filter { it.extension == "json" }?.forEach { f ->
                try {
                    val project = gson.fromJson(f.readText(), com.pandaled.data.model.Project::class.java)
                    project?.scenes?.forEach { scene ->
                        scene.content.source?.let { s -> if (s.isNotBlank()) referenced.add(s) }
                    }
                    project?.idleScene?.content?.source?.let { s -> if (s.isNotBlank()) referenced.add(s) }
                } catch (_: Exception) {}
            }
        }
    } catch (_: Exception) {}
    return referenced
}

private fun calculateCacheSize(context: android.content.Context): Long {
    val mediaDir = java.io.File(context.filesDir, "media")
    if (!mediaDir.exists()) return 0L
    val referenced = collectReferencedPaths(context)
    var unusedBytes = 0L
    mediaDir.walkTopDown().filter { it.isFile }.forEach { f ->
        if (f.absolutePath !in referenced) {
            unusedBytes += f.length()
        }
    }
    return unusedBytes
}

private fun clearUnusedCache(context: android.content.Context) {
    val mediaDir = java.io.File(context.filesDir, "media")
    if (!mediaDir.exists()) return
    val referenced = collectReferencedPaths(context)
    mediaDir.walkTopDown().filter { it.isFile }.forEach { f ->
        if (f.absolutePath !in referenced) {
            f.delete()
        }
    }
}
