package com.pcmdam.paucasascafeteria.adapterComida

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.pcmdam.paucasascafeteria.Comida
import com.bumptech.glide.Glide
import com.paucmd.cafeteria.R
import com.pcmdam.paucasascafeteria.cartmanager

class ComidaViewHolder(view: View):ViewHolder(view) {

    val name = view.findViewById<TextView>(R.id.nameComida)
    val price = view.findViewById<TextView>(R.id.priceComida)
    val photo = view.findViewById<ImageView>(R.id.photoComida)
    val addButton = view.findViewById<Button>(R.id.addButton)
    val removeButton = view.findViewById<Button>(R.id.removebutton)



    fun render(comidaModel: Comida){
        name.text = comidaModel.name
        price.text = comidaModel.price
        Glide.with(photo.context).load(comidaModel.photo).into(photo)

        addButton.setOnClickListener {
            cartmanager.addItem(bebidaModel.name)
        }

        removeButton.setOnClickListener{
            cartmanager.removeitem(bebidaModel.name)
        }

    }
}