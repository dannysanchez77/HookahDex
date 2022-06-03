package com.example.hookahdex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hookahdex.databinding.ActivityUsuarioBinding
import com.google.firebase.auth.FirebaseAuth

class UsuarioActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUsuarioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsuarioBinding.inflate(layoutInflater)
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