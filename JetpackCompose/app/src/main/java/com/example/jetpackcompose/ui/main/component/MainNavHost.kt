package com.example.jetpackcompose.ui.main.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.jetpackcompose.ui.bottombarscreen.bookmark.bookmarkNavigation
import com.example.jetpackcompose.ui.bottombarscreen.category.categoryNavigation
import com.example.jetpackcompose.ui.bottombarscreen.home.homeNavigation
import com.example.jetpackcompose.ui.bottombarscreen.profile.profileNavigation
import com.example.jetpackcompose.ui.common.Screen
import com.example.jetpackcompose.ui.search.navigateToSearch
import com.example.jetpackcompose.ui.search.searchNavigation
import com.example.jetpackcompose.ui.webview.navigateToWebView
import com.example.jetpackcompose.ui.webview.webViewNavigation

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
        homeNavigation(
            navigateToSearchScreen = { navController.navigateToSearch() },
            navigateToWebViewScreen = { navController.navigateToWebView() }
        )
        categoryNavigation(navigateToSearchScreen = { navController.navigateToSearch() })
        searchNavigation(backButtonClick = { navController.popBackStack() })
        bookmarkNavigation(navigateToSearchScreen = { navController.navigateToSearch() })
        profileNavigation(navigateToSearchScreen = { navController.navigateToSearch() })
        webViewNavigation(
            backButtonClick = { navController.popBackStack() },
            navigateToSearchScreen = { navController.navigateToSearch() }
        )
    }
}
