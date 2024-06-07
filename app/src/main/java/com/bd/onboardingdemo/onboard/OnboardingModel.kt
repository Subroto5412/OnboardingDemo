package com.bd.onboardingdemo.onboard

import androidx.annotation.DrawableRes
import com.bd.onboardingdemo.R

sealed class OnboardingModel(
    @DrawableRes val image: Int,
    val title: String,
    val description: String,
) {

    data object FirstPage : OnboardingModel(
        image = R.drawable.first,
        title = "Your Reading Partner",
        description = "Read as many book as you want, anywhere you want"
    )

    data object SecondPage : OnboardingModel(
        image = R.drawable.second,
        title = "Your Personal Library",
        description = "Organize books in different ways, make your own library"
    )

    data object ThirdPages : OnboardingModel(
        image = R.drawable.third,
        title = "Search and Filter",
        description = "Get any book you want within a simple search across your device"
    )
}