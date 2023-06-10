package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        // Map es para clake valor, diccionarios en python
        // Map <<tipoKey, tipoValor>> <variable> = new Hashmap<>()

        Map<String, String> personas = new HashMap<>();

        // se agregan con put

        personas.put("12345H", "Nombre Apellido 1");
        personas.put("13456R", "Nombre Apellido 2");
        personas.put("12345Y", "Nombre Apellido 3");

        System.out.println(personas);

        // imprimir las claves
        System.out.println("_____Imprimir las claves_____");
        for (String key:personas.keySet()){
            System.out.println(key);
        }
        System.out.println("_____Imprimir los valores_____");
        for (String key:personas.values()){
            System.out.println(key);
        }
        System.out.println("_____Imprimir key, valor_____");
        for (Map.Entry <String,String> pair: personas.entrySet()){
            System.out.println(pair.getKey() + "  "+pair.getValue());
        }


    }
}
