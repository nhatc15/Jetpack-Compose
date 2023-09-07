package com.example.jetpackcompose.ui.bottombarscreen.category

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.common.Screen

fun NavGraphBuilder.categoryNavigation(navigateToSearchScreen: () -> Unit) {
    composable(route = Screen.Category.route) {
        CategoryScreen(navigateToSearchScreen = { navigateToSearchScreen() })
    }
}
