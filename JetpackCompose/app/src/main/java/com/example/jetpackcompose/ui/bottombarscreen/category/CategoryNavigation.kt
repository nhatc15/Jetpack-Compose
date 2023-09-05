package com.example.jetpackcompose.ui.bottombarscreen.category

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.common.Screen

fun NavController.navigateToCategory(navOptions: NavOptions? = null) {
    navigate(route = Screen.Category.route, navOptions = navOptions)
}

fun NavGraphBuilder.categoryNavigation() {
    composable(route = Screen.Category.route) {
        CategoryScreen()
    }
}