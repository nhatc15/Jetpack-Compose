package com.example.jetpackcompose.ui.bottombarscreen.bookmark

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jetpackcompose.ui.main.component.TopBar

@Composable
fun BookmarkScreen(
    modifier: Modifier = Modifier,
    navigateToSearchScreen: () -> Unit
) {
    Column(modifier = modifier) {
        TopBar(navigateToSearch = { navigateToSearchScreen() } )
        Text(text = "Bookmark Screen")
    }
}