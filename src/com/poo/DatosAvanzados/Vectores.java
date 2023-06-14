package com.poo.DatosAvanzados;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        //Vector <*TipoValor> <Identificador> = new Vector();
        // es necesario importar java.util.Vector;
        Vector<Integer> vector = new Vector(1,15);
        // un vector si permite añadir/borrar elementos, es un array dinamicos
        vector.add(1);
        vector.add(2);

        System.out.println(vector);

        // Tamaño del vector  (num_elementos)
        int tamano = vector.size();
        System.out.println("Tamaño: "+tamano);

        // Capcidad del vector (Arraypor debajo del vector)
        int capacidad = vector.capacity();
        System.out.println("Capacidad: "+capacidad);

        // Si dos vectores son iguales
        Vector<Integer> vector2 = new Vector(1,15);
        vector2.add(1);
        vector2.add(2);

        boolean igual = vector.equals(vector2);
        System.out.println(igual);


        // recorer un vector

        // for each
        for (int elemento: vector2){
            System.out.println(elemento);
        }

        //Iterando por indice
        for (int i=0; i<vector.size(); i++) {
            System.out.println(vector.get(i)); // se usa get(i) en lugar de [i]
        }

        // reducir el tamaño del vector
        System.out.println("Tamaño: "+ vector.size() + "   capacidad: "+vector.capacity());
        vector.trimToSize();
        System.out.println("Tamaño: "+ vector.size() + "   capacidad: "+vector.capacity());



    }
}
