package com.example.lifexperience

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterPopular (
    private val context: Context,
    private val places: MutableList<Place>,
    private val clickListener: (Place) -> Unit): RecyclerView.Adapter<RecyclerAdapterPopular.ViewHolder>() {

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val place = places.get(position)
            holder.bind(place, context)
            holder.view.setOnClickListener { clickListener(place) }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return ViewHolder(layoutInflater.inflate(R.layout.card_circle_images_places, parent,false))
        }

        override fun getItemCount(): Int {
            return places.size
        }

        class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

            // Getting references from views
            val placeName = view.findViewById(R.id.namePopular) as TextView
            val placeImage = view.findViewById(R.id.imagePopular) as ImageView

            // Attaching data to views
            fun bind(place: Place, context: Context) {
                placeName.text = place.name
                placeImage.setImageResource(place.idImage)
            }
        }
}