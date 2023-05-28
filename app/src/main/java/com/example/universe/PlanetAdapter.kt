package com.example.universe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Kelas yang bertanggungjawab untuk binding data Planet ke RecyclerView
class PlanetAdapter(private val data: List<UniverseModel>, val listener: (UniverseModel) -> Unit) :
    RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    class PlanetViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val gambarPlanet = view.findViewById<ImageView>(R.id.gambar_universe)
        val judulPlanet = view.findViewById<TextView>(R.id.judul_universe)
        val deskripsiPlanet = view.findViewById<TextView>(R.id.deskripsi_universe)

        fun bindView(data: UniverseModel, listener: (UniverseModel) -> Unit) {
            gambarPlanet.setImageResource(data.gambarUniverse)
            judulPlanet.text = data.judulUniverse
            deskripsiPlanet.text = data.deskripsiUniverse

            itemView.setOnClickListener {
                (listener(data))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetAdapter.PlanetViewHolder {
        return PlanetViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
    }

    override fun onBindViewHolder(holder: PlanetAdapter.PlanetViewHolder, position: Int) {
        holder.bindView(data[position], listener)
    }

    override fun getItemCount(): Int = data.size
}