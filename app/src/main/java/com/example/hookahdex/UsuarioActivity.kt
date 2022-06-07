package com.example.hookahdex
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import android.content.Intent
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
        val database = Firebase.database("https://hookahdex-default-rtdb.europe-west1.firebasedatabase.app/")
        val bundle:Bundle?=intent.extras
        val email:String?=bundle?.getString("email")

        setup(email?:"")
        binding.inicio.setOnClickListener{
            val intent = Intent(this,HomeActivity::class.java)
                startActivity(intent)

        }
    }

    fun setup (email :String){
    binding.usuario.text = email
        binding.cerrarBoton.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }
    }
}