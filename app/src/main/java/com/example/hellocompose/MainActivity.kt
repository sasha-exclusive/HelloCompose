package com.example.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeApp()
        }
    }
}
@Composable
fun HelloComposeApp() {
    MaterialTheme {
        var name by remember { mutableStateOf("Олексндр") }
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Привіт, $name!", style = MaterialTheme.typography.headlineMedium)
                Spacer(modifier = Modifier.height(12.dp))
                Button(onClick = { name = "Друже" }) {
                    Text("Натисни")
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewHello() {
    HelloComposeApp()
}
