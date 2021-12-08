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
import com.josegcastro.hogare.models.Release
import kotlinx.coroutines.launch
import org.json.JSONObject

class ReleaseViewModel(ctx: Context): ViewModel() {

    private var requestQueue: RequestQueue = Volley.newRequestQueue(ctx)
    var list = mutableStateListOf<Release>()

    init {
        getReleases()
    }

    private fun getReleases() {
        viewModelScope.launch {
            val jsonRequest = JsonArrayRequest(Request.Method.GET, "https://hogare.josecst.com/api/comunicados/1", null, { result ->
                for (t in 0 until result.length()) saveList(list, result[t] as JSONObject)
            }, { error ->
                Log.e("ADS ERROR", error.toString())
            })

            requestQueue.add(jsonRequest)
        }
    }

    private fun saveList(list: SnapshotStateList<Release>, data: JSONObject) {
        list.add(
            Release(
                data["Asunto"].toString(),
                data["Nombre"].toString(),
                data["Apellido"].toString(),
                data["created_at"].toString(),
                data["Contenido"].toString()
            )
        )
    }
}