package com.pandaled.ui.detail.components

import android.graphics.Typeface
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Available system fonts for LED display.
 * Each entry: (key used in JSON, display label, Android Typeface)
 */
data class FontOption(
    val key: String,
    val label: String,
    val typeface: Typeface
)

val availableFonts = listOf(
    FontOption("sans-serif", "默认", Typeface.DEFAULT),
    FontOption("sans-serif-bold", "粗体", Typeface.DEFAULT_BOLD),
    FontOption("sans-serif-light", "细体", Typeface.create("sans-serif-light", Typeface.NORMAL)),
    FontOption("sans-serif-condensed", "窄体", Typeface.create("sans-serif-condensed", Typeface.NORMAL)),
    FontOption("serif", "衬线", Typeface.SERIF),
    FontOption("monospace", "等宽", Typeface.MONOSPACE),
    FontOption("casual", "随意", Typeface.create("casual", Typeface.NORMAL)),
    FontOption("cursive", "手写", Typeface.create("cursive", Typeface.NORMAL)),
)

/** Look up a Typeface by font key. */
fun typefaceForKey(key: String?): Typeface {
    return availableFonts.firstOrNull { it.key == key }?.typeface ?: Typeface.DEFAULT
}

/** Horizontal row of font selector buttons, each showing "Abc" in that font. */
@Composable
fun FontFamilySelector(
    selectedKey: String,
    onSelect: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        availableFonts.forEach { font ->
            val isSelected = font.key == selectedKey
            OutlinedButton(
                onClick = { onSelect(font.key) },
                border = BorderStroke(
                    width = if (isSelected) 2.dp else 1.dp,
                    color = if (isSelected) MaterialTheme.colorScheme.primary
                            else MaterialTheme.colorScheme.outline
                ),
                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text(
                    text = "Abc",
                    fontFamily = when (font.key) {
                        "sans-serif" -> FontFamily.SansSerif
                        "serif" -> FontFamily.Serif
                        "monospace" -> FontFamily.Monospace
                        "cursive" -> FontFamily.Cursive
                        else -> FontFamily.SansSerif
                    },
                    fontWeight = when {
                        font.key.contains("bold") -> FontWeight.Bold
                        font.key.contains("light") -> FontWeight.Light
                        else -> FontWeight.Normal
                    },
                    fontSize = 16.sp
                )
            }
        }
    }
}
