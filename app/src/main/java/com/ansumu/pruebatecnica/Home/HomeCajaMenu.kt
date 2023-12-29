package com.ansumu.pruebatecnica

import androidx.compose.runtime.Composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CajaMenu(texto: String, onClick: () -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .height(60.dp)
            .width(300.dp)
            .padding(2.dp) // Agrega un padding alrededor del Box
            .background(
                color = Color.LightGray, // Establece el color de fondo del Box
                shape = RoundedCornerShape(20.dp) // Establece las esquinas redondeadas
            )
            .clickable(onClick = onClick) // Hace el Box clickable
    ) {
        Text(text = texto) // Título centrado dentro del Box
    }
}