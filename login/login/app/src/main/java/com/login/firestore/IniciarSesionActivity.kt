package com.login.firestore

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class IniciarSesionActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)
        // ...
// Initialize Firebase Auth
        auth = Firebase.auth
        //boton que al darle click se dirige a otra pantalla
        val boton_regresar = findViewById<Button>(R.id.bt_regresar)
        boton_regresar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val txt_correo = findViewById<EditText>(R.id.txt_correo)
        val txt_contraseña = findViewById<EditText>(R.id.text_contrasena)
        val boton_iniciar_sesion = findViewById<Button>(R.id.bt_ais_iniciar_sesion)
        boton_iniciar_sesion.setOnClickListener {
            try {
                val correo = txt_correo.text.toString().lowercase()
                val contraseña = txt_contraseña.text.toString()
                if (correo.isEmpty() || contraseña.isEmpty()) {
                    throw Exception("Los campos no pueden estar Vacios!!")
                } else {
                    auth.signInWithEmailAndPassword(correo,contraseña)
                        .addOnCompleteListener(this) { task ->
                                if (task.isSuccessful) {
                                    Toast.makeText(baseContext, "Bienvenido", Toast.LENGTH_SHORT).show()
                                    // Sign in success, update UI with the signed-in user's information
                                    Log.d(TAG, "signInWithCustomToken:success")
                                    val user = auth.currentUser
                                    //updateUI(user)
                                    val intent = Intent(this, repositorio_github::class.java)
                                    startActivity(intent)
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.w(TAG, "signInWithCustomToken:failure", task.exception)
                                    Toast.makeText(baseContext, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show()
                                    //updateUI(null)
                                }
                            }
                    }


            }
            catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        //el usuario ya esta logeado?
        //updateUI(currentUser)
    }
}