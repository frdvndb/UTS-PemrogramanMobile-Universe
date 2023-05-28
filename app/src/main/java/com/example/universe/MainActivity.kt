package com.example.universe

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.universe.fragment.PlanetFragment
import com.example.universe.fragment.GalaxyFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

// Kelas aktivitas utama
class MainActivity : AppCompatActivity() {

    // Deklarasi companion object
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    // Toggle untuk Drawer Layout
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fungsi mengganti fragmen saat ini
        makeCurrentFragment(PlanetFragment())

        // Pengaturan variabel dengan lokasi layout
        val navigasiBawah = findViewById<BottomNavigationView>(R.id.navigasi_bawah)
        val drawerLayout : DrawerLayout = findViewById(R.id.drawer_layout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        // Pengaturan Toggle Drawer Layout
        toggle = ActionBarDrawerToggle(this,drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Navigasi samping
        navView.setNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.navigasi_planetL -> {
                    makeCurrentFragment(PlanetFragment())
                    navigasiBawah.selectedItemId = R.id.navigasi_planet
                    drawerLayout.closeDrawers()
                }
                R.id.navigasi_galaxyL -> {
                    makeCurrentFragment(GalaxyFragment())
                    navigasiBawah.selectedItemId = R.id.navigasi_galaxy
                    drawerLayout.closeDrawers()
                }
                R.id.navigasi_github -> {
                    val githubUrl = "https://github.com/frdvndb"
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl))
                    startActivity(intent)
                    drawerLayout.closeDrawers()
                }
            }
            true
        }

        // Navigasi bawah
        navigasiBawah.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigasi_planet -> {
                    makeCurrentFragment(PlanetFragment())
                    navView.setCheckedItem(R.id.navigasi_planetL)
                }
                R.id.navigasi_galaxy -> {
                    makeCurrentFragment(GalaxyFragment())
                    navView.setCheckedItem(R.id.navigasi_galaxyL)
                }
            }
            true
        }
    }

    // Fungsi pengaturan fragmen sekarang
    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.navigasi, fragment)
            .commit()
    }

    // Fungsi ketika item dipilih
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}