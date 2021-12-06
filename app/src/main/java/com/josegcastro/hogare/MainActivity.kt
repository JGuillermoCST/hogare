package com.josegcastro.hogare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.rememberNavController
import com.josegcastro.hogare.components.Drawer
import com.josegcastro.hogare.components.TopBar
import com.josegcastro.hogare.ui.theme.HogareTheme
import com.josegcastro.hogare.navigation.Destinations.Ad
import com.josegcastro.hogare.navigation.Destinations.Reservation
import com.josegcastro.hogare.navigation.Destinations.Payment
import com.josegcastro.hogare.navigation.Destinations.Visitant
import com.josegcastro.hogare.navigation.Destinations.Release
import com.josegcastro.hogare.navigation.NavigationHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HogareTheme {

                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState(
        drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    )
    val scope = rememberCoroutineScope()

    val navigationItems = listOf(Ad, Reservation, Payment, Visitant, Release)

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopBar(scope, scaffoldState ) },
        drawerContent = { Drawer(scope, scaffoldState, navController, items = navigationItems) },
        drawerGesturesEnabled = true
    ){
        NavigationHost(navController)
    }
}
