package com.ansumu.pruebatecnica.Ficha

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.zIndex
import com.ansumu.pruebatecnica.Ficha.components.CabFicha
import com.ansumu.pruebatecnica.Ficha.components.CabFichaMenu
import com.ansumu.pruebatecnica.Ficha.components.DetFicha
import com.ansumu.pruebatecnica.Ficha.components.PieFicha
import com.ansumu.pruebatecnica.Model.usuario
import com.ansumu.pruebatecnica.R
import com.ansumu.pruebatecnica.ui.theme.BasePantalla
import java.util.Locale

@Composable
fun FichaScreen(viewModel: FichaViewModel, navController: NavHostController) {
    val nombre: String by viewModel.nombre.observeAsState(initial = usuario.name)
    val email: String by viewModel.email.observeAsState(initial = usuario.email)
    val genero: String by viewModel.genero.observeAsState(initial = usuario.gender)
    val fecha: String by viewModel.fecha.observeAsState(initial = usuario.fecha)
    val telefono: String by viewModel.telefono.observeAsState(initial = usuario.phone)

    LaunchedEffect(Unit) {

    }

    BasePantalla(navController = navController, mostrar = false,true) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            val titulo=nombre.toUpperCase(Locale.ROOT)
            CabFicha(navController = navController, usuario.foto, titulo)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .offset(y=-10.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Column(modifier=Modifier.padding(start=30.dp)) {
                    val fotoUser = painterResource(id = R.drawable.user)
                    DetFicha(fotoUser,"Nombre y apellidos", nombre)
                    Spacer(modifier=Modifier.height(10.dp))

                    val fotoEmail = painterResource(id = R.drawable.email)
                    DetFicha(fotoEmail, titulo = "Email", dato = email)
                    Spacer(modifier=Modifier.height(10.dp))

                    var fotoGenero = painterResource(id = R.drawable.gender)
                    if (usuario.gender!="female") fotoGenero = painterResource(id = R.drawable.man)
                    DetFicha(fotoGenero, titulo = "Genero", dato = genero)
                    Spacer(modifier=Modifier.height(10.dp))

                    val fotoFecha = painterResource(id = R.drawable.calendar)
                    DetFicha(fotoFecha, titulo = "Fecha de registro", dato = fecha)
                    Spacer(modifier=Modifier.height(10.dp))

                    val fotoTelefono = painterResource(id = R.drawable.phone)
                    DetFicha(fotoTelefono,titulo = "Teléfono", dato = telefono)
                    Spacer(modifier=Modifier.height(10.dp))

                    PieFicha()
                }
            }
        }
    }
}

