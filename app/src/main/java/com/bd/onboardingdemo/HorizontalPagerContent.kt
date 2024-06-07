package com.bd.onboardingdemo

import androidx.annotation.DrawableRes

data class HorizontalPagerContent(
    val title: String,
    @DrawableRes val res: Int,
    val desc: String
)

val listData = listOf(
        HorizontalPagerContent("Verified", R.drawable.first,"Verification is an extra or final bit of proof that establishes something is true"),
        HorizontalPagerContent("Make it simple", R.drawable.second,"We pay attention to all of your payments and find way for saving your money"),
        HorizontalPagerContent("New Banking", R.drawable.third,"Free Advisory service,mobile banking application,visa"),
        HorizontalPagerContent("Verified", R.drawable.fourth,"Bank your life,We create something new you have never seen before")
    )