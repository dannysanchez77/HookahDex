package com.example.hookahdex

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.hookahdex.databinding.ActivityMuestrasaborBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MuestraSaborActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMuestrasaborBinding
    var num = 0
    var reset = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMuestrasaborBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle = intent.extras
        val marca = bundle?.getString("marca")
        val imagen = bundle?.getInt("imagen")


        ////////////////////////
        //Configuracion botones pie
        binding.pieUsuario.setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
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
        imagen?.let { binding.imagenmarca.setImageResource(it) }
        imagen?.let { binding.imagenmarca1.setImageResource(it) }
        binding.nombreMarca.text = marca
        binding.datos.setOnClickListener {
            if (marca != null) {
                readData(marca, num)

                if (reset){
                    num++
                }else{
                    num = 0
                }
        }
    }
    }
     fun readData(marca: String, num:Int) {
        val database = Firebase.database("https://hookahdex-default-rtdb.europe-west1.firebasedatabase.app").reference
        database.child("tabacos").child(marca).child("sabor").child("$num").child("descripcion")
            .get().addOnSuccessListener {

                println(it)
                if (it.value == null){
                    reset= false
                    binding.datos.callOnClick()
                }else{
                    reset = true
                    binding.descripcionSabor.text = it.value.toString()
                }

            }
        database.child("tabacos").child(marca).child("sabor").child("$num").child("imagen")
            .get().addOnSuccessListener {
                if (it.value == null){
                    reset= false
                    binding.datos.callOnClick()
                }else{
                    reset = true
                    Glide.with(this).load(it.value.toString()).into(binding.imagen)
                }
            }
         database.child("tabacos").child(marca).child("sabor").child("$num").child("nombre")
             .get().addOnSuccessListener {

                 println(it)
                 if (it.value == null){
                     reset= false
                     binding.datos.callOnClick()
                 }else{
                     reset = true
                     binding.nombreSabor.text = it.value.toString()
                 }
             }
         database.child("tabacos").child(marca).child("sabor").child("$num").child("tipo")
             .get().addOnSuccessListener {

                 println(it)
                 if (it.value == null){
                     reset= false
                     binding.datos.callOnClick()
                 }else{
                     reset = true
                     binding.tipoSabor.text = it.value.toString()
                 }
             }

         database.child("tabacos").child(marca).child("sabor").child("$num").child("ingredientes")
             .get().addOnSuccessListener {

                 println(it)
                 if (it.value == null){
                     reset= false
                     binding.datos.callOnClick()
                 }else{
                     reset = true
                     binding.ingredientesSabor.text = it.value.toString()
                 }
             }
         binding.lineartotal.visibility = View.VISIBLE
    }

    /* database.child(marca).child("sabor").child("punani").child("descripcion").get()
         .addOnSuccessListener {
             binding.descripcionSabor.text = it.value.toString()
             println(it)
         }*/

}