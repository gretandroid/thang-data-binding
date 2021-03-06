package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModelProvider
import com.example.databinding.databinding.ActivityMainBinding
// => 1e challenge : Two way dat binding
// => ajouter un slider (SeekBar) pour modifier l'age

// => 2e challenge : correction deux dés avec ModelViewScope
// objectif :
// 1 - ajoute dependance pour le ViewModelScope
// 2 - dans view model creer un MutualLiveData avec l'index et valeur
// 3 - dans un ViewModelScope créer la coroutine calcul valeur du dé
// répeter 20 fois
// 4 - dans MainActivity creer un observer qui va permetre afficher les dés

class MainActivity : AppCompatActivity() {

//    private val person2 = ObservablePerson(
//        ObservableInt(1),
//        ObservableField("PHAM"),
//        ObservableField("Thang"),
//        ObservableInt(40))

    private lateinit var model : PersonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
// binding without observe
//        val person1 = Person(1, "PHAM", "Thang", 40)
//        binding.person = person1

    // binding with observe
//        binding.person = person2

        // binding with modelview
        model = ViewModelProvider(this).get(PersonViewModel::class.java)
        binding.person = model
        binding.lifecycleOwner = this
    }
}