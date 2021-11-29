package com.example.lifexperience

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(
    private val context: Context,
    private val places: MutableList<PlaceMain>,
    private val clickListener: (PlaceMain) -> Unit): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val place = places.get(position)
        holder.bind(place, context)

        //holder.view.setOnClickListener{clickListener(place)}
        holder.view.setOnClickListener{clickListener(place)}
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.card_images_places, parent, false))
    }

    override fun getItemCount(): Int {
        //println(places.size)
        return places.size
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        //obteniendo las referencias a las Views
        val placeName = view.findViewById<TextView>(R.id.nameRecommended) as TextView
        val placeImage = view.findViewById(R.id.imageRecommended) as ImageView

        //"atando" los datos a las Views
        fun bind(place: PlaceMain, context: Context){
            placeName.text = place.name
            placeImage.setImageResource(place.idImage)
        }
    }
}