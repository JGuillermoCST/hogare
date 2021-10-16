package com.josegcastro.hogare.constants

import android.media.Image
import com.josegcastro.hogare.R


data class Ad(val title: String, val date: String, val message: String)
data class Reservation(val title: String, val cost: Double, val availability: String, val image: Int)
data class Payment(val concept: String, val cost: Double, val date: String, val folio: String, val type: Int, val Status: Int)

object Values {

    val adsList = listOf(
        Ad("Ad 1","10-15-2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc varius ipsum sem, ac auctor lectus viverra quis. Mauris porta neque fermentum, congue mauris at, pretium metus."),
        Ad("Ad 2","10-15-2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc varius ipsum sem, ac auctor lectus viverra quis. Mauris porta neque fermentum, congue mauris at, pretium metus."),
        Ad("Ad 3","10-15-2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc varius ipsum sem, ac auctor lectus viverra quis. Mauris porta neque fermentum, congue mauris at, pretium metus."),
        Ad("Ad 4","10-15-2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc varius ipsum sem, ac auctor lectus viverra quis. Mauris porta neque fermentum, congue mauris at, pretium metus."),
        Ad("Ad 5","10-15-2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc varius ipsum sem, ac auctor lectus viverra quis. Mauris porta neque fermentum, congue mauris at, pretium metus."),
        Ad("Ad 6","10-15-2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc varius ipsum sem, ac auctor lectus viverra quis. Mauris porta neque fermentum, congue mauris at, pretium metus."),
        Ad("Ad 7","10-15-2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc varius ipsum sem, ac auctor lectus viverra quis. Mauris porta neque fermentum, congue mauris at, pretium metus."),
        Ad("Ad 8","10-15-2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc varius ipsum sem, ac auctor lectus viverra quis. Mauris porta neque fermentum, congue mauris at, pretium metus."),
        Ad("Ad 9","10-15-2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc varius ipsum sem, ac auctor lectus viverra quis. Mauris porta neque fermentum, congue mauris at, pretium metus."),
        Ad("Ad 10","10-15-2021","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc varius ipsum sem, ac auctor lectus viverra quis. Mauris porta neque fermentum, congue mauris at, pretium metus.")
    )

    val resList = listOf(
        Reservation("Palapa", 300.00, "Lunes a Domingo", R.drawable.logo),
        Reservation("Gimnasio", 50.00, "Lunes a Domingo", R.drawable.logo),
        Reservation("Estacionamiento", 130.00, "Lunes a Domingo", R.drawable.logo),
        Reservation("Salon de fiestas", 1989.00, "Lunes a Domingo", R.drawable.logo)
    )

    val paymentsList = listOf(
        Payment("Cuota mensual",389.0, "10-01-2021", "C-23482", 0, 0),
        Payment("Reservación de palapa",300.0, "10-13-2021", "R-013", 1, 1),
        Payment("Reservación de salón de fiestas",1989.0, "10-08-2021", "R-101", 1, 1)
    )
}