package com.example.universe.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.universe.MainActivity.Companion.INTENT_PARCELABLE
import com.example.universe.PlanetAdapter
import com.example.universe.UniverseDetail
import com.example.universe.R
import com.example.universe.listPlanet

// Fragment Planet
class PlanetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_planet, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PlanetAdapter(listPlanet) { planet ->
            val intent = Intent(requireContext(), UniverseDetail::class.java)
            intent.putExtra(INTENT_PARCELABLE, planet)
            startActivity(intent)
        }
        return view
    }

    companion object {
        fun newInstance(): PlanetFragment {
            return PlanetFragment()
        }
    }
}
