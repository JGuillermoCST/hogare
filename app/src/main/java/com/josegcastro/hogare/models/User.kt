package com.josegcastro.hogare.models

data class User(val id: Int,
                val name: String,
                val lastName: String,
                val age: Int,
                val email: String,
                val sex: String,
                val charge: String,
                val houseNum: Int,
                val state: String,
                val locationName: String,
                val locationStreet: String)
