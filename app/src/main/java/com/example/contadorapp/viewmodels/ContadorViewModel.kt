package com.example.contadorapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContadorViewModel:ViewModel() {

    private val _contador = MutableLiveData<Int>(0)

    val contador:LiveData<Int> = _contador

    fun addContador(){
        _contador.value = _contador.value?.plus(1)
    }


    fun minusContador(){
        if(_contador.value!! > 0) {
            _contador.value = _contador.value?.minus(1)
        }else _contador.value = 0
    }
}