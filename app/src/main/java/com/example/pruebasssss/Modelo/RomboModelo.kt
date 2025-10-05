package com.example.pruebasssss.Modelo

import com.example.pruebasssss.Contratos.ContratoRombos
import kotlin.math.pow
import kotlin.math.sqrt

class RomboModelo: ContratoRombos.Modelo {

    override fun area(d1: Float,d2: Float): Float {

        return (d1*d2)/2;
    }

    override fun perimetro(d1: Float,d2: Float): Float {
        val lado = sqrt((d1 / 2).pow(2) + (d2 / 2).pow(2))
        return 4 * lado
    }

}