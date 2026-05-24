package com.pandaled.ui.detail.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.pandaled.data.model.Project
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProjectInfoColumn(
    project: Project,
    onUpdate: (name: String, startTime: String) -> Unit,
    modifier: Modifier = Modifier
) {
    var editName by remember(project.name) { mutableStateOf(project.name) }
    var editStartTime by remember(project.startTime) { mutableStateOf(project.startTime) }

    // Date/Time picker state
    var showDatePicker by remember { mutableStateOf(false) }
    var showTimePicker by remember { mutableStateOf(false) }
    val dateFormat = remember { SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()) }

    // Parse current startTime into Calendar
    val calendar = remember(editStartTime) {
        try {
            val parsed = dateFormat.parse(editStartTime)
            Calendar.getInstance().apply { if (parsed != null) time = parsed }
        } catch (_: Exception) {
            Calendar.getInstance()
        }
    }

    val datePickerState = rememberDatePickerState(
        initialSelectedDateMillis = calendar.timeInMillis
    )
    val timePickerState = rememberTimePickerState(
        initialHour = calendar.get(Calendar.HOUR_OF_DAY),
        initialMinute = calendar.get(Calendar.MINUTE),
        is24Hour = true
    )

    // Date picker dialog
    if (showDatePicker) {
        DatePickerDialog(
            onDismissRequest = { showDatePicker = false },
            confirmButton = {
                TextButton(onClick = {
                    datePickerState.selectedDateMillis?.let { millis ->
                        calendar.timeInMillis = millis
                    }
                    showDatePicker = false
                    showTimePicker = true
                }) {
                    Text("下一步")
                }
            },
            dismissButton = {
                TextButton(onClick = { showDatePicker = false }) {
                    Text("取消")
                }
            }
        ) {
            DatePicker(state = datePickerState)
        }
    }

    // Time picker dialog
    if (showTimePicker) {
        AlertDialog(
            onDismissRequest = { showTimePicker = false },
            title = { Text("选择时间") },
            text = {
                Box(modifier = Modifier.fillMaxWidth()) {
                    TimePicker(state = timePickerState)
                }
            },
            confirmButton = {
                TextButton(onClick = {
                    calendar.set(Calendar.HOUR_OF_DAY, timePickerState.hour)
                    calendar.set(Calendar.MINUTE, timePickerState.minute)
                    calendar.set(Calendar.SECOND, 0)
                    editStartTime = dateFormat.format(calendar.time)
                    onUpdate(editName, editStartTime)
                    showTimePicker = false
                }) {
                    Text("确定")
                }
            },
            dismissButton = {
                TextButton(onClick = { showTimePicker = false }) {
                    Text("取消")
                }
            }
        )
    }

    Column(
        modifier = modifier.padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            "项目信息",
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold
        )

        // Version (read-only)
        // Name
        OutlinedTextField(
            value = editName,
            onValueChange = { newName ->
                editName = newName
                onUpdate(newName, editStartTime)
            },
            label = { Text("项目名称") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        // Start time — click to pick
        OutlinedTextField(
            value = editStartTime,
            onValueChange = {},
            readOnly = true,
            label = { Text("开始时间") },
            modifier = Modifier
                .fillMaxWidth()
                .clickable { showDatePicker = true },
            singleLine = true,
            trailingIcon = {
                IconButton(onClick = { showDatePicker = true }) {
                    Text("📅", style = MaterialTheme.typography.bodyLarge)
                }
            }
        )


    }
}
