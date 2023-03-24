package com.example.listalugares

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val lugares = arrayOf("Tequila","Magdalena","Arenal","Guadalajara","Guzman","Sayula","Vallarta","Amatitan","Zacoalco","Chetumal","San Jose","Hostotipaquillo","Tala")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.list_view_lugares)

        val adaptador = ArrayAdapter(this,R.layout.list_item,lugares)


        listView.adapter = adaptador

        val valor: TextView = findViewById(R.id.textValor)

        listView.onItemClickListener = object:AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val item = listView.getItemAtPosition(p2) as String
                Toast.makeText(applicationContext, "El valor es $item", Toast.LENGTH_LONG).show()

                valor.text = "Opcion: $item"

            }
        }

    }
}