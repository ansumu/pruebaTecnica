package com.ansumu.pruebatecnica.ui.theme

import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ansumu.pruebatecnica.Model.config
import com.ansumu.pruebatecnica.R

@SuppressLint("SuspiciousIndentation")
@Composable
fun BarraMenu(navController: NavController, mostrar: Boolean) {
    val context = LocalContext.current
    if (mostrar)
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 1.dp)
        .height(80.dp))    {
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .shadow(
                    elevation = 11.dp,
                    spotColor = Color(0x29000000),
                    ambientColor = Color(0x29000000)
                )
                .fillMaxWidth()
                .height(65.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 30.dp))
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.padding(1.dp))
                MenuOpcion(
                    imagen = R.drawable.home,
                    texto = "Inicio",
                    ruta = Pantallas.PantallaHome.ruta,
                    navController = navController,
                    modifier = Modifier.weight(1f)
                )
                MenuOpcion(
                    imagen = R.drawable.lupa,
                    texto = "Listado",
                    ruta = Pantallas.ListScreen.ruta,
                    navController = navController,
                    modifier = Modifier.weight(1f)
                )
                MenuOpcion(
                    imagen = R.drawable.cerrar,
                    texto = "Cerrar",
                    ruta = "",
                    navController = navController
                )
                Spacer(modifier = Modifier.padding(1.dp))
            }
        }
    }
}

@Composable
fun MenuOpcion(
    imagen: Int,
    texto: String,
    ruta: String,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    if (ruta=="Cerrar") {
        val contexto= LocalContext.current
        if (contexto is Activity) {
            contexto.finishAffinity()
        }
    } else {
        config.lecturaServidor=false
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .widthIn(60.dp)
                .clickable(
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() }) {
                    navController?.navigate(ruta)
                }
        ) {
            Image(painter = painterResource(id = imagen), contentDescription = null, modifier = Modifier.size(25.dp))
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = texto,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF0A405E),
                    textAlign = TextAlign.Center,
                )
            )
        }
    }

}