package com.example.composetutorial

import androidx.compose.material.Text

class SampleData {
    fun getAllMessages():List<Message>{
        return listOf(

            Message(
            "Abby",
            """Hey, take a look at Jetpack Compose, it's great!
            |It's the Android's modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""",
            R.drawable.profile_picture
        ),
            Message(
            "Samson",
            ("Jetpack Compose is a modern toolkit for building native Android UI." +
                    "Jetpack Compose is a modern toolkit for building native Android UI.").trim(),
                R.drawable.download
            ),
            Message(
                "Justin",
                ("Jetpack Compose is a modern toolkit for building native Android UI." +
                        "Jetpack Compose is a modern toolkit for building native Android UI.").trim(),
                R.drawable.images
            ),
            Message(
                "Abby",
                """Hey, take a look at Jetpack Compose, it's great!
            |It's the Android's modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""",
                R.drawable.profile_picture
            ),
            Message(
                "Samson",
                ("Jetpack Compose is a modern toolkit for building native Android UI." +
                        "Jetpack Compose is a modern toolkit for building native Android UI.").trim(),
                R.drawable.download
            ),
            Message(
                "Justin",
                ("Jetpack Compose is a modern toolkit for building native Android UI." +
                        "Jetpack Compose is a modern toolkit for building native Android UI.").trim(),
                R.drawable.images
            ),
            Message(
                "Abby",
                """Hey, take a look at Jetpack Compose, it's great!
            |It's the Android's modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""",
                R.drawable.profile_picture
            ),
            Message(
                "Samson",
                ("Jetpack Compose is a modern toolkit for building native Android UI." +
                        "Jetpack Compose is a modern toolkit for building native Android UI.").trim(),
                R.drawable.download
            ),
            Message(
                "Justin",
                ("Jetpack Compose is a modern toolkit for building native Android UI." +
                        "Jetpack Compose is a modern toolkit for building native Android UI.").trim(),
                R.drawable.images
            ),

        )
    }
}