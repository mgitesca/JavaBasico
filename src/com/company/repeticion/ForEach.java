package com.company.repeticion;

public class ForEach {
    public static void main(String[] args) {

        String[] nombres = {"juan", "pedro" ,"manolo"} ;
        for (String nombre : nombres){
            System.out.println(nombre);
        }

        int[] enteros = {1,2,3,4,7};
        for (int numero: enteros){
            System.out.println(numero);
        }
    }
}
