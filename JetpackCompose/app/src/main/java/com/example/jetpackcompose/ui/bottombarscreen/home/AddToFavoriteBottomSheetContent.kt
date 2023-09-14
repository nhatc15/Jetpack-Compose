package com.example.jetpackcompose.ui.bottombarscreen.home

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import java.net.URL

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AddToFavoriteBottomSheetContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        var color by remember {
            mutableStateOf(colorList[0].name)
        }
        Divider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color.LightGray
        )
        Row(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(
                text = "Color",
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = color,
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.onBackground,
            )
        }
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            maxItemsInEachRow = 9,
            modifier = Modifier.padding(horizontal = 16.dp).fillMaxWidth()
        ) {
            colorList.forEach { item ->
                ColorListItem(item = item,
                    isSelected = item.name == color,
                    onClick = {
                        color = item.name
                    }
                )
            }
        }
        Divider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color.LightGray
        )
        Filter()
        Divider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color.LightGray
        )
        Filter()
        Divider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color.LightGray
        )
        Filter()
        Divider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color.LightGray
        )
    }
}

@Composable
fun Filter(
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        Text(
            text = "Type",
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            modifier = Modifier.weight(1f).align(Alignment.CenterVertically)
        )
        Text(
            text = "Have 2 type",
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.onPrimaryContainer,
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color.LightGray,
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(8.dp)
        )
    }
}

@Composable
fun ColorListItem(
    modifier: Modifier = Modifier, item: ColorImage, isSelected: Boolean, onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .clickable { onClick() }
            .size(35.dp)
            .border(
                shape = CircleShape, width = 1.dp, color = if (isSelected) {
                    Color.Black
                } else {
                    Color.LightGray
                }
            )
    ) {
        Box(
            modifier = Modifier
                .size(30.dp)
                .clip(shape = CircleShape)
                .padding(2.dp)
                .align(Alignment.Center)
        ) {
            AsyncImage(
                model = ImageRequest
                    .Builder(LocalContext.current)
                    .data(item.url.toString())
                    .crossfade(true).build(),
                contentDescription = item.name,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = CircleShape)
                    .align(Alignment.Center)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    AddToFavoriteBottomSheetContent()
}

data class ColorImage(
    val name: String, val url: URL
)

val colorList = listOf(
    ColorImage(
        name = "Yellow",
        url = URL("https://www.nitori-net.jp/ecstatic/image/sys-master/images/8966164480030/BasicColor_YE.jpg")
    ),
    ColorImage(
        name = "Orange",
        url = URL("https://www.nitori-net.jp/ecstatic/image/sys-master/images/8966163464222/BasicColor_OR.jpg")
    ),
    ColorImage(
        name = "Light Green",
        url = URL("https://www.nitori-net.jp/ecstatic/image/sys-master/images/8796340551710/BasicColor_LGreen.jpg")
    ),
    ColorImage(
        name = "PI",
        url = URL("https://www.nitori-net.jp/ecstatic/image/sys-master/images/8966163496990/BasicColor_PI.jpg")
    ),
    ColorImage(
        name = "RE",
        url = URL("https://www.nitori-net.jp/ecstatic/image/sys-master/images/8966164152350/BasicColor_RE.jpg")
    ),
    ColorImage(
        name = "PU",
        url = URL("https://www.nitori-net.jp/ecstatic/image/sys-master/images/8966163660830/BasicColor_PU.jpg")
    ),
    ColorImage(
        name = "TBL",
        url = URL("https://www.nitori-net.jp/ecstatic/image/sys-master/images/8796350873630/BasicColor_TBL.jpg")
    ),
    ColorImage(
        name = "NAV",
        url = URL("https://www.nitori-net.jp/ecstatic/image/sys-master/images/8965482807326/BasicColor_NAV.jpg")
    ),
    ColorImage(
        name = "GR",
        url = URL("https://www.nitori-net.jp/ecstatic/image/sys-master/images/8965479759902/BasicColor_GR.jpg")
    ),
)
