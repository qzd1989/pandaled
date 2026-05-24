package com.pandaled.ui.detail

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pandaled.data.model.*
import kotlinx.coroutines.delay
import com.pandaled.ui.detail.components.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    projectId: String,
    onNavigateBack: () -> Unit,
    onNavigateToFullScreen: () -> Unit,
    viewModel: DetailViewModel = viewModel()
) {
    val state by viewModel.uiState.collectAsState()
    val context = LocalContext.current

    // Load project on first composition
    LaunchedEffect(projectId) {
        viewModel.loadProject(projectId)
    }

    // Preview auto-advance logic
    // Preview: current scene only, no cycling

    // Save when project changes
    LaunchedEffect(state.project) {
        // Debounced auto-save could go here; for now manual save
    }

    var showMenu by remember { mutableStateOf(false) }

    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        state.project?.name ?: "加载中...",
                        maxLines = 1,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface,
                    titleContentColor = MaterialTheme.colorScheme.onSurface,
                    navigationIconContentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    actionIconContentColor = MaterialTheme.colorScheme.onSurfaceVariant
                ),
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                    }
                },
                actions = {
                    // Play button → fullscreen
                    IconButton(onClick = { viewModel.launchFullScreen(context) }) {
                        Icon(Icons.Default.PlayArrow, contentDescription = "全屏播放")
                    }
                    // Three-dot menu
                    Box {
                        IconButton(onClick = { showMenu = true }) {
                            Icon(Icons.Default.MoreVert, contentDescription = "更多")
                        }
                        DropdownMenu(
                            expanded = showMenu,
                            onDismissRequest = { showMenu = false }
                        ) {
                            DropdownMenuItem(
                                text = { Text("分享") },
                                leadingIcon = { Icon(Icons.Default.Share, null) },
                                onClick = {
                                    showMenu = false
                                    viewModel.generateShareQr()
                                }
                            )
                        }
                    }
                }
            )
        }
    ) { padding ->
        if (state.isLoading || state.project == null) {
            Box(
                modifier = Modifier.fillMaxSize().padding(padding),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
            return@Scaffold
        }

        val project = state.project!!

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(MaterialTheme.colorScheme.background)
        ) {
            // ─── Red warning bar for missing assets ──────
            if (state.missingAssets.isNotEmpty()) {
                MissingAssetBar(
                    missingAssets = state.missingAssets,
                    onClick = { viewModel.navigateToMissingAsset(it) }
                )
            }

            // ─── Preview panel ───────────────────────────
            val currentSceneName = when (val t = state.selectedTarget) {
                is EditorTarget.None -> ""
                is EditorTarget.IdleScene -> "等待场景"
                is EditorTarget.Scene -> project.scenes.getOrNull(t.index)?.name ?: "场景 ${t.index + 1}"
            }
            val configuration = LocalConfiguration.current
            val previewAspectRatio = remember(configuration.screenWidthDp, configuration.screenHeightDp) {
                val longSide = maxOf(configuration.screenWidthDp, configuration.screenHeightDp).coerceAtLeast(1)
                val shortSide = minOf(configuration.screenWidthDp, configuration.screenHeightDp).coerceAtLeast(1)
                longSide.toFloat() / shortSide.toFloat()
            }
            PreviewPanel(
                project = project,
                currentPreviewIndex = state.previewCurrentIndex,
                isPlaying = state.isPreviewPlaying,
                replayKey = state.previewReplayKey,
                sceneName = currentSceneName,
                selectedTarget = state.selectedTarget,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 10.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .aspectRatio(previewAspectRatio)
            )

            HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)

            // ─── Tab bar ─────────────────────────────────
            val tabTitles = listOf("项目信息", "场景列表", "场景编辑")
            var selectedTab by remember { mutableIntStateOf(2) }



            TabRow(
                selectedTabIndex = selectedTab,
                containerColor = MaterialTheme.colorScheme.surface,
                contentColor = MaterialTheme.colorScheme.onSurface,
                divider = { HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant) }
            ) {
                tabTitles.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        text = {
                            Text(
                                title,
                                maxLines = 1,
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = if (selectedTab == index) FontWeight.Bold else FontWeight.Medium
                            )
                        },
                        selectedContentColor = MaterialTheme.colorScheme.primary,
                        unselectedContentColor = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            // ─── Tab content ─────────────────────────────
            when (selectedTab) {
                0 -> {
                    ProjectInfoColumn(
                        project = project,
                        onUpdate = { name, startTime ->
                            viewModel.updateProjectInfo(name, startTime)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                    )
                }
                1 -> {
                    SceneListColumn(
                        idleScene = project.idleScene,
                        scenes = project.scenes,
                        selectedTarget = state.selectedTarget,
                        highlightedSceneIndex = state.highlightedSceneIndex,
                        onSelectIdle = {
                            viewModel.selectIdleScene()
                            selectedTab = 2
                        },
                        onSelectScene = {
                            viewModel.selectScene(it)
                            selectedTab = 2
                        },
                        onMoveScene = { from, to -> viewModel.moveScene(from, to) },
                        onAddScene = { type ->
                            viewModel.addScene(type)
                            selectedTab = 2
                        },
                        onDeleteScene = { viewModel.deleteScene(it) },
                        modifier = Modifier.fillMaxSize()
                    )
                }
                2 -> {
                    SceneEditorColumn(
                        project = project,
                        selectedTarget = state.selectedTarget,
                        highlightedSceneIndex = state.highlightedSceneIndex,
                        onUpdateIdleScene = { viewModel.updateIdleScene(it) },
                        onUpdateScene = { idx, scene -> viewModel.updateScene(idx, scene) },
                        modifier = Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                            .padding(12.dp)
                    )
                }
            }
        }
    }

    // ─── QR Share Dialog ─────────────────────────────────
    if (state.showQrDialog && state.qrCodeBitmap != null) {
        Dialog(onDismissRequest = { viewModel.dismissQrDialog() }) {
            Card(
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.padding(16.dp)
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "分享项目",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(16.dp))
                    Image(
                        bitmap = state.qrCodeBitmap!!.asImageBitmap(),
                        contentDescription = "项目二维码",
                        modifier = Modifier
                            .size(260.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        contentScale = ContentScale.Fit
                    )
                    Spacer(Modifier.height(8.dp))
                    Text(
                        "扫描此二维码以导入项目",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(Modifier.height(16.dp))
                    TextButton(onClick = { viewModel.dismissQrDialog() }) {
                        Text("关闭")
                    }
                }
            }
        }
    }
}

// ─── Missing Asset Warning Bar ───────────────────────────

@Composable
fun MissingAssetBar(
    missingAssets: List<MissingAsset>,
    onClick: (MissingAsset) -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color(0xFFD32F2F)
    ) {
        Row(
            modifier = Modifier
                .clickable {
                    // Click first missing asset
                    if (missingAssets.isNotEmpty()) onClick(missingAssets.first())
                }
                .padding(horizontal = 16.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Default.Warning,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(20.dp)
            )
            Spacer(Modifier.width(8.dp))
            Text(
                "待补充完整 — ${missingAssets.joinToString(", ") { it.label }}",
                color = Color.White,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium
            )
        }
    }
}
