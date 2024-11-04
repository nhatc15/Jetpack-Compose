package com.example.jetpackcompose.ui.bottombarscreen.category

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.main.component.BottomBarItem

fun NavGraphBuilder.categoryNavigation() {
    composable(route = BottomBarItem.Category.route) {
        CategoryScreen()
    }
}
