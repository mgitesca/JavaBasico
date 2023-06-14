package com.poo.DatosAvanzados;

public class Arrays {

    public static void main(String[] args) {
        // <tipoDatosArray> <identificador>[] = new <tipoDatosArray> [<num_elementos>]
        int arrayuno[] = new int[5]; // array vacio no se puede añadir más
        int array2[] = {1,2,3,4,5};
        String nombres[] = {"juan", "pedro", "rodrigo"};

        for (String nombre: nombres){
            System.out.println(nombre);
        }

        // Arrays de 2 dimensiones
        //<tipoDatosArray> <identificador>[] = new <tipoDatosArray> [<fila>][<columna>]
        int matriz[][] = new int [2][4];
        // crea una matriz de 2 filas por 4 columnas



    }
}
