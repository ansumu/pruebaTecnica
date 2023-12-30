package com.ansumu.pruebatecnica.Network

import android.content.Context
import android.net.ConnectivityManager
import android.widget.Toast
import kotlinx.coroutines.delay

suspend fun CompruebaConexionInternet(contexto: Context) {
    val retryInterval = 10000L // Intervalo de reintento (10 segundos)
    while (!isNetworkAvailable(contexto)) {
        Toast.makeText(contexto, "No hay conexión a Internet. Reintentando en 10 seg.", Toast.LENGTH_LONG).show()
        delay(retryInterval) // Espera por el intervalo definido
        if (isNetworkAvailable(contexto)) break
    }
}

fun isNetworkAvailable(context: Context): Boolean {
    val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetworkInfo = connectivityManager.activeNetworkInfo
    return activeNetworkInfo != null && activeNetworkInfo.isConnected
}
