package com.example.lifexperience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list_popular.*

class ListFragmentPopular: Fragment() {
    private lateinit var mAdapterPopular : RecyclerAdapterPopular
    private var listener : (PlaceMain) ->Unit = {}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // infla el layout para este Fragment
        return inflater.inflate(R.layout.fragment_list_popular, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //super.onCreate(Bundle)
        setUpRecyclerView()
    }

    fun setListener(l: (PlaceMain) ->Unit){
        listener = l
    }

    private fun setUpRecyclerView(){
        recyclerPlacesPopular.setHasFixedSize(true)
        //recyclerPlaces.layoutManager = LinearLayoutManager(activity)
        recyclerPlacesPopular.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        //seteando el Adapter
        mAdapterPopular = RecyclerAdapterPopular( requireActivity(), getPlaces(), listener)
        //asignando el Adapter al RecyclerView
        recyclerPlacesPopular.adapter = mAdapterPopular
    }

    private fun getPlaces(): MutableList<PlaceMain>{
        var places:MutableList<PlaceMain> = ArrayList()

        places.add(PlaceMain("Sidney", "Sideny description",R.drawable.sidney))
        places.add(PlaceMain("Madrid", "Madrid description",R.drawable.madrid))
        places.add(PlaceMain("Paris", "Paris description",R.drawable.paris))
        places.add(PlaceMain("Tokio", "Tokio description",R.drawable.tokio))


        return places
    }

}