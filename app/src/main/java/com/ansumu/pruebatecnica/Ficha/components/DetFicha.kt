package com.ansumu.pruebatecnica.Ficha.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ansumu.pruebatecnica.R

@Composable
fun DetFicha(imagePainter: Painter, titulo: String, dato: String) {
    Row(modifier=Modifier
        .fillMaxWidth()
        .height(65.dp)) {
        Image(
            painter = imagePainter,
            contentDescription = "image description",
            modifier = Modifier
                .padding(1.dp)
                .width(32.dp)
                .height(32.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier=Modifier.width(20.dp))
        Column(modifier=Modifier.padding(end=20.dp).align(Alignment.Top) ) {
            Text(
                text = titulo,
                style = TextStyle(
                    fontSize = 11.sp,
                    lineHeight = 14.sp,
                    fontFamily = FontFamily(Font(R.font.open_sans)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF707070),
                ),
                modifier = Modifier
                    .width(282.dp)
                    .height(14.dp)
            )

            Spacer(modifier=Modifier.height(5.dp))
            Text(
                text = dato,
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 18.sp,
                    fontFamily = FontFamily(Font(R.font.open_sans)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                ),
                modifier = Modifier
                    .width(282.dp)
                    .height(18.dp)
            )
            Spacer(modifier=Modifier.height(10.dp))
            Image(
                painter = painterResource(id = R.drawable.linea),
                contentDescription = "image description",
                modifier = Modifier
                    .border(width = 1.dp, color = Color(0xFFE7E7E7), shape = RoundedCornerShape(size = 3.dp))
                    .fillMaxWidth(1f)
                    .height(1.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}

