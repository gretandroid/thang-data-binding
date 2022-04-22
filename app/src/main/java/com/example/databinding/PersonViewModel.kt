package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PersonViewModel() : ViewModel() {

    private val _matricule = MutableLiveData(10)
    private val _name = MutableLiveData("PHAM")
    private val _firstName = MutableLiveData("Thang")
    private val _age = MutableLiveData(40)

    val matricule = _matricule
    val name = _name
    val firstName = _firstName
    val age = _age

    fun increaseAge () {
        _age.value = _age.value?.plus(1)
    }
    fun decreaseAge () {
        _age.value = _age.value?.minus(1)
    }
}