package com.pcmdam.paucasascafeteria.adapterBebida

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.pcmdam.paucasascafeteria.Bebida
import com.bumptech.glide.Glide
import com.pcmdam.paucasascafeteria.cartmanager
import com.paucmd.cafeteria.R

class BebidaViewHolder(view: View):ViewHolder(view) {

    val name = view.findViewById<TextView>(R.id.nameBebida)
    val price = view.findViewById<TextView>(R.id.priceBebida)
    val photo = view.findViewById<ImageView>(R.id.photoBebida)
    val addButton = view.findViewById<Button>(R.id.addButton)
    val removeButton = view.findViewById<Button>(R.id.removebutton)


    fun render(bebidaModel: Bebida){
        name.text = bebidaModel.name
        price.text = bebidaModel.price
        Glide.with(photo.context).load(bebidaModel.photo).into(photo)

        addButton.setOnClickListener {
            cartmanager.addItem(bebidaModel.name)
        }

        removeButton.setOnClickListener{
            cartmanager.removeitem(bebidaModel.name)
        }



    }
}