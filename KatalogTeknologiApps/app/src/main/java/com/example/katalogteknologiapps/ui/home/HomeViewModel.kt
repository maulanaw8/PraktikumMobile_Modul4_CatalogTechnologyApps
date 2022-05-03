package com.example.katalogteknologiapps.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.katalogteknologiapps.R

class HomeViewModel() : ViewModel() {
    private val _text = MutableLiveData<String>()
    val text: LiveData<String> get() = _text

    fun text(){
        _text.value = R.string.welcome.toString()
    }
}