package com.josegcastro.hogare.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.josegcastro.hogare.navigation.Destinations.*
import com.josegcastro.hogare.viewmodels.*
import com.josegcastro.hogare.views.*

@Composable
fun NavigationHost(navController: NavHostController, appCTX: Context) {

    val ads = AdViewModel(appCTX)
    val reservations = ReservationViewModel(appCTX)
    val visitants = VisitantViewModel(appCTX)
    val releases = ReleaseViewModel(appCTX)
    val achievements = AchievementViewModel(appCTX)
    val messages = MessageViewModel(appCTX)
    val user = UserViewModel(appCTX)

    NavHost(navController = navController, startDestination = Ad.route) {

        //Base Screens, they not depend of received values
        composable(Ad.route) { AdScreen(list = ads.list) }
        composable(Reservation.route) { ReservationScreen(list = reservations.list) }
        composable(Payment.route) { PaymentScreen() }
        composable(Visitant.route) { VisitantScreen(list = visitants.list) }
        composable(Release.route) { ReleaseScreen(list = releases.list) }
        composable(Achievement.route) { AchievementScreen(list = achievements.list) }
        composable(Message.route) { MessageScreen(list = messages.list) }
        composable("userscreen") { UserScreen(user = user.user) }
    }
}