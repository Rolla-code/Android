package com.example.composequadrant

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = "Text composable",
                description = "Displays text and follows Material Design guidelines.",
                backgroundColor = androidx.compose.ui.graphics.Color.Green,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = androidx.compose.ui.graphics.Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = androidx.compose.ui.graphics.Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = androidx.compose.ui.graphics.Color.LightGray,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: androidx.compose.ui.graphics.Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

//@Composable
//fun ComposeQuadrantApp() {
//    Box{
//        Column(
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Row (Modifier.weight(1f)){
//                Quadrant(
//                    "Text composable",
//                    "Displays text and follows Material Design guidelines.",
//                    androidx.compose.ui.graphics.Color.Green,
//                    Modifier.weight(1f)
//                )
//                Quadrant("Image composable",
//                    "Creates a composable that lays out and draws a given Painter class object.",
//                    androidx.compose.ui.graphics.Color.Yellow,
//                    Modifier.weight(1f)
//                )
//
//            }
//            Row(Modifier.weight(1f)) {
//                Quadrant("Row composable",
//                    "A layout composable that places its children in a horizontal sequence.",
//                    androidx.compose.ui.graphics.Color.Cyan,
//                    Modifier.weight(1f)
//                )
//                Quadrant("Column composable",
//                    "A layout composable that places its children in a vertical sequence.",
//                    androidx.compose.ui.graphics.Color.LightGray,
//                    Modifier.weight(1f)
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun Quadrant(header: String, body: String, color: androidx.compose.ui.graphics.Color, modifier: Modifier = Modifier) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color)
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(
//            text = header,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier.padding(bottom = 16.dp)
//        )
//        Text(
//            text = body,
//            textAlign = TextAlign.Justify
//        )
//    }
//}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantApp()
    }
}