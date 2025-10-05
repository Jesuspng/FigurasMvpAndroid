package com.example.pruebasssss.Modelo

import com.example.pruebasssss.Contratos.ContratoRectangulo

class RectanguloModelo: ContratoRectangulo.Modelo {

    override fun area(l1: Float,l2: Float): Float {

        return l1*l2;
    }

    override fun perimetro(l1: Float,l2: Float): Float {
        return 2*(l1+l2)
    }


}