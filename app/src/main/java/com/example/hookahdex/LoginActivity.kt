package com.example.hookahdex
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hookahdex.databinding.ActivityLoginBinding
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val database = Firebase.database("https://hookahdex-default-rtdb.europe-west1.firebasedatabase.app/")
        val analytics = FirebaseAnalytics.getInstance(this)
        val bundle=Bundle()
        bundle.putString("message","Integracion de Firebase completa")
        analytics.logEvent("InitScreen",bundle)

        setup()
    }
    private fun setup(){

        binding.registrarBoton.setOnClickListener{
            if (binding.editTextEmail.text.isNotEmpty() && binding.editTextContrasena.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(binding.editTextEmail.text.toString(),
                    binding.editTextContrasena.text.toString()).addOnCompleteListener {
                        if (it.isSuccessful){
                            showHome(binding.editTextEmail.text.toString())
                        }else{
                            showAlert()
                        }
                }

            }
        }
        binding.botonAcceder.setOnClickListener {
            if (binding.editTextEmail.text.isNotEmpty() && binding.editTextContrasena.text.isNotEmpty()){
                FirebaseAuth.getInstance().signInWithEmailAndPassword(binding.editTextEmail.text.toString(),
                    binding.editTextContrasena.text.toString()).addOnCompleteListener {
                    if (it.isSuccessful){
                        showHome(binding.editTextEmail.text.toString())
                    }else{
                        showAlert()
                    }
                }

            }
        }
    }
    private fun showAlert(){
        val builder= AlertDialog.Builder( this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error autenticando al usuario")
        builder.setPositiveButton("Aceptar",  null)
        val dialog: AlertDialog = builder.create()
        dialog. show()
    }
    private fun showHome (email: String){
      val homeIntent = Intent(this, UsuarioActivity::class.java).apply{
           putExtra("email", email)
        }
        startActivity(homeIntent)
    }

}