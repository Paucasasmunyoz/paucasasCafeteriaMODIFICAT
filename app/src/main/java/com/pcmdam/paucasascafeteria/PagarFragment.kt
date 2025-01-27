package com.pcmdam.paucasascafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.paucmd.cafeteria.R

class PagarFragment : Fragment() {

    private lateinit var totalItemsTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pagar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        totalItemsTextView = view.findViewById(R.id.totalItemsTextView)

        updateTotalItems()

    }

        fun updateTotalItems () {
            val totalItems = cartmanager.getTotalItems()
            totalItemsTextView.text = "Productes seleccionats: $totalItems"
        }

        override fun onResume() {
             super.onResume()
            updateTotalItems()
        }

    }



}