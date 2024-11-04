package com.example.jetpackcompose.ui.screen.webview

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.jetpackcompose.ui.main.component.ScreenDestination

fun NavController.navigateToWebView() {
    navigate(route = ScreenDestination.WEB_VIEW) {
        popUpTo(LoadingRoute) {
            saveState = true
        }
    }
}

fun NavGraphBuilder.webViewNavigation(
    backButtonClick: () -> Unit,
    navigateToSearchScreen: () -> Unit
) {
    composable(route = ScreenDestination.WEB_VIEW) {
        WebViewScreen(
            handlerBackClick = { backButtonClick() },
            navigateToSearchScreen = { navigateToSearchScreen() }
        )
    }
}
