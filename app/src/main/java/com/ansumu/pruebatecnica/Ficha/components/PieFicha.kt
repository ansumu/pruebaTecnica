package com.ansumu.pruebatecnica.Ficha.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ansumu.pruebatecnica.R

@Composable
fun PieFicha() {
    Column(modifier=Modifier.padding(start=30.dp,end=20.dp)) {
        Text(
            text = "Dirección",
            style = TextStyle(
                fontSize = 11.sp,
                lineHeight = 14.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF707070),
            )
        )
        Spacer(modifier=Modifier.height(10.dp))
        Image(
            painter = painterResource(id = R.drawable.mapa),
            contentDescription = "image description",
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Image(
            painter = painterResource(id = R.drawable.localiza),
            contentDescription = "image description",
            modifier = Modifier
                .width(24.dp)
                .height(30.dp)
                .offset(x=150.dp,y=-100.dp),
            contentScale = ContentScale.Crop
        )
    }
}