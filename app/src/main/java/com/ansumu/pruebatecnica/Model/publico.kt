package com.ansumu.pruebatecnica.Model

lateinit var usuario: datosUsuario
lateinit var config: publico

data class datosUsuario(
    var name: String,
    var email: String,
    var gender: String,
    var fecha: String,
    var phone: String,
    var foto: String)

data class publico(
    var lecturaServidor: Boolean,
    var numRegistros: Int
)

