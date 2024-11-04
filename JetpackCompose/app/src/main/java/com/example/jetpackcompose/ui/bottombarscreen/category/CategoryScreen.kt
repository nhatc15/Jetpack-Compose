package com.example.jetpackcompose.ui.bottombarscreen.category

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CategoryScreen(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = "Category Screen")
    }
}
