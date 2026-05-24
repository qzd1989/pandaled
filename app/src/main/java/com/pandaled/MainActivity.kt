package com.pandaled

import android.os.Bundle
import android.os.LocaleList
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.os.LocaleListCompat
import com.pandaled.ui.theme.PandaLedTheme
import com.pandaled.ui.navigation.PandaLedNavGraph
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Apply saved locale
        val prefs = getSharedPreferences("pandaled_prefs", MODE_PRIVATE)
        val language = prefs.getString("language", "") ?: ""
        val locale = when {
            language == "zh" -> Locale("zh")
            language == "en" -> Locale("en")
            else -> {
                val sys = Locale.getDefault()
                if (sys.language.startsWith("zh")) Locale("zh") else Locale("en")
            }
        }
        AppCompatDelegate.setApplicationLocales(LocaleListCompat.create(LocaleList(locale)))

        enableEdgeToEdge()
        setContent {
            PandaLedTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PandaLedNavGraph()
                }
            }
        }
    }
}
