package com.login.firestore

import Mundo.Libros
import Mundo.Tiendas_objeto
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class productos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)
        val lista_de_productos= findViewById<ListView>(R.id.listview_ap_productos)
        val x=Tiendas_objeto.mostrar_libros()
        val adaptCuentas = ArrayAdapter(this,android.R.layout.simple_list_item_1,
            x)
        lista_de_productos.adapter= adaptCuentas
    }
}