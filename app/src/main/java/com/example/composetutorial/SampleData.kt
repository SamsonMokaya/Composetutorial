package com.example.composetutorial

class SampleData {
    fun getAllMessages():List<Message>{
        return listOf(

            Message(
            "Lexi",
            """Hey, take a look at Jetpack Compose, it's great!
            |It's the Android's modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""".trim(),
            R.drawable.profile_picture
        ),
            Message(
            "Samson",
            """List of Android versions:
            |Android KitKat (API 19)
            |Android Lollipop (API 21)
            |Android Marshmallow (API 23)
            |Android Nougat (API 24)
            |Android Oreo (API 26)
            |Android Pie (API 28)
            |Android 10 (API 29)
            |Android 11 (API 30)
            |Android 12 (API 31)""".trim(),
                R.drawable.download
            ),
            Message(
                "Justin",
                "Test...Test...Test...",
                R.drawable.images
            ),
            Message(
                "Janr",
                "Test...Test...Test...",
                R.drawable.profile_picture
            ),
            Message(
                "Solomon",
                "Test...Test...Test...",
                R.drawable.download
            ),
            Message(
                "Robert",
                "Test...Test...Test...",
                R.drawable.images
            )
        )
    }
}