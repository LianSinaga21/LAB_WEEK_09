package com.example.lab_week_09

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions   // ✅
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType        // ✅
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab_week_09.ui.theme.LAB_WEEK_09Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Semua UI Compose didefinisikan di sini
        setContent {
            LAB_WEEK_09Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Panggil Composable Home dengan list data
                    val list = listOf("Tanu", "Tina", "Tono")
                    Home(list)
                }
            }
        }
    }
}

// Composable utama
@Composable
fun Home(items: List<String>) {
    // LazyColumn = pengganti RecyclerView
    LazyColumn {
        // Bagian input & tombol
        item {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Judul
                Text(text = stringResource(id = R.string.enter_item))

                // Input field
                TextField(
                    value = "",
                    onValueChange = { },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    )
                )

                // Tombol
                Button(onClick = { }) {
                    Text(text = stringResource(id = R.string.button_click))
                }
            }
        }

        // Daftar nama
        items(items) { item ->
            Column(
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = item)
            }
        }
    }
}

// Preview untuk tampil di Android Studio
@Preview(showBackground = true)
@Composable
fun PreviewHome() {
    Home(listOf("Tanu", "Tina", "Tono"))
}
