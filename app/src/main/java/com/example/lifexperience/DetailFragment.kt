package com.example.lifexperience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class DetailFragment: Fragment() {
    private lateinit var placeName: TextView
    private lateinit var placeDescription: TextView
    private lateinit var placeImage: ImageView

    // Traemos todas las views desde el layout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_lugar, container, false)

        placeName = view.findViewById(R.id.headerTitle)
        placeDescription = view.findViewById(R.id.description)
        placeImage = view.findViewById(R.id.imageBack)

        return view
    }

    fun showProduct(place: PlaceMain){
        view?.visibility = View.VISIBLE
        placeName.text = place.name
        placeDescription.text = place.description
        //rbRate.rating = product.rating
        placeImage.setImageResource(place.idImage)
        //tvPrice.text = product.price
    }
}