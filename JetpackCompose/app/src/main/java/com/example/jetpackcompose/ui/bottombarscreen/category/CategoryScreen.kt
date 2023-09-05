package com.example.jetpackcompose.ui.bottombarscreen.category

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jetpackcompose.ui.main.component.TopBar

@Composable
fun CategoryScreen(
    modifier: Modifier = Modifier,
    navigateToSearchScreen: () -> Unit
) {
    Column(modifier = modifier) {
        TopBar(navigateToSearch = { navigateToSearchScreen() } )
        Text(text = "Category Screen")
    }
}