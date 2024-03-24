package com.example.jetpackcomposenotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposenotes.ui.theme.JetpackComposeNotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeNotesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,) {

    //column: alt alta koyar ,
    // row : yan yana koyar.
    // box : z ekseninde nasıl duracağına bununla karar verebiliyoruz.

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
//spacer aralarında boşluk bırakmamızı sağlıyor.
    ) {
       CustomText(text = "Hello android")
        Spacer(modifier = Modifier.padding(5.dp))
       CustomText(text = "Hello World")

        Row(){
            CustomText(text = "test 1 ")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "test 2 ")
        }
    }
}

@Composable
fun CustomText(text : String) {

    Text(
        modifier = Modifier
            .background(color = Color.Magenta)
            .padding(top = 10.dp, start = 5.dp, end = 1.dp, bottom = 20.dp)
            .clickable {
                println("selam tıklandı")
            }
            //.width(50.dp)
            //.height(50.dp)
            //.fillMaxWidth()
        ,text = text,
        textAlign = TextAlign.Center

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeNotesTheme {
        Greeting("Android")
    }
}