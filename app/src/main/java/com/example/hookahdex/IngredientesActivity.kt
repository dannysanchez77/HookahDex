package com.example.hookahdex
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hookahdex.databinding.ActivityIngredientesBinding

class IngredientesActivity:AppCompatActivity() {
    private lateinit var binding: ActivityIngredientesBinding
    private var ingrediente:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIngredientesBinding.inflate(layoutInflater)
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
        binding.fresa.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.platano.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.naranja.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.cafe.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.limon.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.uva.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.kiwi.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.sandia.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.galleta.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.pina.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.melon.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.lima.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.chocolate.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
        binding.melocoton.setOnClickListener {
            val intent = Intent(this,MuestraIngredientesActivity::class.java)
            startActivity(intent)
        }
    }
}
