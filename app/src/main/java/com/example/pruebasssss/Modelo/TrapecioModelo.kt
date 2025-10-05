package com.example.pruebasssss.Modelo


import com.example.pruebasssss.Contratos.ContratoTrapecio
import kotlin.math.sqrt
import kotlin.math.pow


class TrapecioModelo: ContratoTrapecio.Modelo {

    override fun area(b1: Float,b2: Float,h: Float): Float {

        return ((b1+b2)*h)/2
    }

    override fun perimetro(b1: Float,b2: Float,h: Float): Float {
        val L = sqrt(((b1 - b2) / 2).pow(2) + h.pow(2))
        return  b1+ b2 + 2 * L
    }

}