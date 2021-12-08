package com.josegcastro.hogare.models

data class Payment(val concept: String,
                   val balance: Double,
                   val date: String,
                   val folio: String,
                   val status: Int)