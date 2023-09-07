package com.example.jetpackcompose.ui.bottombarscreen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jetpackcompose.ui.main.component.TopBar

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navigateToSearchScreen: () -> Unit,
    navigateToWebViewScreen: () -> Unit
) {
    Column(modifier = modifier) {
        TopBar(navigateToSearch = { navigateToSearchScreen() })
        Text(text = "Home Screen")
        Button(onClick = { navigateToWebViewScreen() }) {
            Text(text = "Open WebView")
        }
    }
}
