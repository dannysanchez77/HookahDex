package com.example.hookahdex

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hookahdex.databinding.ActivityIngredientesBinding
import com.example.hookahdex.databinding.ActivityMuestrasaborBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MuestraSaborActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMuestrasaborBinding
    
    val database = Firebase.database("https://hookahdex-default-rtdb.europe-west1.firebasedatabase.app/")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMuestrasaborBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val bundle = intent.extras
        val marca = bundle?.getString("marca")
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
        binding.nombreMarca.text = marca
        binding.datos.setOnClickListener {
            if (marca != null) {
              //  readData(marca)

            }
        }
        //////////////////////////////////////////


    }
/*
    private fun readData(marca: String) {
        println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"+marca)
        database = FirebaseDatabase.getInstance().getReference("tabacos")
        database.child(marca).get().addOnSuccessListener {
            binding.descripcionSabor.text = it.value.toString()
            println(it)
        }
        database.child(marca).child("sabor").child("punani").child("descripcion").get()
            .addOnSuccessListener {
                binding.descripcionSabor.text = it.value.toString()
                println(it)
            }
    }*/
}