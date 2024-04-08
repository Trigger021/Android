package com.example.chegeapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.chegeapp.ui.theme.ChegeAppTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySplash()

            val mContext = LocalContext.current
            val coroutine = rememberCoroutineScope()
            coroutine.launch {
                delay(3000)
                mContext.startActivity(Intent(mContext,FirstActivity::class.java))
                finish()
            }
        }
    }
}

@Composable
fun MySplash(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .paint(
                painterResource(id = R.drawable.backgrounds1),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        //Lottie Animation
        val compositions by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.splash))
        val progresse by animateLottieCompositionAsState(compositions)
        LottieAnimation(compositions, progresse,
            modifier = Modifier.size(100.dp)
        )
        //End of lottie animation
        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.welcome))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(250.dp)
        )
        //End of lottie animation
        Spacer(modifier = Modifier.height(250.dp))
        Text(
            text = "Created by Trigger Enterprise",
            fontSize = 15.sp,
            fontWeight = FontWeight.Black,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Serif
            )
    }
}

@Preview(showBackground = true)
@Composable
fun MySplashPreview(){
    MySplash()
}