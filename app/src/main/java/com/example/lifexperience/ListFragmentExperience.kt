package com.example.lifexperience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list_experience.*

class ListFragmentExperience: Fragment() {
    private lateinit var mAdapterExperience: RecyclerAdapterExperience
    private var listener: (Experience) -> Unit = {}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // infla el layout para este Fragment
        return inflater.inflate(R.layout.fragment_list_experience, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //super.onCreate(Bundle)
        setUpRecyclerView()
    }

    fun setListener(l: (Experience) ->Unit){
        listener = l
    }

    private fun setUpRecyclerView(){
        recyclerExperiences.setHasFixedSize(true)
        //recyclerPlacesPopular.layoutManager = LinearLayoutManager(activity)
        recyclerExperiences.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        //seteando el Adapter
        mAdapterExperience = RecyclerAdapterExperience( requireActivity(), getExperiences(), listener)
        //asignando el Adapter al RecyclerView
        recyclerExperiences.adapter = mAdapterExperience
    }

    private fun getExperiences(): MutableList<Experience>{
        var experiences:MutableList<Experience> = ArrayList()

        experiences.add(Experience("Eating Ramen", "Taste one of the best plates of Japan gastronomy.", 4.9f, R.drawable.ramen))
        experiences.add(Experience("Sushi Experience", "Famous worldwide, modern sushi is a delicious mix of old and new traditions. From tuna to eel, find your favorite as you explore the world of fresh fish and seafood.", 4.7f, R.drawable.sushi))
        experiences.add(Experience("Hachiko Statue", "Snap a photo in front of Shibuya’s main meeting point, a statue honoring the most loyal dog in Japan.", 5.0f, R.drawable.hachiko))
        experiences.add(Experience("Walks and tours", "Covering a selection of Tokyo neighborhoods from central to suburban, find out what you can see and do with your time in the city..", 4.7f, R.drawable.city))

        return experiences
    }
}