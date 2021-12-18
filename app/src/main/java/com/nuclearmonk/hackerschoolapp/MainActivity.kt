package com.nuclearmonk.hackerschoolapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.nuclearmonk.hackerschoolapp.ui.screens.shared.components.IconTextButton
import com.nuclearmonk.hackerschoolapp.ui.theme.HackerSchoolAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HackerSchoolAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainMenu()
                }
            }
        }
    }
}

@Composable
fun MainMenu() {
    Column() {
        Row(modifier = Modifier
            .background(Color.Yellow).weight(1f,fill = true)
            .fillMaxSize(), Arrangement.SpaceEvenly){
            Box(
                Modifier
                    .weight(1f, true)
                    .fillMaxSize()){
                IconTextButton(text = "Profile", backgroundColor = Color.Magenta)
            }
            Box(
                Modifier
                    .weight(1f, true)
                    .fillMaxSize()){
                IconTextButton(text = "Opção 2", backgroundColor = Color.Black)
            }

        }
        Row(modifier = Modifier
            .background(Color.Yellow).weight(1f,fill = true)
            .fillMaxSize(), Arrangement.SpaceEvenly){
            Box(
                Modifier
                    .weight(1f, true)
                    .fillMaxSize()){
                IconTextButton(text = "Profile", backgroundColor = Color.Magenta)
            }
            Box(
                Modifier
                    .weight(1f, true)
                    .fillMaxSize()){
                IconTextButton(text = "Opção 2", backgroundColor = Color.Black)
            }
        }
        Row(modifier = Modifier
            .background(Color.Yellow).weight(1f,fill = true)
            .fillMaxSize(), Arrangement.SpaceEvenly){
            Box(
                Modifier
                    .weight(1f, true)
                    .fillMaxSize()){
                IconTextButton(text = "Profile", backgroundColor = Color.Magenta)
            }
            Box(
                Modifier
                    .weight(1f, true)
                    .fillMaxSize()){
                IconTextButton(text = "Opção 2", backgroundColor = Color.Black)
            }
        }
        Row(modifier = Modifier
            .background(Color.Yellow).weight(1f,fill = true)
            .fillMaxSize(), Arrangement.SpaceEvenly){
            Box(
                Modifier
                    .weight(1f, true)
                    .fillMaxSize()){
                IconTextButton(text = "Profile", backgroundColor = Color.Magenta)
            }
            Box(
                Modifier
                    .weight(1f, true)
                    .fillMaxSize()){
                IconTextButton(text = "Opção 2", backgroundColor = Color.Black)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HackerSchoolAppTheme {
        MainMenu()
    }
}