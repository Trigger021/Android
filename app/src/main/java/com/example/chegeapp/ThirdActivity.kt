package com.example.chegeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chegeapp.ui.theme.ChegeAppTheme
import com.example.chegeapp.ui.theme.lime
import com.example.chegeapp.ui.theme.purple

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Third()
        }
    }
}

@Composable
fun Third(){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val mContext = LocalContext.current
        Box(contentAlignment = Alignment.TopCenter){
            Image(
                painter = painterResource(id = R.drawable.hotel2) ,
                contentDescription = "a dog",
                modifier = Modifier
                    .size(300.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(25.dp))
        Text(
            text = "Pay by Cart",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 35.sp,
            fontFamily = FontFamily.Default,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "An ecommerce app allows users to shop online, browse product catalogs, create wish lists, add items to a cart, and complete purchases.",
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            color = Color.Gray,
            fontStyle = FontStyle.Normal
        )
        Spacer(modifier = Modifier.height(25.dp))
        Button(onClick = {
            mContext.startActivity(Intent(mContext,FurnitureActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(lime),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp, end = 50.dp)
        ) {
            Text(text = "Get Started")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ThirdActivityPreview (){
    Third()
}