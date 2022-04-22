package com.example.databinding

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

data class ObservablePerson(
    var matricule : ObservableInt,
    var name : ObservableField<String>,
    var firstName : ObservableField<String>,
    var age : ObservableInt
) {
    fun increaseAge() {
        age.set(age.get() + 1)
    }

    fun decreaseAge() {
        age.set(age.get() - 1)
    }
}
