package com.ansumu.pruebatecnica

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import com.ansumu.pruebatecnica.Listado.components.CabList
import com.ansumu.pruebatecnica.Listado.components.UserItem
import com.ansumu.pruebatecnica.Model.config
import com.ansumu.pruebatecnica.Network.CompruebaConexionInternet
import com.ansumu.pruebatecnica.ui.theme.BasePantalla

@Composable
fun ListScreen(viewModel: ListViewModel, navController: NavHostController) {
    val isLoadingFicha by viewModel.isLoading.observeAsState(initial = true)
    val listadoUsuarios by viewModel.listUsuarios.observeAsState(initial = emptyList())

    val contexto = LocalContext.current
    LaunchedEffect(Unit) {
        CompruebaConexionInternet(contexto)
        if (!config.lecturaServidor) {
            viewModel.cargarListadoUsuarios()
            config.lecturaServidor=true
        }
    }

    BasePantalla(navController = navController, mostrar = false, false) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            CabList(navController, viewModel)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
            ) {
                if (isLoadingFicha) {
                    CircularProgressIndicator(
                        modifier = Modifier
                            .padding(16.dp)
                            .size(200.dp)
                            .align(Alignment.Center)
                    )
                } else {
                    Spacer(modifier = Modifier.height(50.dp))
                    Column() {
                        listadoUsuarios.forEach { user ->
                            UserItem(user,navController)
                        }
                    }
                }
            }
        }
    }
}

