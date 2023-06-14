package com.poo.DatosAvanzados;


public class BigDecimal {
    public static void main(String[] args) {
        System.out.println(0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f);
        /* da 1.0000001
        Cuando se utilizan datos financieros no se deben usar double ni float por este detalle

        Cuando se trabaje con datos de muchos decimales se usa BigDecimal
         */

        java.math.BigDecimal valorA= new java.math.BigDecimal(0.1f);
        java.math.BigDecimal valorB = new java.math.BigDecimal(4f);
        // suma de 2 big decimal

        java.math.BigDecimal resultado = valorA.add(valorB);

        System.out.println(resultado);








    }
}
