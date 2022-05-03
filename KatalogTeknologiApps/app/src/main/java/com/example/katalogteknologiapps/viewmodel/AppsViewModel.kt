package com.example.katalogteknologiapps.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.katalogteknologiapps.model.AppsModel

class AppsViewModel: ViewModel() {
    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _deskripsi = MutableLiveData<String>()
    val deskripsi: LiveData<String> = _deskripsi

    private val _harga = MutableLiveData<String>()
    val harga: LiveData<String> = _harga


    fun setApps(apps: AppsModel, context: Context) {
        _image.value = apps.imageResourceId
        _name.value = context.resources.getString(apps.name)
        _deskripsi.value = context.resources.getString(apps.description)
        _harga.value = context.resources.getString(apps.price)
    }}