package com.example.jetpackcompose.ui.common

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.jetpackcompose.R

sealed class Screen(
    val route: String,
    @StringRes val title: Int = R.string.app_name,
    @DrawableRes val icon: Int = R.drawable.ic_launcher_foreground
) {
    object Home : Screen("home", R.string.home, R.drawable.ic_home)
    object Category : Screen("category", R.string.category, R.drawable.ic_category)
    object Bookmark : Screen("bookmark", R.string.bookmark, R.drawable.ic_bookmark)
    object Profile : Screen("profile", R.string.profile, R.drawable.ic_account)
    object Search : Screen("search")
    object WebView : Screen("webView")
}