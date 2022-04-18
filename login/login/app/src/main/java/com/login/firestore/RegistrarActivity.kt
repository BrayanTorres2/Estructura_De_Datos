package com.login.firestore

import Mundo.contraseñas_iguales
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

class RegistrarActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)
        //-----------------------FireBase
        // ...
// Initialize Firebase Auth
        auth = Firebase.auth

        //boton que al darle click se dirige a otra pantalla
        val boton_regresar=findViewById<Button>(R.id.bt_ar_regresar)
        boton_regresar.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val txt_correo=findViewById<EditText>(R.id.text_ar_correo)
        val txt_contraseña=findViewById<EditText>(R.id.text_ar_contrasena)
        val txt_confirmar_contraseña=findViewById<EditText>(R.id.text_ar_confirmar_contrasena)
        val boton_registrase=findViewById<Button>(R.id.bt_ar_registrar)
        boton_registrase.setOnClickListener{
            try {
                val correo_r = txt_correo.text.toString().lowercase()
                val contraseña_r = txt_contraseña.text.toString()
                val confirmar= txt_confirmar_contraseña.text.toString()
                if(correo_r.isEmpty()|| contraseña_r.isEmpty()|| confirmar.isEmpty()){
                    throw Exception("Los campos no pueden estar Vacios!!")
                }
                else{
                    if(contraseñas_iguales(contraseña_r,confirmar)){
                        auth.createUserWithEmailAndPassword(correo_r,contraseña_r)
                            .addOnCompleteListener(this) { task ->
                                if (task.isSuccessful) {
                                    Toast.makeText(baseContext, "Usuario Creado", Toast.LENGTH_SHORT).show()
                                    // Sign in success, update UI with the signed-in user's information
                                    Log.d(TAG, "signInWithCustomToken:success")
                                    val user = auth.currentUser
                                    //el usuario ya esta logeado?
                                    //updateUI(user)
                                    val intent= Intent(this,MainActivity::class.java)
                                    startActivity(intent)

                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.w(TAG, "signInWithCustomToken:failure", task.exception)
                                    Toast.makeText(baseContext, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show()
                                    //el usuario ya esta logeado?
                                    //updateUI(null)
                                }
                            }
                    }
                    else{
                        throw Exception("Las Contraseñas no coinciden!!")
                    }
                }

            }
            catch(e: Exception){
                Toast.makeText(this,e.message, Toast.LENGTH_SHORT).show()
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