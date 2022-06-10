package com.example.hookahdex
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hookahdex.databinding.ActivityHomeBinding

class HomeActivity:AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ////////////////////////
        //Configuracion botones pie
        binding.pieUsuario.setOnClickListener{
            val intent = Intent(this,VideoActivity::class.java)
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
        //Configuracion fotos
        binding.marcas.setOnClickListener{
            val intent = Intent(this,MarcasActivity::class.java)
            startActivity(intent)
        }
        binding.ingredientes.setOnClickListener{
            val intent = Intent(this,IngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.gusto.setOnClickListener{
            val intent = Intent(this,GustoActivity::class.java)
            startActivity(intent)
        }
    }
}