package com.example.pruebasssss.Contratos

interface ContratoRectangulo {

    interface Modelo{
        fun area(l1: Float,l2: Float): Float
        fun perimetro(l1: Float,l2: Float): Float

    }
    interface Vista{
        fun showArea(area: Float)
        fun showPerimetro(perimetro: Float)

    }
    interface Presentador{
        fun area(l1: Float,l2: Float)
        fun perimetro(l1: Float,l2: Float)

    }
}