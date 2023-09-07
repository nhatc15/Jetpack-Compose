package com.example.jetpackcompose.ui.main.component

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.jetpackcompose.ui.common.Screen

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        Screen.Home,
        Screen.Category,
        Screen.Bookmark,
        Screen.Profile
    )
    BottomNavigation(
        backgroundColor = MaterialTheme.colorScheme.primary,
        contentColor = Color.Black
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        var rootStack by remember {
            mutableStateOf(Screen.Home.route)
        }
        if (items.any { it.route == currentRoute.toString() }) {
            rootStack = currentRoute.toString()
        }
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painter = painterResource(id = item.icon), contentDescription = "") },
                label = {
                    Text(
                        text = stringResource(id = item.title),
                        fontSize = 9.sp,
                        color = Color.White
                    )
                },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = false,
                selected = rootStack == item.route,
                onClick = {
                    rootStack = item.route
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { screenRoute ->
                            popUpTo(screenRoute) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
