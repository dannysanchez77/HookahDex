package com.example.hookahdex
import android.content.Intent
import android.media.Image
import android.media.session.MediaController
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.hookahdex.databinding.ActivityMarcasBinding
import com.example.hookahdex.databinding.ActivityVideoBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class VideoActivity:AppCompatActivity() {
    private lateinit var binding: ActivityVideoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)
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
        binding.sorpresa.setOnClickListener{
            binding.sorpresa.visibility = View.GONE
            readData()
            binding.video.visibility = View.VISIBLE
            println(it)
        }

    }
    fun readData() {
        val database = Firebase.database("https://hookahdex-default-rtdb.europe-west1.firebasedatabase.app").reference
        database.child("tabacos").child("video").child("libre")
            .get().addOnSuccessListener {
                binding.video.setVideoPath(it.value.toString())
            }

    }
}






