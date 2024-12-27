package com.hmw5.clone.model


data class ImageIndirim(

    val imageResourceId: Int,
    val imageName: String,
    val price: String,

    val time: String,
    val timeIconResourceId: Int,

    val free: String,
    val priceIconResourceId: Int
)
