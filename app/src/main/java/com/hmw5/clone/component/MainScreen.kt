package com.hmw5.clone.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hmw5.clone.model.ImageIndirim
import com.hmw5.clone.model.ImageItem
import com.hmw5.clone.model.ImageItemMahalle

@Composable
fun MainScreen(
    imageItems: List<ImageItem>,
    imageItemMahalle: List<ImageItemMahalle>,
    imageIndirim: List<ImageIndirim>,
    paddingValues: PaddingValues

) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(2.dp, bottom = 40.dp)
    ) {
        item {
            TopRowScreen()
        }

        item {
            Spacer(modifier = Modifier.height(4.dp))
        }

        item {
            SearchBar()
        }

        item {
            Spacer(modifier = Modifier.height(2.dp))
        }

        item {
            CategoryDisplay(imageItems = imageItems)
        }

        item {
            PopularList(imageItemMahalle = imageItemMahalle)
        }

        item {
            DiscountList(imageIndirimList = imageIndirim)
        }
    }

}
