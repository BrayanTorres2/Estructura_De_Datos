package com.calcular.calculadora

import Mundo.suma
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonResta = findViewById<Button>(R.id.bt_resta)
        val botonMultiplicar = findViewById<Button>(R.id.bt_multiplicar)
        val botonDividir = findViewById<Button>(R.id.bt_dividir)
        val botonSumar = findViewById<Button>(R.id.bt_suma)
        //boton sumar
        botonSumar.setOnClickListener {
            val text_numero_uno = findViewById<EditText>(R.id.text_edit_uno)
            val text_numero_dos = findViewById<EditText>(R.id.text_edit_dos)
            val label_text = findViewById<TextView>(R.id.text_resultado)
            try {
                val numero_uno = text_numero_uno.text.toString().toInt()
                val numero_dos = text_numero_dos.text.toString().toInt()
                var resultado = suma(numero_uno,numero_dos).toString()
                label_text.text = resultado
            } catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
            }
        }
        //boton resta
        botonResta.setOnClickListener {
            val text_numero_uno = findViewById<EditText>(R.id.text_edit_uno)
            val text_numero_dos = findViewById<EditText>(R.id.text_edit_dos)
            val label_text = findViewById<TextView>(R.id.text_resultado)
            try {
                val numero_uno = text_numero_uno.text.toString().toInt()
                val numero_dos = text_numero_dos.text.toString().toInt()
                var resultado = Mundo.resta(numero_uno, numero_dos).toString()
                label_text.text=resultado
            } catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
            }
        }
        //boton multiplicar
        botonMultiplicar.setOnClickListener {
            val text_numero_uno = findViewById<EditText>(R.id.text_edit_uno)
            val text_numero_dos = findViewById<EditText>(R.id.text_edit_dos)
            val label_text = findViewById<TextView>(R.id.text_resultado)
            try {
                val numero_uno = text_numero_uno.text.toString().toInt()
                val numero_dos = text_numero_dos.text.toString().toInt()
                var resultado = Mundo.multiplicar(numero_uno, numero_dos).toString()
                label_text.text=resultado
            } catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
            }
        }
        //boton Dividir
        botonDividir.setOnClickListener {
            val text_numero_uno = findViewById<EditText>(R.id.text_edit_uno)
            val text_numero_dos = findViewById<EditText>(R.id.text_edit_dos)
            val label_text = findViewById<TextView>(R.id.text_resultado)
            try {
                val numero_uno = text_numero_uno.text.toString().toInt()
                val numero_dos = text_numero_dos.text.toString().toInt()
                var resultado = Mundo.dividir(numero_uno, numero_dos).toString()
                label_text.text=resultado
            } catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}







