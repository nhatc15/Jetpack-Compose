package com.example.jetpackcompose.ui.main.component

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.jetpackcompose.R

enum class BottomBarItem(
    val route: String,
    @StringRes val title: Int = R.string.app_name,
    @DrawableRes val icon: Int = R.drawable.ic_launcher_foreground
) {
    Home(ScreenDestination.HOME, R.string.home, R.drawable.ic_home),
    Category(ScreenDestination.CATEGORY, R.string.category, R.drawable.ic_category),
    Bookmark(ScreenDestination.BOOKMARK, R.string.bookmark, R.drawable.ic_bookmark),
    Profile(ScreenDestination.PROFILE, R.string.profile, R.drawable.ic_account)
}
