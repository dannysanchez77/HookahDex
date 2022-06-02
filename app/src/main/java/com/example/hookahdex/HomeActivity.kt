package com.example.hookahdex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hookahdex.databinding.ActivityAuthBinding
import com.example.hookahdex.databinding.ActivityHomeBinding
import com.google.firebase.auth.FirebaseAuth

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle:Bundle?=intent.extras
        val email:String?=bundle?.getString("email")

        setup(email?:"")
    }

    fun setup (email :String){
    binding.usuario.text = email
        binding.cerrarBoton.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }

    }
}