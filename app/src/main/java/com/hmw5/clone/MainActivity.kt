package com.hmw5.clone

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.privacysandbox.tools.core.model.Type
import com.hmw5.clone.component.BottomNavigationBar
import com.hmw5.clone.component.CategoryDisplay
import com.hmw5.clone.component.DiscountList
import com.hmw5.clone.component.MainScreen
import com.hmw5.clone.component.PopularList
import com.hmw5.clone.component.SearchBar
import com.hmw5.clone.component.TopRowScreen
import com.hmw5.clone.model.ImageIndirim
import com.hmw5.clone.model.ImageItem
import com.hmw5.clone.model.ImageItemMahalle
import com.hmw5.clone.ui.theme.Hmw5Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Hmw5Theme {
                val imageItems = listOf(
                    ImageItem(R.drawable.ic_hmw_1, "Market"),
                    ImageItem(R.drawable.ic_hmw_2, "Su"),
                    ImageItem(R.drawable.ic_hmw_3, "Kasap"),
                    ImageItem(R.drawable.ic_hmw_4, "Manav"),
                    ImageItem(R.drawable.ic_hmw_5, "Pet Shop"),
                    ImageItem(R.drawable.ic_hmw_6, "Kuru Yemiş"),
                    ImageItem(R.drawable.ic_hmw_7, "Şarküteri"),
                    ImageItem(R.drawable.ic_hmw_45, "Tümüne Bak ")
                )

                val itemsMahalle = listOf(
                    ImageItemMahalle(
                        imageResourceId = R.drawable.ic_hmw_26,
                        iconResourceId = R.drawable.ic_hmw_13,
                        iconText = "Ücretsiz",
                        imageName = "Hayat Su",
                        time = "10-25 DK"
                    ),
                    ImageItemMahalle(
                        imageResourceId = R.drawable.ic_hmw_25,
                        iconResourceId = R.drawable.ic_hmw_14,
                        iconText = "Fırsat",
                        imageName = "Happy Center",
                        time = "1 SAAT"
                    ),
                    ImageItemMahalle(
                        imageResourceId = R.drawable.ic_hmw_23,
                        iconResourceId = R.drawable.ic_hmw_13,
                        iconText = "Ücretsiz",
                        imageName = "Onur Market",
                        time = "15-30 DK"
                    ),
                    ImageItemMahalle(
                        imageResourceId = R.drawable.ic_hmw_24,
                        iconResourceId = R.drawable.ic_hmw_14,
                        iconText = "Fırsat",
                        imageName = "KİM Market",
                        time = "20-35 DK"
                    )
                )

                val itemIndirim = listOf(
                    ImageIndirim(
                        imageResourceId = R.drawable.ic_hmw_19,
                        imageName = "Köyüm Yufka",
                        price = "Minumum 1,000,00 TL",
                        time = "10-25 DK",
                        timeIconResourceId = R.drawable.ic_hmw_16,
                        free = "Ücretsiz",
                        priceIconResourceId = R.drawable.ic_hmw_13
                    ),
                    ImageIndirim(
                        imageResourceId = R.drawable.ic_hmw_15,
                        imageName = "Petkatalog Pet Shop",
                        price = "Minumum 150 TL",
                        time = "30-45 DK",
                        timeIconResourceId = R.drawable.ic_hmw_16,
                        free = "Ücretsiz",
                        priceIconResourceId = R.drawable.ic_hmw_13
                    ),
                    ImageIndirim(
                        imageResourceId = R.drawable.ic_hmw_17,
                        imageName = "Manav",
                        price = "Minumum 150 TL",
                        time = "20-30 DK",
                        timeIconResourceId = R.drawable.ic_hmw_16,
                        free = "Ücretsiz",
                        priceIconResourceId = R.drawable.ic_hmw_13
                    ),
                    ImageIndirim(
                        imageResourceId = R.drawable.ic_hmw_18,
                        imageName = "Pet",
                        price = "Minumum 1,500,00 TL",
                        time = "1 SAAT",
                        timeIconResourceId = R.drawable.ic_hmw_16,
                        free = "Ücretsiz",
                        priceIconResourceId = R.drawable.ic_hmw_13
                    )
                )

                val navController = rememberNavController()

                Scaffold(
                    bottomBar = {
                        BottomNavigationBar()
                    }
                ) { paddingValues ->
                    MainScreen(
                        imageItems = imageItems,
                        imageItemMahalle = itemsMahalle,
                        imageIndirim = itemIndirim,
                        paddingValues = paddingValues

                    )
                }
            }
        }
    }
}

