package com.company.repeticion;

public class whileLoop {
    public static void main(String[] args) {
        boolean check = true;
        int count1 = 0;
        while ( count1< 10){
            count1 ++;
            if(count1 ==6){
                //continue; // salta a la siguiente iteración
                break; // rompe el flujo de la ejecuación del bucle S
            }
            System.out.println(count1 + " Hola mundo");

        }
        System.out.println("Fin");
    }
}
