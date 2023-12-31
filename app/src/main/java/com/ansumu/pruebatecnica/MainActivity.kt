package com.ansumu.pruebatecnica

import android.os.Bundle
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ansumu.pruebatecnica.Ficha.FichaScreen
import com.ansumu.pruebatecnica.Ficha.FichaViewModel
import com.ansumu.pruebatecnica.Model.config
import com.ansumu.pruebatecnica.Model.datosUsuario
import com.ansumu.pruebatecnica.Model.publico
import com.ansumu.pruebatecnica.Model.usuario
import com.ansumu.pruebatecnica.ui.theme.Pantallas
import com.ansumu.pruebatecnica.ui.theme.PruebaTecnicaTheme
import com.ansumu.pruebatecnica.ui.theme.SystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        usuario= datosUsuario("","","","","","")
        config=publico(false,50)
        setContent {
            PruebaTecnicaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Pantallas.HomeScreen.ruta) {
                        composable(Pantallas.HomeScreen.ruta) {
                            SystemUiController(backgroundColor = Color.White, isTextDark = true)
                            HomeScreen(navController = navController)
                        }
                        composable(Pantallas.ListScreen.ruta) {
                            SystemUiController(backgroundColor = Color.White, isTextDark = true)
                            val ListViewModel: ListViewModel by viewModels()
                            ListScreen(ListViewModel, navController = navController)
                        }
                        composable(Pantallas.FichaScreen.ruta) {
                            SystemUiController(backgroundColor = Color.Transparent, isTextDark = false)
                            val FichaViewModel: FichaViewModel by viewModels()
                            FichaScreen(FichaViewModel, navController = navController)
                        }
                    }
                }
            }
        }
    }
}
