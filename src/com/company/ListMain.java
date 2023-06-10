package com.company;
// se importa la interface List de Java.util
import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args){
        List<String> nombres = new ArrayList<>();
        // Agregar elementos
        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for ( String nombre:nombres){
            System.out.println(nombre);
        }
        // se puede generar una list de clases

        List <Coche> coches = new ArrayList<>();
        coches.add(new Coche());
        coches.add(new Coche());
        System.out.println(coches);


    }
}
