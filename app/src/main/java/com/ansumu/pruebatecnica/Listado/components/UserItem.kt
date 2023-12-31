package com.ansumu.pruebatecnica.Listado.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.ansumu.pruebatecnica.Model.User
import com.ansumu.pruebatecnica.Model.usuario
import com.ansumu.pruebatecnica.R
import com.ansumu.pruebatecnica.ui.theme.Pantallas

@Composable
fun UserItem(user: User, navController: NavHostController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                usuario.name="${user.name.first} ${user.name.last}"
                usuario.email=user.email
                usuario.gender=user.gender
                usuario.fecha=user.registered.date
                usuario.phone=user.phone
                usuario.foto=user.picture.thumbnail
                navController.navigate(Pantallas.FichaScreen.ruta)
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(modifier=Modifier.width(10.dp))
        Image(
            painter = rememberImagePainter(
                data = user.picture.thumbnail,
                builder = {
                    crossfade(true)
                }
            ),
            contentDescription = "User Image",
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Column {
            Text(text = "${user.name.first} ${user.name.last}", style = MaterialTheme.typography.h6)
            Text(
                text = user.email,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF8E8E93)
                ),
                modifier = Modifier
                    .width(180.dp)
                    .height(17.dp)
            )

        }
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(id = R.drawable.derecha),
            contentDescription = "image description",
            modifier = Modifier
                .size(32.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier=Modifier.width(10.dp))
    }
}

