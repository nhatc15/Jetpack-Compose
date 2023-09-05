package com.example.jetpackcompose.ui.bottombarscreen.profile

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.common.Screen

fun NavController.navigateToProfile(navOptions: NavOptions? = null) {
    navigate(route = Screen.Profile.route, navOptions = navOptions)
}

fun NavGraphBuilder.profileNavigation(navigateToSearchScreen: () -> Unit) {
    composable(route = Screen.Profile.route) {
        ProfileScreen(navigateToSearchScreen = { navigateToSearchScreen() })
    }
}