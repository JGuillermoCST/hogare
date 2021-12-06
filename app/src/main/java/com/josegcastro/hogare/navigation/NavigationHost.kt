package com.josegcastro.hogare.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.josegcastro.hogare.navigation.Destinations.*
import com.josegcastro.hogare.views.*

@Composable
fun NavigationHost(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Ad.route) {

        //Base Screens, they not depend of received values
        composable(Ad.route) { AdScreen() }
        composable(Reservation.route) { ReservationScreen() }
        composable(Payment.route) { PaymentScreen() }
        composable(Visitant.route) { VisitantScreen() }
        composable(Release.route) { ReleaseScreen(navController = navController) }
    }
}