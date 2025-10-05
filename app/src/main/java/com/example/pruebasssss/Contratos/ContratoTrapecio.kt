package com.example.pruebasssss.Contratos

interface ContratoTrapecio {
    interface Modelo{
        fun area(b1: Float,b2: Float,h: Float): Float
        fun perimetro(b1: Float,b2: Float,h: Float): Float
    }
    interface Vista{
        fun showArea(area: Float)
        fun showPerimetro(perimetro: Float)

    }
    interface Presentador{
        fun area(b1: Float,b2: Float,h: Float)
        fun perimetro(b1: Float,b2: Float,h: Float)

    }
}