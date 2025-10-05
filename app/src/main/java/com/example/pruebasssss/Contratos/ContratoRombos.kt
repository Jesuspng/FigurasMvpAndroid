package com.example.pruebasssss.Contratos

interface ContratoRombos {
    
        interface Modelo{
            fun area(d1: Float,d2: Float): Float
            fun perimetro(d1: Float,d2: Float): Float

        }
        interface Vista{
            fun showArea(area: Float)
            fun showPerimetro(perimetro: Float)

        }
        interface Presentador{
            fun area(d1: Float,d2: Float)
            fun perimetro(d1: Float,d2: Float)

        }
      
}