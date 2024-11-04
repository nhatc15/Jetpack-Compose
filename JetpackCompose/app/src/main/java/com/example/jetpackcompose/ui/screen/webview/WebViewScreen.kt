package com.example.jetpackcompose.ui.screen.webview

import android.annotation.SuppressLint
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext

const val LoadingRoute = "loading"
const val AndroidRoute = "android"

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun WebViewScreen() {
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
    WebViewContent(webView = webView, isShowWebView = isShowWebView)
}
