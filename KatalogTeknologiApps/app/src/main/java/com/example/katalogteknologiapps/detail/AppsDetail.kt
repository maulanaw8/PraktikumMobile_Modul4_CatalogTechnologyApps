package com.example.katalogteknologiapps.detail

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.katalogteknologiapps.databinding.FragmentDetailBinding

class AppsDetail: AppCompatActivity() {
    private var _binding: FragmentDetailBinding?= null
    private val binding get() = _binding!!

    companion object {
        const val EXTRA_IMAGE = "image"
        const val EXTRA_NAME = "name"
        const val EXTRA_DESCRIPTION = "description"
        const val EXTRA_PRICE = "price"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = FragmentDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.detailImage
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val name = binding.detailName
        name.text = intent?.getStringExtra(EXTRA_NAME).toString()

        val description = binding.detailDeskripsi
        description.text = intent?.getStringExtra(EXTRA_DESCRIPTION).toString()

        val price = binding.detailHarga
        price.text = intent?.getStringExtra(EXTRA_PRICE).toString()

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home -> {
                finish()
                true
            } else -> super.onOptionsItemSelected(item)
        }
    }
}