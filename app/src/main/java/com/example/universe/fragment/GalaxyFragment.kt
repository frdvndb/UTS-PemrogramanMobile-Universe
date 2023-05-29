package com.example.universe.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.universe.*
import com.example.universe.MainActivity.Companion.INTENT_PARCELABLE

// Fragment Galaxy
class GalaxyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_galaxy, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = GalaxyAdapter(listGalaxy) { galaxy ->
            val intent = Intent(requireContext(), UniverseDetail::class.java)
            intent.putExtra(INTENT_PARCELABLE, galaxy)
            startActivity(intent)
        }
        return view
    }
}