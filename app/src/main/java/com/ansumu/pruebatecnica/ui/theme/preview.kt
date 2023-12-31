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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.ansumu.pruebatecnica.R
import java.util.Locale

@Composable
fun prueba() {
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
                    .size(32.dp)
                    .clickable {  }
                    .graphicsLayer {
                        alpha = 1f
                    },
                colorFilter = ColorFilter.tint(Color.White),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier=Modifier.width(10.dp))
            val texto="Miriam sánchez".toUpperCase(Locale.ROOT)
            Text(
                text = texto,
                style = TextStyle(
                    fontSize = 16.sp,
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

@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun PreviewPrueba() {
    val backgroundColor = Color.Gray
    Box(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(backgroundColor)
    ) {
        prueba()
    }
}