package com.josegcastro.hogare.models

data class CommonArea(val id: Int,
                      val name: String,
                      val description: String,
                      val openHour: String,
                      val closeHour: String,
                      val capacity: Int,
                      val locationID: Int)
