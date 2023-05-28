package com.example.universe

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// Kelas yang memberikan informasi lebih detail mengenai planet atau galaksi
class UniverseDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_universe_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val intentUniverse = intent.getParcelableExtra<UniverseModel>(MainActivity.INTENT_PARCELABLE)

        val gambarUniverse = findViewById<ImageView>(R.id.gambar_universe)
        val judulUniverse = findViewById<TextView>(R.id.judul_universe)
        val deskripsiUniverse = findViewById<TextView>(R.id.deskripsi_universe)
        val tombolLanjut = findViewById<Button>(R.id.tombol_lanjut)
        val tipeUniverse = findViewById<TextView>(R.id.tipe_universe)
        val namaAlternatifUniverse = findViewById<TextView>(R.id.nama_alternatif_universe)

        gambarUniverse.setImageResource(intentUniverse?.gambarUniverse!!)
        judulUniverse.text = intentUniverse.judulUniverse
        deskripsiUniverse.text = intentUniverse.deskripsiPanjangUniverse
        tipeUniverse.text = intentUniverse.tipeUniverse
        namaAlternatifUniverse.text = intentUniverse.namaAlternatifUniverse

        tombolLanjut.setOnClickListener {
            val queryUrl: Uri = Uri.parse("$SEARCH_PREFIX${judulUniverse.text}")
            val intent = Intent(Intent.ACTION_VIEW, queryUrl)
            startActivity(intent)
        }

        gambarUniverse.setOnClickListener {
            val queryUrl: Uri = Uri.parse("$SEARCH_PREFIX${judulUniverse.text}")
            val intent = Intent(Intent.ACTION_VIEW, queryUrl)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        const val SEARCH_PREFIX= "https://www.google.com/search?q=Information+About+Planet/Galaxy+of+"
    }
}