package com.josegcastro.hogare.constants

import com.josegcastro.hogare.models.Payment

object Values {

    var id: String = ""
    var idLocation: String = "1"
    var title: String = ""

    val paymentsList = listOf(
        Payment("Cuota mensual",389.0, "10-01-2021", "C-23482", 0),
        Payment("Reservación de palapa",300.0, "10-13-2021", "R-013", 1),
        Payment("Reservación de salón de fiestas",1989.0, "10-08-2021", "R-101", 1)
    )
}