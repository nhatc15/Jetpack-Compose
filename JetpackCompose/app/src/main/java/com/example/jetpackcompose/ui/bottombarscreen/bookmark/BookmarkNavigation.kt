package com.example.jetpackcompose.ui.bottombarscreen.bookmark

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.common.Screen

fun NavController.navigateToBookmark(navOptions: NavOptions? = null) {
    navigate(route = Screen.Bookmark.route, navOptions = navOptions)
}

fun NavGraphBuilder.bookmarkNavigation() {
    composable(route = Screen.Bookmark.route) {
        BookmarkScreen()
    }
}