package com.example.katalogteknologiapps.data

import androidx.lifecycle.ViewModel
import com.example.katalogteknologiapps.model.AppsModel
import com.example.katalogteknologiapps.R

class DataSource : ViewModel() {
    fun loadIphone(): List<AppsModel> {
        return listOf(
            AppsModel(
                R.drawable.ip1,
                R.string.iphone1,
                R.string.deskripsiIp1,
                R.string.hargaIp1
            ),
            AppsModel(
                R.drawable.ip2,
                R.string.iphone2,
                R.string.deskripsiIp2,
                R.string.hargaIp2
            ),
            AppsModel(
                R.drawable.ip3,
                R.string.iphone3,
                R.string.deskripsiIp2,
                R.string.hargaIp3
            ),
            AppsModel(
                R.drawable.ip4,
                R.string.iphone4,
                R.string.deskripsiIp4,
                R.string.hargaIp4
            ),
            AppsModel(
                R.drawable.ip5,
                R.string.iphone5,
                R.string.deskripsiIp5,
                R.string.hargaIp5
            ),
            AppsModel(
                R.drawable.ip6,
                R.string.iphone6,
                R.string.deskripsiIp6,
                R.string.hargaIp6
            ),
            AppsModel(
                R.drawable.ip7,
                R.string.iphone7,
                R.string.deskripsiIp7,
                R.string.hargaIp7
            ),
            AppsModel(
                R.drawable.ip8,
                R.string.iphone8,
                R.string.deskripsiIp8,
                R.string.hargaIp8
            )
        )
    }

    fun loadLaptop(): List<AppsModel> {
        return listOf(
            AppsModel(
                R.drawable.msi1,
                R.string.laptop1,
                R.string.deskripsiLaptop1,
                R.string.hargaLaptop1
            ),
            AppsModel(
                R.drawable.msi2,
                R.string.laptop2,
                R.string.deskripsiLaptop2,
                R.string.hargaLaptop2
            ),
            AppsModel(
                R.drawable.msi3,
                R.string.laptop3,
                R.string.deskripsiLaptop3,
                R.string.hargaLaptop3
            ),
            AppsModel(
                R.drawable.msi4,
                R.string.laptop4,
                R.string.deskripsiLaptop4,
                R.string.hargaLaptop4
            ),
            AppsModel(
                R.drawable.msi5,
                R.string.laptop5,
                R.string.deskripsiLaptop5,
                R.string.hargaLaptop5
            ),
            AppsModel(
                R.drawable.msi6,
                R.string.laptop6,
                R.string.deskripsiLaptop6,
                R.string.hargaLaptop6
            ),
            AppsModel(
                R.drawable.msi7,
                R.string.laptop7,
                R.string.deskripsiLaptop7,
                R.string.hargaLaptop7
            ),
            AppsModel(
                R.drawable.msi8,
                R.string.laptop8,
                R.string.deskripsiLaptop8,
                R.string.hargaLaptop8
            )
        )
    }

    fun loadWatch(): List<AppsModel> {
        return listOf(
            AppsModel(
                R.drawable.sw1,
                R.string.watch1,
                R.string.deskripsiWatch1,
                R.string.hargaWatch1
            ),
            AppsModel(
                R.drawable.sw2,
                R.string.watch2,
                R.string.deskripsiWatch2,
                R.string.hargaWatch2
            ),
            AppsModel(
                R.drawable.sw3,
                R.string.watch3,
                R.string.deskripsiWatch3,
                R.string.hargaWatch3
            ),
            AppsModel(
                R.drawable.sw4,
                R.string.watch4,
                R.string.deskripsiWatch4,
                R.string.hargaWatch4
            ),
            AppsModel(
                R.drawable.sw5,
                R.string.watch5,
                R.string.deskripsiWatch5,
                R.string.hargaWatch5
            ),
            AppsModel(
                R.drawable.sw6,
                R.string.watch6,
                R.string.deskripsiWatch6,
                R.string.hargaWatch6
            )
        )
    }
}