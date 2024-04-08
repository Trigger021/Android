package com.example.chegeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu

import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.example.chegeapp.ui.theme.lightgray

class FurnitureActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Furniture()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Furniture(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(lightgray)
    ){
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = {
                Text(
                    text = "",
                    color = Color.White
                )
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Transparent),
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
            },
            actions = {
                IconButton(onClick = { /*TODO*/ })
                {
                    Icon(imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "Cart",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { /*TODO*/ })
                {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Black
                    )
                }
            }
        )
        // End of TopAppBar
        Row (
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ) {
            Text(
                text = "Chairs",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Tables",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Sofa",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Beddings",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Utensils",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.width(10.dp))

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = "120 Products",
                fontSize = 15.sp,
                fontFamily = FontFamily.Default,
                color = Color.Black
                )
            Spacer(modifier = Modifier.width(205.dp))
            Text(
                text = "Popular",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
                )
                Icon(imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Favourite",
                    tint = Color.Black,
                    modifier = Modifier
                        .size(25.dp)
                )
        }
        Column (
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(10.dp)
        ){
            //First row
            Row {
                //First Column
                Column (
                    modifier = Modifier
                        .background(Color.White)
                        .size(
                            width = 180.dp,
                            height = 280.dp
                        )
                        .padding(10.dp)
                ){
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.amoschair),
                            contentDescription = "Yeah",
                            modifier = Modifier.size(160.dp),
                            contentScale = ContentScale.FillBounds)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Amos Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "design is to support your arms while sitting",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Text(
                            text = "$680",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Default,
                            color = Color.Black,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.width(90.dp))
                        Icon(imageVector = Icons.Default.Lock,
                            contentDescription = "Favourite",
                            tint = Color.Gray,
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }
                }
                // End of column
                Spacer(modifier = Modifier.width(10.dp))

                //First Column
                Column (
                    modifier = Modifier
                        .background(Color.White)
                        .size(
                            width = 180.dp,
                            height = 280.dp
                        )
                        .padding(10.dp)
                ){
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.kewchair),
                            contentDescription = "Yeah",
                            modifier = Modifier.size(160.dp),
                            contentScale = ContentScale.FillBounds)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Kew Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "design is to support your arms while sitting",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Text(
                            text = "$480",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Default,
                            color = Color.Black,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.width(90.dp))
                        Icon(imageVector = Icons.Default.Lock,
                            contentDescription = "Favourite",
                            tint = Color.Gray,
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }
                }
                // End of column
            }
            //End of first row
            Spacer(modifier = Modifier.height(5.dp))
            //Second row
            Row {
                //Third Column
                Column (
                    modifier = Modifier
                        .background(Color.White)
                        .size(
                            width = 180.dp,
                            height = 280.dp
                        )
                        .padding(10.dp)
                ){
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.burochair),
                            contentDescription = "Yeah",
                            modifier = Modifier.size(160.dp),
                            contentScale = ContentScale.FillBounds)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Buro Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "design is to support your arms while sitting",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Text(
                            text = "$680",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Default,
                            color = Color.Black,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.width(90.dp))
                        Icon(imageVector = Icons.Default.Lock,
                            contentDescription = "Favourite",
                            tint = Color.Gray,
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }
                }
                // End of column
                Spacer(modifier = Modifier.width(10.dp))

                //First Column
                Column (
                    modifier = Modifier
                        .background(Color.White)
                        .size(
                            width = 180.dp,
                            height = 280.dp
                        )
                        .padding(10.dp)
                ){
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.tinarchair),
                            contentDescription = "Yeah",
                            modifier = Modifier.size(160.dp),
                            contentScale = ContentScale.FillBounds)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Tinar Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "design is to support your arms while sitting",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Text(
                            text = "$480",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Default,
                            color = Color.Black,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.width(90.dp))
                        Icon(imageVector = Icons.Default.Lock,
                            contentDescription = "Favourite",
                            tint = Color.Gray,
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }
                }
                // End of column
            }
            //End of second row
            Spacer(modifier = Modifier.height(5.dp))
            //Third row
            Row {
                //First Column
                Column (
                    modifier = Modifier
                        .background(Color.White)
                        .size(
                            width = 180.dp,
                            height = 280.dp
                        )
                        .padding(10.dp)
                ){
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.recliner),
                            contentDescription = "Yeah",
                            modifier = Modifier.size(160.dp),
                            contentScale = ContentScale.FillBounds)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Recliner Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "design is to support your arms while sitting",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Text(
                            text = "$680",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Default,
                            color = Color.Black,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.width(90.dp))
                        Icon(imageVector = Icons.Default.Lock,
                            contentDescription = "Favourite",
                            tint = Color.Gray,
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }
                }
                // End of column
                Spacer(modifier = Modifier.width(10.dp))

                //First Column
                Column (
                    modifier = Modifier
                        .background(Color.White)
                        .size(
                            width = 180.dp,
                            height = 280.dp
                        )
                        .padding(10.dp)
                ){
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.rockingchair),
                            contentDescription = "Yeah",
                            modifier = Modifier.size(160.dp),
                            contentScale = ContentScale.FillBounds)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Rocking Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "design is to support your arms while sitting",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Text(
                            text = "$680",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Default,
                            color = Color.Black,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.width(90.dp))
                        Icon(imageVector = Icons.Default.Lock,
                            contentDescription = "Favourite",
                            tint = Color.Gray,
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }
                }
                // End of column
            }
            //End of third row
            Spacer(modifier = Modifier.height(5.dp))
            //Fourth row
            Row {
                //First Column
                Column (
                    modifier = Modifier
                        .background(Color.White)
                        .size(
                            width = 180.dp,
                            height = 280.dp
                        )
                        .padding(10.dp)
                ){
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.wingbackchair),
                            contentDescription = "Yeah",
                            modifier = Modifier.size(160.dp),
                            contentScale = ContentScale.FillBounds)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Wingback Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "design is to support your arms while sitting",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Text(
                            text = "$680",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Default,
                            color = Color.Black,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.width(90.dp))
                        Icon(imageVector = Icons.Default.Lock,
                            contentDescription = "Favourite",
                            tint = Color.Gray,
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }
                }
                // End of column
                Spacer(modifier = Modifier.width(10.dp))

                //First Column
                Column (
                    modifier = Modifier
                        .background(Color.White)
                        .size(
                            width = 180.dp,
                            height = 280.dp
                        )
                        .padding(10.dp)
                ){
                    Box(
                        contentAlignment = Alignment.Center
                    ){
                        Image(painter = painterResource(id = R.drawable.clubchair),
                            contentDescription = "Yeah",
                            modifier = Modifier.size(160.dp),
                            contentScale = ContentScale.FillBounds)
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Club Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "design is to support your arms while sitting",
                        fontSize = 14.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Text(
                            text = "$680",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Default,
                            color = Color.Black,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.width(90.dp))
                        Icon(imageVector = Icons.Default.Lock,
                            contentDescription = "Favourite",
                            tint = Color.Gray,
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }
                }
                // End of column
            }
            //end of fourth column
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FurnitureActivityPreview(){
    Furniture()
}