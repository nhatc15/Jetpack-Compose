package com.example.jetpackcompose.ui.bottombarscreen.profile

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.common.Screen

fun NavGraphBuilder.profileNavigation(navigateToSearchScreen: () -> Unit) {
    composable(route = Screen.Profile.route) {
        ProfileScreen(navigateToSearchScreen = { navigateToSearchScreen() })
    }
}
