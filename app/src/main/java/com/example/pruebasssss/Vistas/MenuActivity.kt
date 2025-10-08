package com.example.pruebasssss.Vistas

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pruebasssss.MainActivity
import com.example.pruebasssss.R

class MenuApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val spinner: Spinner= findViewById<Spinner>(R.id.spnSelect)
        val btnIr=findViewById<Button>(R.id.btnIr)

        val opciones=arrayOf("Triangulo", "Rectangulo","Rombo","Trapecio")
        val adaptador= ArrayAdapter(this,
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            opciones)
        adaptador.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        spinner.adapter=adaptador

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnIr.setOnClickListener {
            when(spinner.selectedItem.toString()){
                "Triangulo"-> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                "Rectangulo"->{
                    val intent = Intent(this, RectanguloActivity::class.java)
                    startActivity(intent)
                }
                "Rombo"->{
                    val intent = Intent(this, RomboActivity::class.java)
                    startActivity(intent)
                }
                "Trapecio"->{
                    val intent = Intent(this, TrapecioActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}