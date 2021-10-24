package com.josegcastro.hogare.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Destinations(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Ad: Destinations("adscreen", "Avisos", Icons.Filled.Home)
    object Reservation: Destinations("reservationscreen", "Reservaciones", Icons.Filled.Article)
    object Payment: Destinations("paymentscreen", "Pagos", Icons.Filled.MonetizationOn)
    object Visitant: Destinations("visitantscreen", "Visitantes", Icons.Filled.People)
    object Release: Destinations("releasescreen", "Comunicados", Icons.Filled.Pages)
}