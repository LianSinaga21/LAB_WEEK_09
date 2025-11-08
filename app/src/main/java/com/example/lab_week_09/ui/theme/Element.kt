package com.example.lab_week_09.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

// ✅ Judul dengan warna onBackground (misal hitam/putih tergantung tema)
@Composable
fun OnBackgroundTitleText(text: String) {
    TitleText(text = text, color = MaterialTheme.colorScheme.onBackground)
}

// ✅ Text besar (titleLarge)
@Composable
fun TitleText(text: String, color: Color) {
    Text(text = text, style = MaterialTheme.typography.titleLarge, color = color)
}

// ✅ Item list dengan warna onBackground
@Composable
fun OnBackgroundItemText(text: String) {
    ItemText(text = text, color = MaterialTheme.colorScheme.onBackground)
}

// ✅ Text kecil (bodySmall)
@Composable
fun ItemText(text: String, color: Color) {
    Text(text = text, style = MaterialTheme.typography.bodySmall, color = color)
}

// ✅ Tombol utama
@Composable
fun PrimaryTextButton(text: String, onClick: () -> Unit) {
    TextButton(text = text, textColor = Color.White, onClick = onClick)
}

// ✅ Tombol dengan gaya labelMedium
@Composable
fun TextButton(text: String, textColor: Color, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.padding(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.DarkGray,
            contentColor = textColor
        )
    ) {
        Text(text = text, style = MaterialTheme.typography.labelMedium)
    }
}
