package com.josegcastro.hogare.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.josegcastro.hogare.models.Ad
import com.josegcastro.hogare.models.User

@Composable
fun UserScreen(user: MutableState<User>) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
        ){

            item {
                UserCard(user = user.component1())
            }
        }
    }
}

@Composable
fun UserCard(user: User) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "${user.name} ${user.lastName}",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
            )

            Text(
                text = "${user.sex} - ${user.age} años - ${user.charge}",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light,
                    fontStyle = FontStyle.Italic
                )
            )

            Text(
                text = user.email,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                )
            )

            Spacer(modifier = Modifier.height(13.dp))

            Text(
                text = "Casa #${user.houseNum}",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                )
            )

            Text(
                text = "Privada: ${user.locationName}",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                )
            )

            Text(
                text = "Ubicación: ${user.locationStreet}",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                )
            )
        }
    }
}
