package com.example.chegeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton

import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class DawgActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Dawg()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dawg(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
    ) {
        val mContext = LocalContext.current
        TopAppBar(title = {
            Box (
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.pawprint),
                        contentDescription = "Paw",
                        modifier = Modifier.size(50.dp)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = "Woof",
                        fontWeight = FontWeight.Bold,
                        fontSize = 36.sp,
                        fontFamily = FontFamily.Serif
                    )
                }
            } },
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                })
                {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.Black
                    )
                }
            }
        )
        // First Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog1),
                        contentDescription = "Koda",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "Koda",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                            )
                        Text(text = "2 years old")
                    }
                }
            }

        }
        //End of First Row
        Spacer(modifier = Modifier.height(10.dp))
        // Second Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog2),
                        contentDescription = "Lola",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "Lola",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "16 years old")
                    }
                }
            }
        }
        //End of Second row
        Spacer(modifier = Modifier.height(10.dp))
        // Third Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog3),
                        contentDescription = "Frankie",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "Frankie",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "2 years old")
                    }
                }
            }
        }
        //End of third Row
        Spacer(modifier = Modifier.height(10.dp))
        // Fourth Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog4),
                        contentDescription = "Nox",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "Nox",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "8 years old")
                    }
                }
            }
        }
        //End of Fourth row
        Spacer(modifier = Modifier.height(10.dp))
        // Fifth Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog5),
                        contentDescription = "Faye",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "Faye",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "8 years old")
                    }
                }
            }
        }
        //End of Fifth row
        Spacer(modifier = Modifier.height(10.dp))
        // Sixth Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog6),
                        contentDescription = "Bella",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "Bella",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "14 years old")
                    }
                }
            }
        }
        //End of sixth Row
        Spacer(modifier = Modifier.height(10.dp))
        // Seventh Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog7),
                        contentDescription = "Moana",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "Moana",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "2 years old")
                    }
                }
            }
        }
        // end of seventh row
        Spacer(modifier = Modifier.height(10.dp))
        // Eighth Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog8),
                        contentDescription = "Tzeitel",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "Tzeitel",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "7 years old")
                    }
                }
            }
        }
        // end of eighth row
        Spacer(modifier = Modifier.height(10.dp))
        // Ninth Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog9),
                        contentDescription = "COco",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "C0co",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "21 years old")
                    }
                }
            }
        }
        // end of ninth row
        Spacer(modifier = Modifier.height(10.dp))
        // Tenth Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog10),
                        contentDescription = "KoKa",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "KoKa",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "12 years old")
                    }
                }
            }
        }
        //end of tenth row
        Spacer(modifier = Modifier.height(10.dp))
        // Eleventh Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog11),
                        contentDescription = "Tec",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "Tec",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "2 years old")
                    }
                }
            }
        }
        //end of eleventh row
        Spacer(modifier = Modifier.height(10.dp))
        // Twelve Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog12),
                        contentDescription = "Tee",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "Tee",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "2 years old")
                    }
                }
            }
        }
        //end of 12th row
        Spacer(modifier = Modifier.height(10.dp))
        // Thirteenth Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog13),
                        contentDescription = "Shee",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "Shee",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "20 years old")
                    }
                }
            }
        }
        //End of thirteenth row
        Spacer(modifier = Modifier.height(10.dp))
        // fourteenth Row
        Row {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.dog14),
                        contentDescription = "Chely",
                        modifier = Modifier
                            .padding(10.dp)
                            .size(45.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .align(Alignment.CenterVertically)
                    ){
                        Text(
                            text = "Chely",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "22 years old")
                    }
                }
            }
        }
        //End of fourteenth row
    }
}

@Preview(showBackground = true)
@Composable
fun DawgActivityPreview() {
    Dawg()
}