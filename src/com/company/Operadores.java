package com.company;

public class Operadores {
    public static void main(String[] args){
        // OPERADORES ARITMETICOS
        // + - / * %

        int num1= 5;
        int num2= 2;

        int resultado = num1 + num2;
        int resultado2= num1 - num2;
        int resultado3= num1*num2;
        int resultado4= num1/ num2;

        /*
        OPERADORES LOGICOS COMPARACION
        > mayor que
        >= mayor o igual que
        < menor que
        <= menor o igual a que
        == igual a
        != diferente que
        && and
        || or
        ! negación

         */


        // ASIGNACIÓN
        /*
        =
        +=
        -=
        *=
        /=
        %=
         */

        // concatenar strings
        //+



    }

    public static class Funciones {
        public static void main(String[] args){
            // Se define la funcion
            holaMundo();
            holaMundo();
            holaName("Alan");
            String hola= devolverHola();
            System.out.println(hola);

        }

        private static void holaName(String name) {
            // private solo puede usarse en esta clase, no pueden ser invocadas fuera de ella
            System.out.println("Hola "+ name);
        }

        private static void holaMundo() {
            System.out.println("Hola Mundo");
            System.out.println("Hola Mundo ");

        }

        private static String devolverHola (){
            return "Hola";
        }
    }
}
