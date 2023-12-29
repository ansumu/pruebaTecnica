package com.ansumu.pruebatecnica.Ficha

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FichaViewModel : ViewModel() {
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> get() = _isLoading

    private val _nombre = MutableLiveData<String>()
    val nombre : LiveData<String> = _nombre

    private val _email = MutableLiveData<String>()
    val email : LiveData<String> = _email

    private val _genero = MutableLiveData<String>()
    val genero : LiveData<String> = _genero

    private val _fecha = MutableLiveData<String>()
    val fecha : LiveData<String> = _fecha

    private val _telefono = MutableLiveData<String>()
    val telefono : LiveData<String> = _telefono



}
