package com.ansumu.pruebatecnica.Listado.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.ansumu.pruebatecnica.ListViewModel

@Composable
fun SearchDialog(viewModel: ListViewModel, showDialog: MutableState<Boolean>) {
    if (showDialog.value) {
        AlertDialog(
            onDismissRequest = { showDialog.value = false },
            title = { Text("Buscar contacto") },
            text = {
                Column {
                    TextField(
                        value = viewModel.searchQuery.value,
                        onValueChange = { newValue ->
                            viewModel.searchQuery.value = newValue
                        },
                        placeholder = { Text("Escribe el nombre o email") }
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        viewModel.filterList()
                        showDialog.value = false
                    }
                ) {
                    Text("Buscar")
                }
            },
            dismissButton = {
                Button(onClick = { showDialog.value = false }) {
                    Text("Cancelar")
                }
            }
        )
    }
}

