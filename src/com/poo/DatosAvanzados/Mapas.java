package com.poo.DatosAvanzados;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        // un mapa es un diccionario del tipo clake valor
        // se declara un diccionario
        HashMap<String, Integer> mapa= new HashMap<>();

        mapa.put("clave1", 10); // se agrega un elemento al diccionario
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.replace("clave4", 40); // sino existe la clave no se agrega en el diccionario

        System.out.println(mapa);

        // obtener el valor por la clave se usa get
        System.out.println(mapa.get("clave1"));

        // interar sobre el diccionario

        for (Map.Entry elemento: mapa.entrySet()) {
            System.out.println(elemento); // regresa key=value
            System.out.println(elemento.getKey()); // regresa solo el key
            System.out.println(elemento.getValue()); // regresa solo el valor

        }








    }

}
