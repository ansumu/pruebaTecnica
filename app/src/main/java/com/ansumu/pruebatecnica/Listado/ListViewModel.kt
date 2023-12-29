package com.ansumu.pruebatecnica

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ansumu.pruebatecnica.Model.User
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

    fun cargarListadoUsuarios() {
        _isLoading.value = true
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val service = RetrofitClient.createService(WebServiceApi::class.java)
                val result = service.getListado()

                withContext(Dispatchers.Main) {
                    if (result.isSuccessful) {
                        _listUsuarios.value = result.body()?.results
                        println(_listUsuarios.value)
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

