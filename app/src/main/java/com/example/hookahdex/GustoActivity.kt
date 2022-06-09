package com.example.hookahdex

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hookahdex.databinding.ActivityGustoBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class GustoActivity:AppCompatActivity() {
    private lateinit var binding: ActivityGustoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGustoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ////////////////////////
        //Configuracion botones pie
        binding.pieUsuario.setOnClickListener{
            val intent = Intent(this,UsuarioActivity::class.java)
            startActivity(intent)
        }
        binding.pieHome.setOnClickListener{
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        binding.pieMarcas.setOnClickListener{
            val intent = Intent(this,MarcasActivity::class.java)
            startActivity(intent)
        }
        binding.pieIngredientes.setOnClickListener{
            val intent = Intent(this,IngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.pieGusto.setOnClickListener{
            val intent = Intent(this,GustoActivity::class.java)
            startActivity(intent)
        }
        //////////////////////////////////////////
        binding.gustoAfrutado.setOnClickListener {

        }
        binding.gustoHielo.setOnClickListener {

        }
        binding.gustoMentol.setOnClickListener {

        }
        binding.gustoDulce.setOnClickListener {

        }
        binding.gustoPicante.setOnClickListener {

        }
        binding.gustoCremoso.setOnClickListener {

        }
        binding.gustoFloral.setOnClickListener {

        }
        binding.gustoCitrico.setOnClickListener {

        }

    }

}