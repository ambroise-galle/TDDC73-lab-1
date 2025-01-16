@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomePage()
        }
    }
}


@Composable
fun HomePage() {
    Column (modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.TopCenter)){
        TopAppBar(
            title = { Text("Example 1 : Kotlin + Compose")},
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(red = 29, green = 137, blue = 111),
                titleContentColor = Color.White,
            )
        )
        Spacer(modifier = Modifier.height(50.dp))
        Image(
            painter = painterResource(R.drawable._82137f311c5728f8e257e56820af92c),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(50.dp))

        Row(modifier = Modifier.align(Alignment.CenterHorizontally)){
            Column {
                GreyButton(text = "Button")
                Spacer(modifier = Modifier.height(20.dp))
                GreyButton(text = "Button")
            }
            Spacer(modifier = Modifier.width(80.dp))
            Column {
                GreyButton(text = "Button")
                Spacer(modifier = Modifier.height(20.dp))
                GreyButton(text = "Button")
            }
        }

        Spacer(modifier = Modifier.height(50.dp))

        Row(modifier = Modifier.align(Alignment.CenterHorizontally)){

            var text by remember { mutableStateOf("") }
            Text("Email:" ,
                color = Color.Gray,
                modifier = Modifier
                    .width(40.dp)
                    .height(50.dp)
                    .wrapContentHeight()
            )
            Spacer(modifier = Modifier.width(50.dp))
            TextField(
                value = text,
                onValueChange = { text = it },
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .wrapContentHeight(),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Red,
                    unfocusedIndicatorColor = Color.Red,
                    cursorColor = Color.Red,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                )
            )
        }
    }
}

@Composable
fun GreyButton(text: String) {
    Button(
        onClick = {null},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.LightGray,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(2.dp,2.dp,2.dp,2.dp),)
        {
            Text(text)
        }
}

@Preview
@Composable
fun PreviewHomePage() {
    HomePage()
}

