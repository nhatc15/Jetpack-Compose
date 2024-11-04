package com.example.jetpackcompose.ui.screen.search

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.main.component.ScreenDestination

fun NavController.navigateToSearch(navOptions: NavOptions? = null) {
    navigate(route = ScreenDestination.SEARCH, navOptions = navOptions)
}

fun NavGraphBuilder.searchNavigation() {
    composable(route = ScreenDestination.SEARCH) {
        SearchScreen()
    }
}
