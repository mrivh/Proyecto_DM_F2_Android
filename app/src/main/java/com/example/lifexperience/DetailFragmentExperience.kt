package com.example.lifexperience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class DetailFragmentExperience: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_descripciones, container, false)

        /*tvProduct = view.findViewById(R.id.tvProduct)
        tvDescription = view.findViewById(R.id.tvDescription)
        rbRate = view.findViewById(R.id.rbRate)
        imgProduct = view.findViewById(R.id.imgProduct)
        tvPrice = view.findViewById(R.id.tvPrice)*/

        return view
    }
}