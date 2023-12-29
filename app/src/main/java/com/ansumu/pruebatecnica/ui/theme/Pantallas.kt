package com.ansumu.pruebatecnica.ui.theme

sealed class Pantallas(val ruta: String) {
    object PantallaHome: Pantallas("PantallaHome")
    object ListScreen: Pantallas("ListScreen")
    object FichaScreen: Pantallas("FichaScreen")
}