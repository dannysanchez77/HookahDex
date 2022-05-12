package com.example.hookahdex

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hookahdex.databinding.ActivityAuthBinding
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class AuthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val analytics = FirebaseAnalytics.getInstance(this)
        val bundle=Bundle()
        bundle.putString("message","Integracion de Firebase completa")
        analytics.logEvent("InitScreen",bundle)

        setup()
    }
    private fun setup(){
        title = "Autenticación"
        binding.registrarBoton.setOnClickListener{
            if (binding.editTextEmail.text.isNotEmpty() && binding.editTextContrasena.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(binding.editTextEmail.text.toString(),
                    binding.editTextContrasena.text.toString()).addOnCompleteListener {
                        if (it.isSuccessful){

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
    /*private fun showHome (email: String, provider: ProviderType){
   //     val homeIntent : Intent(this, HomeActivity::class.java).apply{
     //       putExtra("email", email)
        }
    }
*/
}