package com.josegcastro.hogare.contexts

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.josegcastro.hogare.viewmodels.LoginViewModel
import com.josegcastro.hogare.views.*

@Composable
fun LoginContext(appCTX: Context) {
    val navController = rememberNavController()
    val login = LoginViewModel(appCTX, navController)

    NavHost(navController = navController, startDestination = "login") {

        composable("login") { LoginScreen(state = login.state, vm = login) }
        composable("main") { MainContext(logNav = navController, appCTX = appCTX) }
    }
}