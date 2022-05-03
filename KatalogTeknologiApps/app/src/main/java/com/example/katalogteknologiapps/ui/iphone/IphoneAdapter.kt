package com.example.katalogteknologiapps.ui.iphone

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.katalogteknologiapps.detail.AppsDetail
import com.example.katalogteknologiapps.model.AppsModel
import com.example.katalogteknologiapps.viewmodel.AppsViewModel
import com.example.katalogteknologiapps.R

class IphoneAdapter(
    private val context: Context,
    private val dataset: List<AppsModel>
) : RecyclerView.Adapter<IphoneAdapter.IphoneViewHolder>() {
    private val viewModel = AppsViewModel()

    class IphoneViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val iphoneImageView: ImageView = view.findViewById(R.id.itemPicture)
        val iphoneNameText: TextView = view.findViewById(R.id.itemName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IphoneViewHolder {
        val adapterLayout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.fragment_item, parent, false)
        return IphoneViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: IphoneViewHolder, position: Int) {
        val item = dataset[position]
        holder.iphoneImageView.setImageResource(item.imageResourceId)
        holder.iphoneNameText.text = context.resources.getString(item.name)

        holder.itemView.setOnClickListener {
            viewModel.setApps(item, context)
            val intent = Intent(context, AppsDetail::class.java).apply {
                putExtra("image", viewModel.image.value)
                putExtra("name", viewModel.name.value)
                putExtra("description", viewModel.deskripsi.value)
                putExtra("price", viewModel.harga.value)
            }
            context.startActivity(intent)
        }
    }
}