package com.example.lifexperience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragmentPlaces: Fragment() {
    private lateinit var placeName: TextView
    private lateinit var placeDescription: TextView
    private lateinit var placeImage: ImageView

    // Bring up all views from layout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_place, container, false)

        placeName = view.findViewById(R.id.headerTitle)
        placeDescription = view.findViewById(R.id.description)
        placeImage = view.findViewById(R.id.imageBack)

        return view
    }

    fun showPlaces(place: Place){
        view?.visibility = View.VISIBLE
        placeName.text = place.name
        placeDescription.text = place.description
        placeImage.setImageResource(place.idImage)
    }
}