package com.example.pruebasssss.Presentador

import com.example.pruebasssss.Contratos.ContratoRectangulo
import com.example.pruebasssss.Modelo.RectanguloModelo


class RectanguloPresenter(private val vista: ContratoRectangulo.Vista): ContratoRectangulo.Presentador {

    private val modelo: ContratoRectangulo.Modelo= RectanguloModelo()


    override fun area(l1: Float, l2: Float) {

            val a= modelo.area(l1,l2)
            vista.showArea(a)
    }

    override fun perimetro(l1: Float, l2: Float) {

            val p=modelo.perimetro(l1,l2)
            vista.showPerimetro(p)
    }


}