package com.example.jetpackcompose.ui.main.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.jetpackcompose.ui.bottombarscreen.bookmark.bookmarkNavigation
import com.example.jetpackcompose.ui.bottombarscreen.category.categoryNavigation
import com.example.jetpackcompose.ui.bottombarscreen.home.homeNavigation
import com.example.jetpackcompose.ui.bottombarscreen.profile.profileNavigation
import com.example.jetpackcompose.ui.screen.search.navigateToSearch
import com.example.jetpackcompose.ui.screen.search.searchNavigation
import com.example.jetpackcompose.ui.screen.webview.navigateToWebView
import com.example.jetpackcompose.ui.screen.webview.webViewNavigation

@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = BottomBarItem.Home.route
    ) {
        homeNavigation(
            navigateToWebViewScreen = { navController.navigateToWebView() }
        )
        categoryNavigation()
        searchNavigation()
        bookmarkNavigation()
        profileNavigation()
        webViewNavigation()
    }
}
