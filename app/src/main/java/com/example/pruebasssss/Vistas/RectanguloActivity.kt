package com.example.pruebasssss.Vistas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pruebasssss.Contratos.ContratoRectangulo
import com.example.pruebasssss.Presentador.RectanguloPresenter
import com.example.pruebasssss.R

class RectanguloActivity : AppCompatActivity(), ContratoRectangulo.Vista {

        //declaramos el textarea del resultado para poder manipularlo desde las funciones del contrato
        //de la vista
        private lateinit var txvResultado: TextView
        private lateinit var presentador: ContratoRectangulo.Presentador

        fun setPresentador(presentador: ContratoRectangulo.Presentador){
            this.presentador=presentador
        }


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_main)

            //inicializamos elemento a utilizar
            val txtl1: EditText =findViewById<EditText>(R.id.edtL1)
            val txtl2: EditText =findViewById<EditText>(R.id.edtL2)

            val btnArea: Button =findViewById<Button>(R.id.btnArea)
            val btnPerimetro: Button =findViewById<Button>(R.id.btnPerimetro)

            txvResultado=findViewById<TextView>(R.id.txvRes)

            //definimos el presentardor
            presentador= RectanguloPresenter(this)



            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
            //listener del boton para calcular el perimetro
            btnPerimetro.setOnClickListener{
                val l1=txtl1.text.toString().toFloat()
                val l2=txtl2.text.toString().toFloat()
                presentador.perimetro(l1,l2)
            }

            //listener del boton para calcular el area llamando a una funcion
            btnArea.setOnClickListener {
                val l1=txtl1.text.toString().toFloat()
                val l2=txtl2.text.toString().toFloat()

                presentador.area(l1,l2)
            }
        }

        override fun showArea(area: Float) {
            txvResultado.text="El area es ${area}"
        }

        override fun showPerimetro(perimetro: Float) {
            txvResultado.text="El perimetro es ${perimetro}"
        }

    }
