package com.josegcastro.hogare.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.josegcastro.hogare.constants.Values.releasesList
import com.josegcastro.hogare.navigation.Destinations.Ad
import com.josegcastro.hogare.navigation.Destinations.Reservation
import com.josegcastro.hogare.navigation.Destinations.Payment
import com.josegcastro.hogare.navigation.Destinations.Visitant
import com.josegcastro.hogare.navigation.Destinations.Release
import com.josegcastro.hogare.views.AdScreen
import com.josegcastro.hogare.views.PaymentScreen
import com.josegcastro.hogare.views.ReservationScreen
import com.josegcastro.hogare.views.VisitantScreen
import com.josegcastro.hogare.views.ReleaseScreen
import com.josegcastro.hogare.views.ReleaseDetailScreen

@Composable
fun NavigationHost(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Ad.route) {

        //Base Screens, they not depend of received values
        composable(Ad.route) { AdScreen() }
        composable(Reservation.route) { ReservationScreen() }
        composable(Payment.route) { PaymentScreen() }
        composable(Visitant.route) { VisitantScreen() }
        composable(Release.route) { ReleaseScreen(navController = navController) }
        composable("releasedetail/{id}",
            arguments = listOf(navArgument("id") { type = NavType.StringType })
        ) { backStackEntry ->
            backStackEntry.arguments?.getString("id")?.let { id ->
                for (t in releasesList.indices) {
                    if (releasesList[t].id == id) ReleaseDetailScreen(rel = releasesList[t])
                }
            }
        }
    }
}