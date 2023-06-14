package com.poo.DatosAvanzados;

public class Strings {
    public static void main(String[] args) {
        String cadena= "String";
        var cadena2 = "String"; // el compilador determina el tipo de variable

        System.out.println("____Lontitud de la cadena___");
        System.out.println("La longitud de la cadena es: "+cadena.length());

        System.out.println("____Cadena en minusculas___");
        System.out.println(cadena.toLowerCase());

        System.out.println("____Cadena en mayusculas___");
        System.out.println(cadena.toUpperCase());

        System.out.println("____Comienza con ... ___");
        System.out.println(cadena.startsWith("St"));

        System.out.println("____Termina con ... ___");
        System.out.println(cadena.endsWith("r"));

        System.out.println("____Iterar cobre un string___");

        for (int i=0; i< cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }

    }
}
