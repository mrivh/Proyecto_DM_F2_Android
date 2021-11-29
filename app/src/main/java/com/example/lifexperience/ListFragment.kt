package com.example.lifexperience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment: Fragment() {

    private lateinit var mAdapter : RecyclerAdapter
    private var listener : (PlaceMain) ->Unit = {}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // infla el layout para este Fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //super.onCreate(Bundle)
        setUpRecyclerView()
    }

    fun setListener(l: (PlaceMain) ->Unit){
        listener = l
    }

    //configuramos lo necesario para desplegar el RecyclerView
    private fun setUpRecyclerView(){
        recyclerPlaces.setHasFixedSize(true)
        //recyclerPlaces.layoutManager = LinearLayoutManager(activity)
        recyclerPlaces.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        //seteando el Adapter
        mAdapter = RecyclerAdapter( requireActivity(), getPlaces(), listener)
        //asignando el Adapter al RecyclerView
        recyclerPlaces.adapter = mAdapter
    }

    private fun getPlaces(): MutableList<PlaceMain>{
        var places:MutableList<PlaceMain> = ArrayList()

        places.add(PlaceMain("Tokio", "Tokio description",R.drawable.tokio))
        places.add(PlaceMain("Madrid", "Madrid description",R.drawable.madrid))
        places.add(PlaceMain("Santorini", "Santorini description",R.drawable.santorini))
        places.add(PlaceMain("Italia", "Italia description",R.drawable.italia))
        places.add(PlaceMain("Paris", "Paris description",R.drawable.paris))
        places.add(PlaceMain("Sidney", "Sideny description",R.drawable.sidney))

        return places
    }
}