package com.example.katalogteknologiapps.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class AppsModel (
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val description: Int,
    @StringRes val price: Int
)