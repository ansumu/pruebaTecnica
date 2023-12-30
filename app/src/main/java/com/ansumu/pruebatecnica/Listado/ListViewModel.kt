package com.ansumu.pruebatecnica

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ansumu.pruebatecnica.Model.User
import com.ansumu.pruebatecnica.Model.config
import com.ansumu.pruebatecnica.Network.RetrofitClient
import com.ansumu.pruebatecnica.Network.WebServiceApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListViewModel : ViewModel() {
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> get() = _isLoading

    private var _listUsuarios = MutableLiveData<List<User>>()
    val listUsuarios: LiveData<List<User>> get() = _listUsuarios

    private val _searchQuery = mutableStateOf("")
    val searchQuery: MutableState<String> = _searchQuery

    private val _allUsers = MutableLiveData<List<User>>()

    fun filterList() {
        val query = searchQuery.value
        _listUsuarios.value = if (query.isBlank()) {
            _allUsers.value
        } else {
            _allUsers.value?.filter {
                it.name.first.contains(query, ignoreCase = true) || it.name.last.contains(query, ignoreCase = true) || it.email.contains(query, ignoreCase = true)
            }
        }
    }

    fun cargarListadoUsuarios() {
        _isLoading.value = true
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val service = RetrofitClient.createService(WebServiceApi::class.java)
                val result = service.getListado(config.numRegistros)

                withContext(Dispatchers.Main) {
                    if (result.isSuccessful) {
                        val usuariosDuplicados = result.body()?.results
                        val uniqueUsers =usuariosDuplicados?.distinctBy { Pair(it.name, it.email) }
                        _listUsuarios.value = uniqueUsers ?: emptyList()
                        _allUsers.value = uniqueUsers ?: emptyList()

                        val responseData = result.body()
                        Log.d("WebServiceApi", "Response: $responseData")
                    } else {
                        _listUsuarios.value = emptyList()
                        println("Lista vacia")
                    }
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    _listUsuarios.value = emptyList()
                }
            } finally {
                withContext(Dispatchers.Main) {
                    _isLoading.value = false
                }
            }
        }
    }
}

