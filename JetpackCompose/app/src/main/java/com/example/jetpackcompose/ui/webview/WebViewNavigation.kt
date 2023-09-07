package com.example.jetpackcompose.ui.webview

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.common.Screen

fun NavController.navigateToWebView() {
    navigate(route = Screen.WebView.route) {
        popUpTo(LoadingRoute) {
            saveState = true
        }
    }
}

fun NavGraphBuilder.webViewNavigation(
    backButtonClick: () -> Unit,
    navigateToSearchScreen: () -> Unit
) {
    composable(route = Screen.WebView.route) {
        WebViewScreen(
            handlerBackClick = { backButtonClick() },
            navigateToSearchScreen = { navigateToSearchScreen() }
        )
    }
}
