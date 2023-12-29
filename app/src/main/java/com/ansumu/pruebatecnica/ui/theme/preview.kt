package com.ansumu.pruebatecnica.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.ansumu.pruebatecnica.R

@Composable
fun prueba() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start=20.dp)
    ) {
        Column() {
            Image(
                painter = painterResource(id = R.drawable.cabficha),
                contentDescription = "image description",
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { },
                contentScale = ContentScale.FillWidth
            )


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 0.dp, vertical = 8.dp)
                    .offset(x=10.dp,y=-40.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val foto=R.drawable.cabficha
                Image(
                    painter = painterResource(id = R.drawable.cabficha),
                    contentDescription = "User Image",
                    modifier = Modifier
                        .padding(3.dp)
                        .clip(CircleShape)
                        .border(width = 3.dp, color = Color.White, shape = CircleShape)
                        .size(77.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier=Modifier.width(10.dp))

                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.camara),
                    contentDescription = "image description",
                    modifier = Modifier
                        .size(48.dp),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = painterResource(id = R.drawable.editar),
                    contentDescription = "image description",
                    modifier = Modifier
                        .size(48.dp),
                    contentScale = ContentScale.FillBounds
                )
                Spacer(modifier=Modifier.width(10.dp))

            }

            Image(
                painter = painterResource(id = R.drawable.localiza),
                contentDescription = "image description",
                modifier = Modifier
                    .width(24.dp)
                    .height(30.dp)
                    .offset(x=10.dp,y=-10.dp),
                contentScale = ContentScale.Crop
            )
        }


    }
}

@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun PreviewPrueba() {
    val backgroundColor = Color.White
    Box(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(backgroundColor)
    ) {
        prueba()
    }
}