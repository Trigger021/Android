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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chegeapp.ui.theme.ChegeAppTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),) {
        val mcontext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = {
                    Text(
                        text = "HomeScreen",
                        color = Color.White
                        )
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {
                    mcontext.startActivity(Intent(mcontext,MainActivity::class.java))
                })
                {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ })
                {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ })
                {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White
                    )
                }
            }
        )
        // End of TopAppBar
    Text(
        text = "Destination",
        fontSize = 30.sp,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontFamily = FontFamily.Cursive,
        color = Color.White)

    //First Row
    Row {
        Image(painter = painterResource(id = R.drawable.destination1),
            contentDescription = "destination",
            modifier = Modifier.size(width = 200.dp, height = 150.dp),
        )
        Spacer(modifier = Modifier.width(15.dp))
        Column {
            Text(text = "Rome", color = Color.White, fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold)
            Text(text = "Rome is the capital city of Italy. It is also the capital of the Lazio region, the centre of the Metropolitan City of Rome Capital, and a special comune named Comune di Roma", color = Color.White)
        }
    }
    //End of First row
        //Second Row
        Row {
            Image(painter = painterResource(id = R.drawable.destination2),
                contentDescription = "destination",
                modifier = Modifier.size(width = 200.dp, height = 150.dp),
            )
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(text = "Spain", color = Color.White, fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold)
                Text(text = "Rome is the capital city of Italy. It is also the capital of the Lazio region, the centre of the Metropolitan City of Rome Capital, and a special comune named Comune di Roma", color = Color.White)
            }
        }
        //End of Second row
        //Third Row
        Row {
            Image(painter = painterResource(id = R.drawable.destination3),
                contentDescription = "destination",
                modifier = Modifier.size(width = 200.dp, height = 150.dp),
            )
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(text = "Indonesia", color = Color.White, fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold)
                Text(text = "Rome is the capital city of Italy. It is also the capital of the Lazio region, the centre of the Metropolitan City of Rome Capital, and a special comune named Comune di Roma", color = Color.White)
            }
        }
        //End of Third row
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Button(onClick = { mcontext.startActivity(Intent(mcontext,IntentsActivity::class.java)) }, colors = ButtonDefaults.buttonColors(Color.Blue)) {
                Text(text = "NEXT")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}