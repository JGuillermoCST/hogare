package com.josegcastro.hogare.contexts

import android.content.Context
import androidx.compose.material.DrawerValue
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.josegcastro.hogare.components.Drawer
import com.josegcastro.hogare.components.TopBar
import com.josegcastro.hogare.navigation.Destinations
import com.josegcastro.hogare.navigation.NavigationHost

@Composable
fun MainContext(logNav: NavController, appCTX: Context) {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState(
        drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    )
    val scope = rememberCoroutineScope()

    val navigationItems = listOf(
        Destinations.Ad,
        Destinations.Reservation,
        Destinations.Payment,
        Destinations.Visitant,
        Destinations.Release,
        Destinations.Achievement,
        Destinations.Message
    )

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopBar(scope, scaffoldState, navController) },
        drawerContent = { Drawer(scope, scaffoldState, navController, items = navigationItems, altNav = logNav) },
        drawerGesturesEnabled = true
    ){
        NavigationHost(navController,appCTX = appCTX)
    }
}