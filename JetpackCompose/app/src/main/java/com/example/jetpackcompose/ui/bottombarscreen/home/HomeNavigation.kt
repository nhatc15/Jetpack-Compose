package com.example.jetpackcompose.ui.bottombarscreen.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.common.Screen

fun NavController.navigateToHome(navOptions: NavOptions? = null) {
    navigate(route = Screen.Home.route, navOptions = navOptions)
}

fun NavGraphBuilder.homeNavigation(navigateToSearchScreen: () -> Unit) {
    composable(route = Screen.Home.route) {
        HomeScreen(navigateToSearchScreen = { navigateToSearchScreen() })
    }
}