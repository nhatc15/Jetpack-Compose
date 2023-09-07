package com.example.jetpackcompose.ui.search

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import com.example.jetpackcompose.ui.main.component.TopBar

@Composable
fun SearchScreen(
    handlerBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val focusRequester by remember {
        mutableStateOf(FocusRequester())
    }
    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    }
    Column(modifier = modifier) {
        TopBar(
            focusRequester = focusRequester,
            isShowBackButton = true,
            textFieldEnable = true,
            backButtonClick = { handlerBackClick() }
        )
        Text(text = "Search Screen")
    }
}
