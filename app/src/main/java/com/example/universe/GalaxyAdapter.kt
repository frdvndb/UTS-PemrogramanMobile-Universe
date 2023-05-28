package com.example.universe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Kelas yang bertanggungjawab untuk binding data Galaxy ke RecyclerView
class GalaxyAdapter(private val data: List<UniverseModel>, val listener: (UniverseModel) -> Unit) :
    RecyclerView.Adapter<GalaxyAdapter.GalaxyViewHolder>() {

    class GalaxyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val gambarGalaxy = view.findViewById<ImageView>(R.id.gambar_universe)
        val judulGalaxy = view.findViewById<TextView>(R.id.judul_universe)
        val deskripsiGalaxy = view.findViewById<TextView>(R.id.deskripsi_universe)

        fun bindView(data: UniverseModel, listener: (UniverseModel) -> Unit) {
            gambarGalaxy.setImageResource(data.gambarUniverse)
            judulGalaxy.text = data.judulUniverse
            deskripsiGalaxy.text = data.deskripsiUniverse

            itemView.setOnClickListener {
                (listener(data))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalaxyAdapter.GalaxyViewHolder {
        return GalaxyAdapter.GalaxyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: GalaxyAdapter.GalaxyViewHolder, position: Int) {
        holder.bindView(data[position], listener)
    }

    override fun getItemCount(): Int = data.size
}