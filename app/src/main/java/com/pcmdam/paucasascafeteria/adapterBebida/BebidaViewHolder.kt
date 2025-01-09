package com.pcmdam.paucasascafeteria.adapterBebida

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.pcmdam.paucasascafeteria.Bebida
import com.bumptech.glide.Glide
import com.paucmd.cafeteria.R

class BebidaViewHolder(view: View):ViewHolder(view) {

    val name = view.findViewById<TextView>(R.id.nameBebida)
    val price = view.findViewById<TextView>(R.id.priceBebida)
    val photo = view.findViewById<ImageView>(R.id.photoBebida)


    fun render(bebidaModel: Bebida){
        name.text = bebidaModel.name
        price.text = bebidaModel.price
        Glide.with(photo.context).load(bebidaModel.photo).into(photo)
    }
}