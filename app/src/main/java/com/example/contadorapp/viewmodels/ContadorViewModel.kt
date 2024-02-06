package com.example.contadorapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContadorViewModel:ViewModel() {

    private val _contador = MutableLiveData<Int>()

    val contador:LiveData<Int> = _contador

    fun addContador(contador:Int){
        _contador.value = contador.plus(1)
    }


    fun minusContador(contador:Int){
        if(contador > 0) {
            _contador.value = contador.minus(1)
        }else _contador.value = 0
    }
}