package com.example.jetpackcompose.ui.screen.webview

import android.webkit.WebView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun WebViewContent(
    modifier: Modifier = Modifier,
    webView: WebView,
    isShowWebView: Boolean
) {
    val webViewNavController = rememberNavController()
    NavHost(
        navController = webViewNavController,
        startDestination = LoadingRoute,
        modifier = modifier
    ) {
        composable(route = LoadingRoute) {
            LoadingScreen()
        }
        composable(route = AndroidRoute) {
            AndroidView(
                modifier = Modifier.fillMaxSize(),
                factory = { context ->
                    webView
                }
            )
        }
    }
    if (isShowWebView) {
        webViewNavController.navigate(route = AndroidRoute) {
            popUpTo(LoadingRoute) {
                inclusive = true
            }
        }
    }
}
