package com.example.hookahdex
import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hookahdex.databinding.ActivityMarcasBinding
import com.google.firebase.database.DatabaseReference

class MarcasActivity:AppCompatActivity() {
    private lateinit var binding: ActivityMarcasBinding
    private var marca: String =""
    //private var logo: =""
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMarcasBinding.inflate(layoutInflater)
        setContentView(binding.root)
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
            marca = "hookain"

            val bundle=Bundle()
            bundle.putString("marca",marca)
            //bundle.putString("foto",logo)
            val saborintent = Intent(this, MuestraSaborActivity::class.java)
            saborintent.putExtras(bundle)

            startActivity(saborintent)
        }
        binding.holster.setOnClickListener {
            marca = "holster"

            val bundle=Bundle()
            bundle.putString("marca",marca)
            val saborintent = Intent(this, MuestraSaborActivity::class.java)
            saborintent.putExtras(bundle)
            startActivity(saborintent)
        }
        binding.overdooz.setOnClickListener {
            marca = "overdooz"

            val bundle=Bundle()
            bundle.putString("marca",marca)
            val saborintent = Intent(this, MuestraSaborActivity::class.java)
            saborintent.putExtras(bundle)
            startActivity(saborintent)
        }
        binding.dozaj.setOnClickListener {
            marca = "dozaj"

            val bundle=Bundle()
            bundle.putString("marca",marca)
            val saborintent = Intent(this, MuestraSaborActivity::class.java)
            saborintent.putExtras(bundle)
            startActivity(saborintent)

        }
        binding.mrshisha.setOnClickListener {
            marca = "mrshisha"

            val bundle=Bundle()
            bundle.putString("marca",marca)
            val saborintent = Intent(this, MuestraSaborActivity::class.java)
            saborintent.putExtras(bundle)
            startActivity(saborintent)

        }
        binding.chronos.setOnClickListener {
            marca = "chronos"

            val bundle=Bundle()
            bundle.putString("marca",marca)
            val saborintent = Intent(this, MuestraSaborActivity::class.java)
            saborintent.putExtras(bundle)
            startActivity(saborintent)

        }

        }



    }


