package com.example.pruebasssss.Presentador

import com.example.pruebasssss.Contratos.ContratoTrapecio
import com.example.pruebasssss.Modelo.TrapecioModelo


class TrapecioPresenter(private val vista: ContratoTrapecio.Vista): ContratoTrapecio.Presentador {
    private val modelo: ContratoTrapecio.Modelo= TrapecioModelo()

    override fun area(b1: Float, b2: Float, h: Float) {
       
            val a= modelo.area(b1,b2,h)
            vista.showArea(a)

    }

    override fun perimetro(b1: Float, b2: Float, h: Float) {
        
            val p=modelo.perimetro(b1,b2,h)
            vista.showPerimetro(p)
    }
}