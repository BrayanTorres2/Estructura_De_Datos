package com.login.firestore

import Mundo.agregarlibros
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class productos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)
        val lista_de_productos= findViewById<ListView>(R.id.listview_ap_productos)
        val adaptCuentas = ArrayAdapter(this,android.R.layout.simple_list_item_1,
            agregarlibros())
        lista_de_productos.adapter= adaptCuentas
    }
}