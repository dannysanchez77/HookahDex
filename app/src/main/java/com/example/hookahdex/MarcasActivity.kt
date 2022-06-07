package com.example.hookahdex
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hookahdex.databinding.ActivityMarcasBinding

class MarcasActivity:AppCompatActivity() {
    private lateinit var binding: ActivityMarcasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMarcasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val database = Firebase.database("https://hookahdex-default-rtdb.europe-west1.firebasedatabase.app/")
        ////////////////////////
        //Configuracion botones pie
        binding.pieUsuario.setOnClickListener {
            val intent = Intent(this, UsuarioActivity::class.java)
            startActivity(intent)
        }
        binding.pieHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        binding.pieMarcas.setOnClickListener {
            val intent = Intent(this, MarcasActivity::class.java)
            startActivity(intent)
        }
        binding.pieIngredientes.setOnClickListener {
            val intent = Intent(this, IngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.pieGusto.setOnClickListener {
            val intent = Intent(this, GustoActivity::class.java)
            startActivity(intent)
        }
        //////////////////////////////////////////
        binding.hookain.setOnClickListener {

        }
        binding.holster.setOnClickListener {

        }
        binding.overdooz.setOnClickListener {

        }
        binding.dozaj.setOnClickListener {

        }
        binding.mrshisha.setOnClickListener {

        }
        binding.chronos.setOnClickListener {

        }
        }
    }