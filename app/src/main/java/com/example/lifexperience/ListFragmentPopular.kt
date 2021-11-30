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
    private var listener : (Place) ->Unit = {}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate layout for this Fragment
        return inflater.inflate(R.layout.fragment_list_popular, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpRecyclerView()
    }

    fun setListener(l: (Place) ->Unit){
        listener = l
    }

    private fun setUpRecyclerView(){
        recyclerPlacesPopular.setHasFixedSize(true)
        //recyclerPlacesPopular.layoutManager = LinearLayoutManager(activity)
        recyclerPlacesPopular.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        // Setting adapter
        mAdapterPopular = RecyclerAdapterPopular( requireActivity(), getPlaces(), listener)
        // Assign adapter to RecyclerView
        recyclerPlacesPopular.adapter = mAdapterPopular
    }

    private fun getPlaces(): MutableList<Place>{
        var places:MutableList<Place> = ArrayList()

        places.add(Place("Sydney", "Welcome to Sydney, with new experiences around every corner. As the official tourism, destinations and events website, let us guide you through this surprising city. Wildlife, nightlife, the good life – this is Sydney. Hidden restaurants down historic laneways, famous icons on Sydney Harbour, an endless calendar of events. Golden sands, turquoise oceans, dewy green rainforests. Bring the family, your best mates, your soul mate — and feel the city’s heartbeat all year round. So, where to first?",R.drawable.sidney))
        places.add(Place("Madrid", "Madrid, cheerful and vibrant at all hours, is famous for being an open city with all kinds of people from anywhere in the world. In addition to its famous museums, busy streets dotted with all kinds of shops, restaurants with world cuisine or unbeatable nightlife, Madrid will surprise you with its charming, tranquil historic spots, with traditional and family-run century-old bars where friends meet up for a drink, all kinds of neighbourhoods, and cultural centres that offer an alternative type of tourism. Madrid has an authenticity that is hard to match. It is welcoming and diverse. Madrid is, without a doubt, one of Europe’s most interesting cities.",R.drawable.madrid))
        places.add(Place("Paris", "Paris is a city that seems designed for the enjoyment of the traveler . Its streets, squares , buildings, gardens and monuments seem designed so that anyone who visits Paris wants to return. Visiting the Eiffel Tower , the Arc de Triomphe or the Notre Dame Cathedral , attending a cabaret show at the mythical Moulin Rouge , or walking through some of the most picturesque neighborhoods of the city such as Montmartre or Montparnasse, are some of the experiences that everyone should have the opportunity to enjoy.",R.drawable.paris))
        places.add(Place("Tokyo", "Tokyo (東京, Tōkyō) is Japan's capital and the world's most populous metropolis. It is also one of Japan's 47 prefectures, consisting of 23 central city wards and multiple cities, towns and villages west of the city center. The Izu and Ogasawara Islands are also part of Tokyo. \n\n Today, Tokyo offers a seemingly unlimited choice of shopping, entertainment, culture and dining to its visitors. The city's history can be appreciated in districts such as Asakusa and in many excellent museums, historic temples and gardens. Contrary to common perception, Tokyo also offers a number of attractive green spaces in the city center and within relatively short train rides at its outskirts.",R.drawable.tokio))

        return places
    }

}