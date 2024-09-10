package com.example.hw1q2_cyang

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hw1q2_cyang.ui.theme.HW1Q2_cyangTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HW1Q2_cyangTheme {
                // Call our main composable function
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    // Create a mutable state for showing text and button visibility
    var showText by remember { mutableStateOf(false) }

    // Use Box to align button and text at the center
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // Vertical arrangement for button and text
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            // Conditionally show the button if `showText` is false
            if (!showText) {
                Button(onClick = { showText = true }) {
                    Text(text = "Click Me")
                }
            }

            // Conditionally show "Hello World" text after the button is clicked
            if (showText) {
                Spacer(modifier = Modifier.height(16.dp)) // Add some spacing
                Text(text = "Hello World!")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HW1Q2_cyangTheme {
        MainScreen()
    }
}
