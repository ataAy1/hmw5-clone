package com.hmw5.clone.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.hmw5.clone.R

@Composable
fun TopRowScreen() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(top = 22.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val icon = R.drawable.ic_hmw_location


        Image(
            painter = painterResource(id = icon),
            contentDescription = "Address Type",
            modifier = Modifier
                .size(26.dp)
                .padding(start = 4.dp)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(top = 4.dp)
        ) {
            Text(
                text = "Ev",
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "Gül Mahallesi, Çicek Caddesi Daire 17 ",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray,
                modifier = Modifier.padding(end = 8.dp)
            )

        }

        Spacer(modifier = Modifier.width(8.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconButton(onClick = {  }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_hmw_44),
                    contentDescription = "Favorite Icon",
                    modifier = Modifier
                        .size(62.dp)
                        .padding(start = 10.dp)
                )
            }

            IconButton(onClick = {}) {
                Image(
                    painter = painterResource(id = R.drawable.ic_hmw_42),
                    contentDescription = "Basket Icon",
                    modifier = Modifier
                        .size(62.dp)
                        .padding(end = 10.dp)
                )
            }
        }
    }

}