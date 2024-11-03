package com.example.jetpackcompose.ui.webview

import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.jetpackcompose.ui.main.component.TopBar

const val LoadingRoute = "loading"
const val AndroidRoute = "android"

@Composable
fun WebViewScreen(
    modifier: Modifier = Modifier,
    handlerBackClick: () -> Unit,
    navigateToSearchScreen: () -> Unit
) {
    val context = LocalContext.current
    var isShowWebView by rememberSaveable {
        mutableStateOf(false)
    }
    val webView = WebView(context).apply {
        settings.apply {
            javaScriptEnabled = true
            allowContentAccess = true
        }
        layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                isShowWebView = true
            }
        }
        loadUrl("https://www.google.com/")
    }

    Column(modifier) {
        TopBar(
            isShowBackButton = true,
            backButtonClick = {
                if (webView.canGoBack()) {
                    webView.goBack()
                } else {
                    handlerBackClick()
                }
            },
            navigateToSearch = { navigateToSearchScreen() }
        )
        WebViewContent(webView = webView, isShowWebView = isShowWebView)
    }
}
