package com.ansumu.pruebatecnica.Ficha.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ansumu.pruebatecnica.R
import java.util.Locale


@Composable
fun CabFichaMenu(navController: NavHostController, titulo: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.cabficha),
            contentDescription = "image description",
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 0.dp, vertical = 50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier= Modifier.width(10.dp))
            Image(
                painter = painterResource(id = R.drawable.izquierda),
                contentDescription = "image description",
                modifier = Modifier
                    .padding(1.dp)
                    .size(26.dp)
                    .clickable { navController.popBackStack() }
                    .graphicsLayer {
                        alpha = 1f
                    },
                colorFilter = ColorFilter.tint(Color.White),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier=Modifier.width(10.dp))

            Text(
                text = titulo,
                style = TextStyle(
                    fontSize = 24.sp,
                    fontFamily = FontFamily(Font(R.font.oswall_variable)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = R.drawable.submenu),
                contentDescription = "image description",
                modifier = Modifier
                    .size(32.dp)
                    .clickable {  }
                    .graphicsLayer {
                        alpha = 1f
                    },
                colorFilter = ColorFilter.tint(Color.White),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier= Modifier.width(10.dp))
        }
    }
}
