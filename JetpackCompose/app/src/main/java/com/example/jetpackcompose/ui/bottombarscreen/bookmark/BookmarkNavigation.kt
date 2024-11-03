package com.example.jetpackcompose.ui.bottombarscreen.bookmark

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.common.Screen

fun NavGraphBuilder.bookmarkNavigation(navigateToSearchScreen: () -> Unit) {
    composable(route = Screen.Bookmark.route) {
        BookmarkScreen(navigateToSearchScreen = { navigateToSearchScreen() })
    }
}
