package com.poo.DatosAvanzados;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        System.out.println("Contenido: "+ lista);

        // Array list no puede hacer cambios sobre un mismo elemento al mismo tiempo un vector si

        // eliminar un elemento
        lista.remove("ElementoB");
        System.out.println("Contenido: "+ lista);

        // Iterar sobre un elemento
        for ( String elemento: lista){
            System.out.println(elemento);
        }

        //Convertir un Arraylist a un array

        String array[] = new String[lista.size()];
        for (int i =0; i< lista.size(); i++){
            array[i]= lista.get(i);
            System.out.println(array[i]);
        }

        // Crear un LinkedList
        LinkedList<String> listaEnlazada = new LinkedList<String>();
        /**
         * Un Arraylist es más rapido para buscar datos
         * Un LinkedList es más rapido para modificar datos, tambien se usan para implementar
         * colas; FIFO (first in first out) o FI
         */



    }
}
