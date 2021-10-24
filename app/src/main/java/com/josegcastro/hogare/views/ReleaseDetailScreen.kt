package com.josegcastro.hogare.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.josegcastro.hogare.constants.Release

@Composable
fun ReleaseDetailScreen(rel: Release) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(vertical = 16.dp, horizontal = 8.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ){

            Text(
                text = rel.title,
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Blue
                )
            )

            Spacer(modifier = Modifier.height(3.dp))

            Text(
                text = rel.name,
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Italic
                )
            )

            Spacer(modifier = Modifier.height(3.dp))

            Text(
                text = "${rel.date} ${rel.hour}",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                )
            )

            Spacer(modifier = Modifier.height(13.dp))

            Text(
                text = rel.header,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    fontStyle = FontStyle.Normal
                )
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = rel.body,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal,
                    textAlign = TextAlign.Justify
                )
            )
        }
    }
}