package com.ansumu.pruebatecnica

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ansumu.pruebatecnica.ui.theme.BarraMenu
import com.ansumu.pruebatecnica.ui.theme.BasePantalla

@SuppressLint("UnrememberedMutableState", "UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomePantalla(navController: NavHostController) {
    BasePantalla(navController = navController,true, false){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.TopCenter
        ) {
            Column() {
                Spacer(modifier=Modifier.height(100.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically, ) {
                    Image(
                        painter = painterResource(id = R.drawable.sol),
                        contentDescription = "image description",
                        contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .padding(1.dp)
                                    .width(33.dp)
                                    .height(67.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.stradivarius),
                        contentDescription = "image description",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .padding(1.dp)
                            .width(340.dp)
                            .height(40.dp)
                    )
                }
                Spacer(modifier=Modifier.height(50.dp))
                Text(
                    text = "PRUEBA",
                    style = TextStyle(
                        fontSize = 60.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF000000),
                    )
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "TÉCNICA",
                        style = TextStyle(
                            fontSize = 60.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF000000),
                        )
                    )
                }
            }
        }
    }
}

