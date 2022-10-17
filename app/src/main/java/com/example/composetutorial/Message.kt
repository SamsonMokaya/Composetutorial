package com.example.composetutorial

import androidx.annotation.DrawableRes

data class Message(
    val author: String,
    val body: String,
    @DrawableRes val profilePicture: Int
)