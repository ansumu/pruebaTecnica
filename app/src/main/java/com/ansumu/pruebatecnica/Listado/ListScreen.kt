package com.ansumu.pruebatecnica
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.draw.clip
import com.ansumu.pruebatecnica.Listado.components.UserItem
import com.ansumu.pruebatecnica.Model.User
import com.ansumu.pruebatecnica.ui.theme.BasePantalla

@Composable
fun ListScreen(viewModel: ListViewModel, navController: NavHostController) {
    val isLoadingFicha: Boolean by viewModel.isLoading.observeAsState(initial = true)
    val listadoUsuarios: List<User> by viewModel.listUsuarios.observeAsState(initial = emptyList())

    LaunchedEffect(Unit) {
        viewModel.cargarListadoUsuarios()
    }

    BasePantalla(navController = navController) {
        Box(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            if (isLoadingFicha) {
                CircularProgressIndicator(modifier = Modifier
                    .padding(16.dp)
                    .size(200.dp))
            } else {
                Column(modifier = Modifier.padding(30.dp)) {
                    Text(
                        text = "CONTACTOS",
                        style = TextStyle(
                            fontSize = 30.sp,
                            lineHeight = 35.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Blue,
                        )
                    )
                    LazyColumn {
                        items(listadoUsuarios) { user ->
                            UserItem(user)
                        }
                        item {
                            Spacer(modifier=Modifier.height(50.dp))
                        }
                    }
                }
            }
        }
    }
}
