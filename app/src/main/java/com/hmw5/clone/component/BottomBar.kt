package com.hmw5.clone.component

import androidx.compose.foundation.indication
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.hmw5.clone.R

@Composable
fun BottomNavigationBar() {
    var selectedItem by remember { mutableStateOf(0) }


    NavigationBar(
        modifier = Modifier.height(70.dp),
        containerColor = Color.White,
    ) {
        val navItems = listOf(
            Pair(R.drawable.ic_eat, "Yemek"),
            Pair(R.drawable.ic_shop, "Mahalle"),
            Pair(R.drawable.ic_ara, "Arama"),
            Pair(R.drawable.ic_user, "Hesabım")
        )

        navItems.forEachIndexed { index, (iconResourceId, label) ->
            val isSelected = selectedItem == index

            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(id = iconResourceId),
                        contentDescription = label,
                        tint = if (isSelected) Color.Red else Color.Gray,
                        modifier = Modifier
                            .size(28.dp)
                            .padding(top = 4.dp)
                    )
                },
                label = {
                    Text(
                        text = label,
                        color = if (isSelected) Color.Red else Color.Black,
                        fontSize = 12.sp
                    )
                },
                selected = isSelected,
                onClick = {
                    selectedItem = index
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.White,
                    unselectedIconColor = Color.White,
                    selectedTextColor = Color.White,
                    unselectedTextColor = Color.White,
                    indicatorColor = Color.Transparent

                )
            )
        }
    }
}
