package com.example.jetpackcompose.ui.bottombarscreen.profile

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.main.component.BottomBarItem

fun NavGraphBuilder.profileNavigation() {
    composable(route = BottomBarItem.Profile.route) {
        ProfileScreen()
    }
}
