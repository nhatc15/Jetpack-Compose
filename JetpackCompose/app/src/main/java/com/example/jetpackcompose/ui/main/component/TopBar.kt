package com.example.jetpackcompose.ui.main.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    text: String = "",
    isShowBackButton: Boolean = false,
    textFieldEnable: Boolean = false,
    navigateToSearch: () -> Unit = {},
    backButtonClick: () -> Unit = {},
    focusRequester: FocusRequester = FocusRequester()
) {
    var inputTextValue by remember {
        mutableStateOf(text)
    }
    Row(
        modifier = modifier
            .padding(vertical = 8.dp, horizontal = 8.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (isShowBackButton) {
            IconButton(
                onClick = {
                    backButtonClick()
                },
                modifier = Modifier.align(CenterVertically)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = "Back Button",
                    modifier = Modifier
                        .align(CenterVertically)
                        .padding(horizontal = 8.dp)
                )
            }
        }
        OutlinedTextField(
            value = inputTextValue,
            onValueChange = {
                inputTextValue = it
            },
            enabled = textFieldEnable,
            placeholder = {
                Text(
                    text = stringResource(id = R.string.top_bar_input_text_placeholder),
                    modifier = Modifier.align(CenterVertically)
                )
            },
            leadingIcon = {
                Icon(painter = painterResource(id = R.drawable.ic_search), contentDescription = "")
            },
            maxLines = 1,
            modifier = Modifier
                .align(CenterVertically)
                .weight(1f)
                .focusRequester(focusRequester)
                .clickable {
                    if (!textFieldEnable) {
                        navigateToSearch()
                    }
                }
//                .onFocusChanged {
//                    if (it.hasFocus) {
//                        navigateToSearch()
//                    }
//                }
        )
        IconButton(
            onClick = {},
            modifier = Modifier.align(CenterVertically)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_notifications),
                contentDescription = "Notifications Button",
                modifier = Modifier
                    .align(CenterVertically)
                    .padding(horizontal = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar()
}
