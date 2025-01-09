package com.pcmdam.paucasascafeteria.adapterComida

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.pcmdam.paucasascafeteria.Comida
import com.bumptech.glide.Glide
import com.paucmd.cafeteria.R

class ComidaViewHolder(view: View):ViewHolder(view) {

    val name = view.findViewById<TextView>(R.id.nameComida)
    val price = view.findViewById<TextView>(R.id.priceComida)
    val photo = view.findViewById<ImageView>(R.id.photoComida)


    fun render(comidaModel: Comida){
        name.text = comidaModel.name
        price.text = comidaModel.price
        Glide.with(photo.context).load(comidaModel.photo).into(photo)
    }
}