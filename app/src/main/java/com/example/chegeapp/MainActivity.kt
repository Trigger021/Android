package com.example.chegeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.chegeapp.ui.theme.ChegeAppTheme
import com.example.chegeapp.ui.theme.purple

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()
        }
    }
}

@Composable
fun Demo(){
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())
        )
    { val mContext = LocalContext.current
        Text(
            text = "Welcome to ANDROID",
            fontSize = 30.sp,
            color = Color.Cyan,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline
            )
        Text(text = "ERR_CONNECTION_TIMED_OUT")
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center,
        ){
            //Lottie Animation
            val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.welcome))
            val progress by animateLottieCompositionAsState(composition)
            LottieAnimation(composition, progress,
                modifier = Modifier.size(300.dp)
            )
            //End of lottie animation

        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Types of cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .height(30.dp),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold
            )
        Text(text = "1.Subaru")
        Text(text = "2.Mercedes")
        Text(text = "3.Audi")
        Text(text = "4.Mazda")
        Text(text = "5.Toyota")
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Button(onClick = { mContext.startActivity(Intent(mContext , ExploreActivity::class.java)) }, colors = ButtonDefaults.buttonColors(Color.Blue)) {
                Text(text = "See more cars")
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Types Of Music",
            modifier =
            Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .height(20.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight(500),
            color = Color.White,
            )
        Text(text = "1. Trap")
        Text(text = "2. Hiphop")
        Text(text = "3. Jazz")
        Text(text = "4. Afro beats")
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
            )
        {
            Button(onClick = {
                             mContext.startActivity(Intent(mContext, DestinationActivity::class.java))
            },
                shape = RoundedCornerShape(7.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                Text(text = "Destinations")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Divider()
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "eMobilis Mobile training institute",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
            )
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        )
        {
            Image(
                painter = painterResource(id = R.drawable.hotel2) ,
                contentDescription = "a dog",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
        }
        Button(onClick = {
                         mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(purple),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp, end = 50.dp)
            ) {
            Text(text = "Continue")
        }
        Row {
            Button(onClick = {
                mContext.startActivity(Intent(mContext, LottieActivity::class.java))
            },
                shape = RoundedCornerShape(7.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ) {
                Text(text = "Lottie")
            }
            Spacer(modifier = Modifier.width(5.dp))
            Button(onClick = {
                mContext.startActivity(Intent(mContext, DawgActivity::class.java))
            },
                shape = RoundedCornerShape(7.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            ) {
                Text(text = "Dawg")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}