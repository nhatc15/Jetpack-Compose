package com.example.jetpackcompose.ui.bottombarscreen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navigateToSearchScreen: () -> Unit
) {
    Column(modifier = modifier) {
        Text(text = "Home Screen")
        Button(onClick = { navigateToSearchScreen() }) {
            Text(text = "Search Screen")
        }
    }
}