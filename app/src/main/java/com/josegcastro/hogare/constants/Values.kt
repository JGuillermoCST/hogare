package com.josegcastro.hogare.constants

import android.media.Image
import com.josegcastro.hogare.R


data class Ad(val title: String, val date: String, val message: String)
data class Visitant(val name: String, val kind: String, val date: String, val accessKey: String, val personQTY: Int)
data class Reservation(val title: String, val cost: Double, val availability: String, val image: Int)
data class Payment(val concept: String, val cost: Double, val date: String, val folio: String, val type: Int, val Status: Int)
data class Release(val id: String, val title: String, val name: String, val date: String, val hour: String, val header: String, val body: String)

object Values {

    var id: String = ""

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

    val visitantList = listOf(
        Visitant("Roman Salazar","Visita","10-13-2021","R-56342",2),
        Visitant("Erick Luna","Visita","10-22-2021","R-38565",2),
        Visitant("Nicole Perpuly","Visita","10-22-2021","R-15654",2),
        Visitant("José Castro","Visita","10-31-2021","R-13089",2)
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

    val releasesList = listOf(
        Release("1","Convivio","Román Salazar","10-13-2021","19:40","Hola vecinos!","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra tortor nunc, eu semper orci sollicitudin non. Sed sed sollicitudin ante. Aliquam ornare dignissim efficitur. Nullam blandit dui ut velit consequat, et eleifend purus porttitor. Pellentesque cursus mollis ante at aliquam."),
        Release("2","Fiesta de halloween","Erick Luna","10-22-2021","09:12","Hola vecinos!","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra tortor nunc, eu semper orci sollicitudin non. Sed sed sollicitudin ante. Aliquam ornare dignissim efficitur. Nullam blandit dui ut velit consequat, et eleifend purus porttitor. Pellentesque cursus mollis ante at aliquam."),
        Release("3","Carne asada","Nicole Perpuly","11-19-2021","18:31","Hola vecinos!","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra tortor nunc, eu semper orci sollicitudin non. Sed sed sollicitudin ante. Aliquam ornare dignissim efficitur. Nullam blandit dui ut velit consequat, et eleifend purus porttitor. Pellentesque cursus mollis ante at aliquam."),
        Release("4","Fiesta de fin de año","José Castro","11-12-2021","13:13","Hola vecinos!","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra tortor nunc, eu semper orci sollicitudin non. Sed sed sollicitudin ante. Aliquam ornare dignissim efficitur. Nullam blandit dui ut velit consequat, et eleifend purus porttitor. Pellentesque cursus mollis ante at aliquam.")
    )
}