package com.example.jetpackcompose.ui.main.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.jetpackcompose.ui.bottombarscreen.bookmark.bookmarkNavigation
import com.example.jetpackcompose.ui.bottombarscreen.category.categoryNavigation
import com.example.jetpackcompose.ui.common.Screen
import com.example.jetpackcompose.ui.bottombarscreen.home.homeNavigation
import com.example.jetpackcompose.ui.bottombarscreen.profile.profileNavigation
import com.example.jetpackcompose.ui.search.navigateToSearch
import com.example.jetpackcompose.ui.search.searchNavigation

@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        homeNavigation(navigateToSearchScreen = { navController.navigateToSearch() })
        categoryNavigation(navigateToSearchScreen = { navController.navigateToSearch() })
        searchNavigation(backButtonClick = { navController.popBackStack() })
        bookmarkNavigation(navigateToSearchScreen = { navController.navigateToSearch() })
        profileNavigation(navigateToSearchScreen = { navController.navigateToSearch() })
    }
}