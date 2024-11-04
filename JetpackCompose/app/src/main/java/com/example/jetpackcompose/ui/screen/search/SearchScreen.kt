package com.example.jetpackcompose.ui.screen.search

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SearchScreen(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = "Search Screen")
    }
}
