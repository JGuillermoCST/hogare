package com.josegcastro.hogare.viewmodels

import android.content.Context
import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.josegcastro.hogare.constants.Values
import com.josegcastro.hogare.models.User
import kotlinx.coroutines.launch
import org.json.JSONObject

class UserViewModel(ctx: Context): ViewModel() {

    private var requestQueue: RequestQueue = Volley.newRequestQueue(ctx)
    var user: MutableState<User> = mutableStateOf(User())

    init {
        getUser()
    }

    private fun getUser() {
        viewModelScope.launch {
            val jsonRequest = JsonObjectRequest(Request.Method.GET, "https://hogare.josecst.com/api/usuario/${Values.id}", null, { result ->
                saveUser(user, result)

            }, { error ->
                Log.e("ADS ERROR", error.toString())
            })

            requestQueue.add(jsonRequest)
        }
    }

    private fun saveUser(user: MutableState<User>, data: JSONObject) {

        user.value = user.value.copy(
            id = data["id"].toString().toInt(),
            name = data["nombre"].toString(),
            lastName = data["apellido"].toString(),
            age = data["edad"].toString().toInt(),
            email = data["email"].toString(),
            sex = data["Sexo"].toString(),
            charge = data["Cargo"].toString(),
            houseID = data["idCasa"].toString().toInt(),
            houseNum = data["numero"].toString().toInt(),
            state = data["Estado"].toString(),
            locationName = data["Nombre"].toString(),
            locationStreet = data["Domicilio"].toString()
        )

        Values.idLocation = data["idCasa"].toString()
    }
}
