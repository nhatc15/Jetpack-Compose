package com.example.jetpackcompose.ui.search

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.common.Screen

fun NavController.navigateToSearch(navOptions: NavOptions? = null) {
    navigate(route = Screen.Search.route, navOptions = navOptions)
}

fun NavGraphBuilder.searchNavigation(backButtonClick: () -> Unit) {
    composable(route = Screen.Search.route) {
        SearchScreen(handlerBackClick = { backButtonClick() })
    }
}