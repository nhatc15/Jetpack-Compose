package com.example.jetpackcompose.ui.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.ui.main.component.BottomBarItem
import com.example.jetpackcompose.ui.main.component.BottomNavigationBar
import com.example.jetpackcompose.ui.main.component.MainNavHost
import com.example.jetpackcompose.ui.main.component.ScreenDestination
import com.example.jetpackcompose.ui.main.component.TopBar
import com.example.jetpackcompose.ui.screen.search.navigateToSearch

@Composable
fun NavGraph(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = remember {
        derivedStateOf {
            navBackStackEntry?.destination?.route
        }
    }
    val isShowBackButtonInTopBar = remember {
        derivedStateOf {
            currentRoute.value?.contains(ScreenDestination.SEARCH) ?: false
        }
    }
    val isShowTopBar = remember {
        derivedStateOf {
            !(currentRoute.value?.contains(ScreenDestination.WEB_VIEW) ?: true)
        }
    }
    val isNavigationBarVisible = remember {
        derivedStateOf {
            BottomBarItem.entries.toTypedArray().any { it.route == currentRoute.value }
        }
    }
    val focusRequester by remember {
        mutableStateOf(FocusRequester())
    }

    val textFieldEnable = remember {
        derivedStateOf {
            currentRoute.value == ScreenDestination.SEARCH
        }
    }
    LaunchedEffect(navBackStackEntry) {
        if (currentRoute.value == ScreenDestination.SEARCH) {
            focusRequester.requestFocus()
        }
    }
    Scaffold(
        topBar = {
            if (isShowTopBar.value) {
                TopBar(
                    isShowBackButton = isShowBackButtonInTopBar.value,
                    focusRequester = focusRequester,
                    textFieldEnable = textFieldEnable.value,
                    navigateToSearch = { navController.navigateToSearch() },
                    backButtonClick = {
                        navController.popBackStack()
                    }
                )
            }
        },
        bottomBar = {
            if (isNavigationBarVisible.value) {
                BottomNavigationBar(navController = navController)
            }
        },
        modifier = modifier
    ) { padding ->
        MainNavHost(
            modifier = Modifier.padding(padding),
            navController = navController
        )
    }
}
