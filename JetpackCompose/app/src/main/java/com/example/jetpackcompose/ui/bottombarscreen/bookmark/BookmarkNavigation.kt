package com.example.jetpackcompose.ui.bottombarscreen.bookmark

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.main.component.BottomBarItem

fun NavGraphBuilder.bookmarkNavigation() {
    composable(route = BottomBarItem.Bookmark.route) {
        BookmarkScreen()
    }
}
