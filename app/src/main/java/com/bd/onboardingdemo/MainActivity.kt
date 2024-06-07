package com.bd.onboardingdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.bd.onboardingdemo.ui.theme.OnboardingDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OnboardingDemoTheme {

            }
        }
    }
}

@Composable
fun IntroScreen(){
//    val pagerState = rememberPagerState()
//    val list = getList()

//    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
//        Box(modifier = Modifier.fillMaxHeight(.75f).fillMaxWidth()){
//
//
//        }
//    }

}