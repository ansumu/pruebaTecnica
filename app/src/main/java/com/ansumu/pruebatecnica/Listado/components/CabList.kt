package com.ansumu.pruebatecnica.Listado.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ansumu.pruebatecnica.ListViewModel
import com.ansumu.pruebatecnica.R

@Composable
fun CabList(navController: NavHostController, viewModel: ListViewModel) {
    val showDialog = remember { mutableStateOf(false) }
    SearchDialog(viewModel, showDialog)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 0.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier=Modifier.width(10.dp))
        Image(
            painter = painterResource(id = R.drawable.izquierda),
            contentDescription = "image description",
            modifier = Modifier
                .size(26.dp)
                .clickable { navController.popBackStack() },
            contentScale = ContentScale.Fit
        )
        Image(
            painter = painterResource(id = R.drawable.contactos),
            contentDescription = "image description",
            modifier = Modifier
                .padding(10.dp)
                .height(24.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(id = R.drawable.submenu),
            contentDescription = "image description",
            modifier = Modifier
                .size(32.dp)
                .clickable { showDialog.value = true },
            contentScale = ContentScale.Fit
        )
        Spacer(modifier=Modifier.width(10.dp))
    }
}

