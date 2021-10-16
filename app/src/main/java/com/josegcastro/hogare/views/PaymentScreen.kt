package com.josegcastro.hogare.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.josegcastro.hogare.R
import com.josegcastro.hogare.constants.Payment
import com.josegcastro.hogare.constants.Reservation
import com.josegcastro.hogare.constants.Values

@Composable
fun PaymentScreen() {

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
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color.White)
                ) {

                    var total: Double = 0.0
                    for (item in Values.paymentsList) {
                        if (item.Status == 0) {
                            total += item.cost
                        }
                    }

                    Column(
                        modifier = Modifier.fillMaxWidth().padding(8.dp)
                    ) {

                        Text(
                            text = "Total pendiente: $$total",
                            modifier = Modifier.fillMaxWidth(),
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium,
                                textAlign = TextAlign.Center
                            )
                        )
                    }
                }
            }

            items(Values.paymentsList) {
                PaymentCard(item = it)
            }
        }
    }
}

@Composable
fun PaymentCard(item: Payment) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "${item.concept} - ${item.folio}",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )

            Text(
                text = item.date,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Normal
                )
            )

            Spacer(modifier = Modifier.height(13.dp))

            Text(
                text = "$${item.cost} MXN",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
            )

            Spacer(modifier = Modifier.height(13.dp))

            Text(
                text = if (item.Status == 0) { "PENDIENTE DE PAGO" } else { "PAGADO" },
                modifier = Modifier.fillMaxWidth(),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center,
                    color = if (item.Status == 0) { Color.Red } else { Color.Blue }
                )
            )
        }
    }
}