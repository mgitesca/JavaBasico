package com.company;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {

        // como se declara un arraylist
        // <tipo de variable a almacenar> [] <nombre de la variable>
        int  [] notas = new int[10];
        // los arrays comienzan de cero,
        // agregar valores al array notas[<indice>]= <valor>

        notas[0]=10;
        notas[1]=2;

        System.out.println(notas[0]);
        System.out.println("_________________");

        // Otra forma de declarar arrays
        int [] notas2 = {1,2,2,5,6,5,6,7,8,9,10};
        // for (<inicio>; <fin>; <paso>);
        for (int i =0; i<notas2.length; i++){
            System.out.println(notas2[i]);
        }
        System.out.println("_________________");
        // es un for each
        // item almacena el cada valor de notas2, es int porque notas2,
        // es un conjunto de int
        for (int item:notas2){
            System.out.println(item);
        }

        System.out.println("_____ordenar______");
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");




    }

}
}
