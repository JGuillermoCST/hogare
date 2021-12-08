package com.josegcastro.hogare.models

data class User(val id: Int = 0,
                val name: String = "",
                val lastName: String = "",
                val age: Int = 0,
                val email: String = "",
                val sex: String = "",
                val charge: String = "",
                val houseID: Int = 0,
                val houseNum: Int = 0,
                val state: String = "",
                val locationName: String = "",
                val locationStreet: String = "")
