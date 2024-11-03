package com.example.jetpackcompose.ui.bottombarscreen.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.common.Screen

fun NavGraphBuilder.homeNavigation(
    navigateToSearchScreen: () -> Unit,
    navigateToWebViewScreen: () -> Unit
) {
    composable(route = Screen.Home.route) {
        HomeScreen(
            navigateToSearchScreen = { navigateToSearchScreen() },
            navigateToWebViewScreen = { navigateToWebViewScreen() }
        )
    }
}
