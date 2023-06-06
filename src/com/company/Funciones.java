package com.company;

public class Funciones {

    public static void main(String[] args) {
        holaMundo();
        holaMundo();
        holaMundo("Alan");
        String hola = devolverHola();
        System.out.println(hola);
        holaMundo("yoel", "perez");
    }

    private static void holaMundo(String name) {
        System.out.println("Hola " + name);
    }

    private static void holaMundo() {
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo ");
    }
    private static void holaMundo(String name, String lastname){
        System.out.println("Hola " + name +" " + lastname);
    }

    private static String devolverHola() {
        return "Hola";
    }
}