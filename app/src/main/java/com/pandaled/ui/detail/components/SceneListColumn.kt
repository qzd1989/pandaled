package com.pandaled.ui.detail.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.pandaled.data.model.*
import com.pandaled.ui.detail.EditorTarget
import org.burnoutcrew.reorderable.*

/**
 * Middle column: idleScene (fixed at top) + scenes list (draggable to reorder).
 */
@Composable
fun SceneListColumn(
    idleScene: IdleScene,
    scenes: List<Scene>,
    selectedTarget: EditorTarget,
    highlightedSceneIndex: Int?,
    onSelectIdle: () -> Unit,
    onSelectScene: (Int) -> Unit,
    onMoveScene: (Int, Int) -> Unit,
    onAddScene: (SceneType) -> Unit,
    onDeleteScene: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    var addMenuExpanded by remember { mutableStateOf(false) }
    Column(modifier = modifier.fillMaxSize()) {

        HorizontalDivider()

        // waiting scene — fixed, non-draggable
        val isIdleSelected = selectedTarget is EditorTarget.IdleScene
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = onSelectIdle),
            color = if (isIdleSelected) MaterialTheme.colorScheme.primaryContainer
                    else MaterialTheme.colorScheme.surface,
            shape = RoundedCornerShape(0.dp)
        ) {
            Row(
                modifier = Modifier.padding(start = 8.dp, top = 4.dp, bottom = 4.dp, end = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Default.Timer,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    tint = if (idleScene.hasMissingAsset()) Color.Red else MaterialTheme.colorScheme.onSurface
                )
                Spacer(Modifier.width(6.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        "等待场景",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Medium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        idleSceneTypeLabel(idleScene.type),
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                if (idleScene.hasMissingAsset()) {
                    Icon(
                        Icons.Default.Warning,
                        contentDescription = "待补充",
                        tint = Color.Red,
                        modifier = Modifier.size(16.dp)
                    )
                }
                // Add scene button (inline with idle scene row)
                Box {
                    IconButton(onClick = { addMenuExpanded = true }) {
                        Icon(Icons.Default.Add, contentDescription = "添加场景", modifier = Modifier.size(20.dp))
                    }
                    DropdownMenu(
                        expanded = addMenuExpanded,
                        onDismissRequest = { addMenuExpanded = false }
                    ) {
                        DropdownMenuItem(
                            text = { Text("文字") },
                            onClick = { addMenuExpanded = false; onAddScene(SceneType.TEXT) }
                        )
                        DropdownMenuItem(
                            text = { Text("图片") },
                            onClick = { addMenuExpanded = false; onAddScene(SceneType.IMAGE) }
                        )
                        DropdownMenuItem(
                            text = { Text("视频") },
                            onClick = { addMenuExpanded = false; onAddScene(SceneType.VIDEO) }
                        )
                    }
                }
            }
        }

        HorizontalDivider()

        // Scenes list
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            itemsIndexed(
                items = scenes,
                key = { idx, _ -> "scene_$idx" }
            ) { index, scene ->
                val isSelected = when (selectedTarget) {
                    is EditorTarget.Scene -> selectedTarget.index == index
                    else -> false
                }
                val isHighlighted = highlightedSceneIndex == index
                val isFirst = index == 0
                val isLast = index == scenes.lastIndex

                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(onClick = { onSelectScene(index) })
                        .then(
                            if (isHighlighted) Modifier.border(
                                1.dp,
                                Color.Red,
                                RoundedCornerShape(0.dp)
                            ) else Modifier
                        ),
                    color = when {
                        isHighlighted -> Color.Red.copy(alpha = 0.08f)
                        isSelected -> MaterialTheme.colorScheme.primaryContainer
                        else -> MaterialTheme.colorScheme.surface
                    }
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Scene type icon
                        Icon(
                            imageVector = when (scene.type) {
                                SceneType.TEXT -> Icons.Default.TextFields
                                SceneType.IMAGE -> Icons.Default.Image
                                SceneType.VIDEO -> Icons.Default.Videocam
                            },
                            contentDescription = null,
                            modifier = Modifier.size(18.dp),
                            tint = if (scene.hasMissingAsset()) Color.Red
                                    else MaterialTheme.colorScheme.onSurface
                        )

                        Spacer(Modifier.width(6.dp))

                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                scene.name.ifBlank { "场景 ${index + 1}" },
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.Medium,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                            Text(
                                "${sceneTypeLabel(scene.type)} · ${scene.duration}s",
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }

                        // Warning icon for missing assets
                        if (scene.hasMissingAsset()) {
                            Icon(
                                Icons.Default.Warning,
                                contentDescription = "待补充",
                                tint = Color.Red,
                                modifier = Modifier.size(16.dp)
                            )
                        }

                        // Up arrow — grayed if first
                        IconButton(
                            onClick = { if (!isFirst) onMoveScene(index, index - 1) },
                            modifier = Modifier.size(24.dp),
                            enabled = !isFirst
                        ) {
                            Icon(
                                Icons.Default.KeyboardArrowUp,
                                contentDescription = "上移",
                                modifier = Modifier.size(18.dp),
                                tint = if (isFirst) MaterialTheme.colorScheme.onSurface.copy(alpha = 0.25f)
                                       else MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }

                        // Down arrow — grayed if last
                        IconButton(
                            onClick = { if (!isLast) onMoveScene(index, index + 1) },
                            modifier = Modifier.size(24.dp),
                            enabled = !isLast
                        ) {
                            Icon(
                                Icons.Default.KeyboardArrowDown,
                                contentDescription = "下移",
                                modifier = Modifier.size(18.dp),
                                tint = if (isLast) MaterialTheme.colorScheme.onSurface.copy(alpha = 0.25f)
                                       else MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }

                        // Delete button
                        IconButton(
                            onClick = { onDeleteScene(index) },
                            modifier = Modifier.size(24.dp)
                        ) {
                            Icon(
                                Icons.Default.Close,
                                contentDescription = "删除",
                                modifier = Modifier.size(14.dp),
                                tint = MaterialTheme.colorScheme.error
                            )
                        }
                    }
                }
            }
        }

    }
}

private fun idleSceneTypeLabel(type: IdleSceneType): String = when (type) {
    IdleSceneType.NONE -> "黑屏"
    IdleSceneType.CLOCK -> "时钟"
    IdleSceneType.COUNTDOWN -> "倒计时"
    IdleSceneType.IMAGE -> "图片"
}

private fun sceneTypeLabel(type: SceneType): String = when (type) {
    SceneType.TEXT -> "文字"
    SceneType.IMAGE -> "图片"
    SceneType.VIDEO -> "视频"
}
