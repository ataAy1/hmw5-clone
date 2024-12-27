package com.hmw5.clone.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hmw5.clone.R
import com.hmw5.clone.model.ImageIndirim

@Composable
fun DiscountList(imageIndirimList: List<ImageIndirim>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(2.dp)
    ) {

        Text(
            text = "İndirimli Ürünler",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.DarkGray,
            modifier = Modifier.padding(bottom = 8.dp, start = 8.dp)
        )

        imageIndirimList.forEach { item ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp, top = 6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // First column (Image)
                Box(
                    modifier = Modifier
                        .weight(0.3f)
                        .height(100.dp)
                        .clip(RoundedCornerShape(16.dp))
                ) {
                    Image(
                        painter = painterResource(id = item.imageResourceId),
                        contentDescription = "Product Image",
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(5.dp)
                            .clip(RoundedCornerShape(16.dp))
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(0.7f)
                        .padding(start = 6.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = item.imageName,
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.DarkGray,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(bottom = 4.dp)
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Image(
                            painter = painterResource(id = R.drawable.ic_hmw_41),
                            contentDescription = "Favorite Icon",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(start = 2.dp, bottom = 4.dp)
                        )
                    }

                    Text(
                        text = item.price,
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.Gray,
                        modifier = Modifier.padding(bottom = 6.dp)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = item.timeIconResourceId),
                                contentDescription = "Time Icon",
                                modifier = Modifier.size(16.dp)
                            )
                            Text(
                                text = item.time,
                                style = MaterialTheme.typography.bodySmall,
                                color = Color.Gray,
                                fontSize = 12.sp
                            )
                        }

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = item.priceIconResourceId),
                                contentDescription = "Price Icon",
                                modifier = Modifier.size(18.dp)
                            )
                            Text(
                                text = item.free,
                                style = MaterialTheme.typography.bodySmall,
                                color = Color.Red,
                                modifier = Modifier.padding(end = 120.dp)

                            )
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier
                            .padding(top = 4.dp)
                            .background(
                                Color(0xFFF6F6F6),
                                shape = RoundedCornerShape(16.dp)
                            )
                            .clip(RoundedCornerShape(16.dp))
                            .width(200.dp)
                            .padding(horizontal = 0.dp, vertical = 2.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_hmw_46),
                            contentDescription = "Badge Icon",
                            modifier = Modifier.size(22.dp)
                                .padding(bottom = 4.dp)
                        )
                        Spacer(modifier = Modifier.width(2.dp))
                        Text(
                            text = "550₺'ye 50₺ indirim",
                            fontSize = 13.sp,
                            style = MaterialTheme.typography.bodyMedium.copy(color = Color.Black),
                            modifier = Modifier.fillMaxWidth()
                        )
                    }

                }
            }
        }
    }
}
