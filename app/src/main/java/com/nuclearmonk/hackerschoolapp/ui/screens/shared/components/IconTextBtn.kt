package com.nuclearmonk.hackerschoolapp.ui.screens.shared.components

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun IconTextButton(modifier: Modifier = Modifier, text: String?, backgroundColor: Color ){
    TextButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize().border(10.dp,
        Color.Yellow, RoundedCornerShape(50f)).padding(10.dp).background(color = backgroundColor)) {
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Icon(Icons.Rounded.AccountCircle, contentDescription = "Profile")
            Text(text = text?:"")
        }
    }
}
