package com.josegcastro.hogare.contexts

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.josegcastro.hogare.views.*

@Composable
fun LoginContext(appCTX: Context) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {

        composable("login") { LoginScreen(navController = navController) }
        composable("main") { MainContext(logNav = navController, appCTX = appCTX) }
    }
}