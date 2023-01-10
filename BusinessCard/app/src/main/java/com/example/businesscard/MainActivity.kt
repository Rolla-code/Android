package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
//    Column(modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//        Row {
//            CenterField()
//        }
//        Row{
//            BottomField()
//        }
//    }
    CenterField()
    BottomField()
}

@Composable
private fun CenterField() {
    val image = painterResource(id = R.drawable.ro)
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xFF073042))
            .padding(bottom = 150.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(painter = image,
            contentDescription = "Rolland's photo",
            modifier = Modifier
                .height(120.dp)
                .width(150.dp)
            )
        Text(text = "Rolland Ashiteye", fontSize = 36.sp, color = Color.White)
        Text(text = "Android Developer", fontSize = 16.sp, color = Color(0xFF3ddc84))
    }
}

@Composable
private fun BottomField() {
    Column(
    modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 50.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
                ){
            Icon(Icons.Outlined.Phone,
                contentDescription = "Localized description",
            modifier = Modifier
                .padding(8.dp),
                tint = Color.Green
            )
            Text(
                text = "+11 (123) 444 555 888",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ){
            Icon(Icons.Outlined.Share,
                contentDescription = "Localized description",
                modifier = Modifier
                    .padding(8.dp),
                tint = Color.Green
            )
            Text(
                text = "@AndroidDev",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ){
            Icon(Icons.Outlined.MailOutline,
                contentDescription = "Localized description",
                modifier = Modifier
                    .padding(8.dp),
                tint = Color.Green
            )
            Text(
                text = "arolland@android.com",
                color = Color.White,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}