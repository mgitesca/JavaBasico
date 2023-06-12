package com.company;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        System.out.println("Texto: "); // escribir texto

        Scanner scanner = new Scanner(System.in); // lee datos de la consola
        String nombre = scanner.nextLine();
        System.out.println("Texto: " + nombre);

        System.out.println("Número: ");
        int number = scanner.nextInt();
        System.out.println("El número es: " + number);


    }
}
