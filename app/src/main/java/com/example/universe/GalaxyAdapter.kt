package com.example.universe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Kelas yang bertanggungjawab untuk binding data Galaxy ke RecyclerView
class GalaxyAdapter(private val data: List<UniverseModel>, private val listener: (UniverseModel) -> Unit) :
    RecyclerView.Adapter<GalaxyAdapter.GalaxyViewHolder>() {

    class GalaxyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val gambarGalaxy: ImageView = view.findViewById(R.id.gambar_universe)
        private val judulGalaxy: TextView = view.findViewById(R.id.judul_universe)
        private val deskripsiGalaxy: TextView = view.findViewById(R.id.deskripsi_universe)

        fun bindView(data: UniverseModel, listener: (UniverseModel) -> Unit) {
            gambarGalaxy.setImageResource(data.gambarUniverse)
            judulGalaxy.text = data.judulUniverse
            deskripsiGalaxy.text = data.deskripsiUniverse

            itemView.setOnClickListener {
                listener(data)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalaxyViewHolder {
        return GalaxyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: GalaxyViewHolder, position: Int) {
        holder.bindView(data[position], listener)
    }

    override fun getItemCount(): Int = data.size
}