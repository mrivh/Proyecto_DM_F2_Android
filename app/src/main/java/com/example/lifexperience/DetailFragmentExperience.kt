package com.example.lifexperience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlin.math.exp

class DetailFragmentExperience: Fragment() {
    private lateinit var experienceName: TextView
    private lateinit var experienceDescription: TextView
    private lateinit var experienceRating: TextView
    private lateinit var experienceImage: ImageView

    // Bring up all views from layout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_descriptions, container, false)

        experienceName = view.findViewById(R.id.descriptionExperienceName)
        experienceDescription = view.findViewById(R.id.descriptionExperience)
        experienceRating = view.findViewById(R.id.textDescriptionRatings)
        experienceImage = view.findViewById(R.id.imageExperience)

        return view
    }

    fun showExperiences(experience: Experience){
        view?.visibility = View.VISIBLE
        experienceName.text = experience.name
        experienceDescription.text = experience.description
        experienceRating.text = experience.rating.toString()
        experienceImage.setImageResource(experience.idImage)
    }
}