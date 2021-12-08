package com.josegcastro.hogare.components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.josegcastro.hogare.R
import com.josegcastro.hogare.constants.Values
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopBar(
    scope: CoroutineScope,
    scaffoldState: ScaffoldState,
    navController: NavController
) {
    TopAppBar(
        title = { Text(Values.title) },
        navigationIcon = {
            IconButton(onClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu Icon")
            }
        },
        actions = {
            IconButton(onClick = {
                navController.navigate("userscreen")
            }) {
                Icon(imageVector = Icons.Default.Person, contentDescription = "User Icon")
            }
        }
    )
}