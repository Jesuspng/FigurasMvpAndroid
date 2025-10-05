package com.example.pruebasssss.Presentador

import com.example.pruebasssss.Contratos.ContratoRombos
import com.example.pruebasssss.Modelo.RomboModelo

class RomboPresenter (private val vista: ContratoRombos.Vista): ContratoRombos.Presentador {

    private val modelo: ContratoRombos.Modelo= RomboModelo()

    override fun area(l1: Float, l2: Float) {

        val a= modelo.area(l1,l2)
        vista.showArea(a)
    }

    override fun perimetro(l1: Float, l2: Float) {

        val p=modelo.perimetro(l1,l2)
        vista.showPerimetro(p)
    }

}