package com.login.firestore

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize Firebase Auth
        auth = Firebase.auth
        //boton que al darle click se dirige a otra pantalla
        val boton_iniciar_sesion=findViewById<Button>(R.id.bt_iniciar_sesion)
        boton_iniciar_sesion.setOnClickListener{
            val intent= Intent(this,IniciarSesionActivity::class.java)
            startActivity(intent)
        }
        //boton que al darle click se dirige a otra pantalla
        val boton_registrase=findViewById<Button>(R.id.bt_registrarse)
        boton_registrase.setOnClickListener{
            val intent= Intent(this,RegistrarActivity::class.java)
            startActivity(intent)
        }
        //imagen que al darle click se dirige a una url
        val imagen=findViewById<ImageView>(R.id.imageview_am)
        imagen.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://firebase.google.com/products/realtime-database?utm_source=bing&utm_medium=cpc&utm_campaign=latam-CO-all-es-dr-SKWS-all-all-trial-e-dr-1011454-LUAC0016538&utm_content=text-ad-none-any-DEV_c-CRE_-ADGP_Hybrid%20%7C%20SKWS%20-%20MIX%20%7C%20Txt%20~%20Compute_Firebase-KWID_43700067399687787-kwd-78065682507292%3Aloc-43&utm_term=KW_Firebase-ST_Firebase&gclid=ec0933ab74b11558645251f70fd8e685&gclsrc=3p.ds"))
            startActivity(intent)
        }
        //boton que al darle click se dirige a otra pantalla
        val boton_producto=findViewById<Button>(R.id.bt_productos_ac)
        boton_producto.setOnClickListener{
            val intent= Intent(this,productos::class.java)
            startActivity(intent)
        }
        val boton_cerrar_sesion=findViewById<Button>(R.id.bt_cerrar_sesion_am)
        boton_cerrar_sesion.setOnClickListener{
            auth.signOut()
            if(auth.currentUser==null){
                boton_iniciar_sesion.visibility=View.VISIBLE
                boton_registrase.visibility=View.VISIBLE
                boton_producto.visibility=View.INVISIBLE
                boton_cerrar_sesion.visibility=View.INVISIBLE
            }
        }
        auth= FirebaseAuth.getInstance()
        if(auth.currentUser!=null){
            boton_iniciar_sesion.visibility=View.INVISIBLE
            boton_registrase.visibility=View.INVISIBLE
            boton_producto.visibility=View.VISIBLE
            boton_cerrar_sesion.visibility=View.VISIBLE
        }


    }
}