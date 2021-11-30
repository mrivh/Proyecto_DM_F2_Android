package com.example.lifexperience

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterExperience (
    private val context: Context,
    private val experiences: MutableList<Experience>,
    private val clickListener: (Experience) -> Unit): RecyclerView.Adapter<RecyclerAdapterExperience.ViewHolder>() {

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val experience = experiences.get(position)
            holder.bind(experience, context)

            holder.view.setOnClickListener { clickListener(experience) }

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return ViewHolder(layoutInflater.inflate(R.layout.card_images_experiences, parent, false))
        }

        override fun getItemCount(): Int {
            return experiences.size
        }

        class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

            //obteniendo las referencias a las Views
            val experienceName = view.findViewById<TextView>(R.id.nameExperience) as TextView
            val experienceRating = view.findViewById(R.id.ratingExperience) as TextView
            val experienceImage = view.findViewById(R.id.imageExperience) as ImageView

            //"atando" los datos a las Views
            fun bind(experience: Experience, context: Context) {
                experienceName.text = experience.name
                experienceRating.text = experience.rating.toString()
                experienceImage.setImageResource(experience.idImage)
            }
        }
}