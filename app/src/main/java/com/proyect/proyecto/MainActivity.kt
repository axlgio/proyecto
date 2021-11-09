package com.proyect.proyecto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.proyect.proyecto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.nav_host_fragment_activity_main, addFragment())
            .commit()
        binding.navView.setOnItemSelectedListener { view ->
            when(view.itemId) {
                R.id.navigation_home -> {
                    openFragment(addFragment())
                }
                R.id.navigation_dashboard -> {
                    openFragment(listFragment())
                }
                R.id.navigation_notifications -> {
                    openFragment(webFragment())
                }
            }
            true
        }
    }
    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.nav_host_fragment_activity_main, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
