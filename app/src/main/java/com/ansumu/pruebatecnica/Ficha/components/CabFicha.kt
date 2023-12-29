package com.ansumu.pruebatecnica.Ficha.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.ansumu.pruebatecnica.Model.User
import com.ansumu.pruebatecnica.R

@Composable
fun CabFicha(navController: NavHostController, foto: String) {
    println("foto: $foto")
    Column() {
        Image(
            painter = painterResource(id = R.drawable.cabficha),
            contentDescription = "image description",
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.popBackStack() },
            contentScale = ContentScale.FillWidth
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 0.dp, vertical = 8.dp)
                .offset(x=10.dp,y=-40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier=Modifier.width(10.dp))

            Image(
                painter = rememberImagePainter(
                    data = foto,
                    builder = {
                        crossfade(true)
                    }
                ),
                contentDescription = "User Image",
                modifier = Modifier
                    .padding(3.dp)
                    .clip(CircleShape)
                    .border(width = 3.dp, color = Color.White, shape = CircleShape)
                    .size(77.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = R.drawable.camara),
                contentDescription = "image description",
                modifier = Modifier
                    .size(48.dp)
                    .offset(y=20.dp),
                contentScale = ContentScale.Crop
            )
            Image(
                painter = painterResource(id = R.drawable.editar),
                contentDescription = "image description",
                modifier = Modifier
                    .size(48.dp)
                    .offset(y=20.dp),
                contentScale = ContentScale.FillBounds
            )
            Spacer(modifier=Modifier.width(10.dp))
        }
    }
}

