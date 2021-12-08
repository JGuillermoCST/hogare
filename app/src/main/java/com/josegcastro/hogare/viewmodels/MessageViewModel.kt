package com.josegcastro.hogare.viewmodels

import android.content.Context
import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.josegcastro.hogare.constants.Values
import com.josegcastro.hogare.models.Message
import kotlinx.coroutines.launch
import org.json.JSONObject

class MessageViewModel(ctx: Context): ViewModel() {

    private var requestQueue: RequestQueue = Volley.newRequestQueue(ctx)
    var list = mutableStateListOf<Message>()

    init {
        getMessages()
    }

    private fun getMessages() {
        viewModelScope.launch {
            val jsonRequest = JsonArrayRequest(Request.Method.GET, "https://hogare.josecst.com/api/mensajes-recibidos/${Values.id}", null, { result ->
                for (t in 0 until result.length()) saveList(list, result[t] as JSONObject)
            }, { error ->
                Log.e("ADS ERROR", error.toString())
            })

            requestQueue.add(jsonRequest)
        }
    }

    private fun saveList(list: SnapshotStateList<Message>, data: JSONObject) {
        list.add(
            Message(
                data["nombre"].toString(),
                data["apellido"].toString(),
                data["created_at"].toString(),
                data["Asunto"].toString(),
                data["Contenido"].toString()
            )
        )
    }
}