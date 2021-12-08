package com.josegcastro.hogare.viewmodels

import android.content.Context
import android.util.Log
import android.util.Patterns
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.josegcastro.hogare.constants.Values
import com.josegcastro.hogare.models.LoginState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel(ctx: Context,navController: NavController): ViewModel() {

    val state: MutableState<LoginState> = mutableStateOf(LoginState())
    private val navController = navController
    private val context = ctx
    private var requestQueue: RequestQueue = Volley.newRequestQueue(context)

    fun login() {
        if(state.component1().email.isBlank() || state.component1().password.isBlank()) {
            Log.e("LOGIN ERROR", "Debe rellemar todos los campos")
        } else if(!Patterns.EMAIL_ADDRESS.matcher(state.component1().email).matches()){
            Log.e("LOGIN ERROR", "El email es inválido")
        }

        viewModelScope.launch {
            val jsonRequest = JsonObjectRequest(Request.Method.GET, "https://hogare.josecst.com/api/usuario/login/${state.component1().email}", null, { result ->

                if (result["email"].toString() == state.component1().email && result["contraseña"].toString() == state.component1().password) {
                    Values.id = result["id"].toString()

                    UserViewModel(this@LoginViewModel.context)

                    viewModelScope.launch(Dispatchers.Main) {
                        this@LoginViewModel.navController.navigate("main") {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    }
                } else {
                    Log.e("LOGIN ERROR", "Las credenciales no coinciden")
                }
            }, { error ->
                Log.e("ADS ERROR", error.toString())
            })

            requestQueue.add(jsonRequest)
        }
    }
}