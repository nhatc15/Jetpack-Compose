package com.example.jetpackcompose.ui.bottombarscreen.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.main.component.BottomBarItem

fun NavGraphBuilder.homeNavigation(
    navigateToWebViewScreen: () -> Unit
) {
    composable(route = BottomBarItem.Home.route) {
        HomeScreen(
            navigateToWebViewScreen = { navigateToWebViewScreen() }
        )
    }
}
