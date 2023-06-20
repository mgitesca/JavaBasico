package com.company.EntradaSalida;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainReadAllBytes {
    public static void main (String[] args){
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\Migue\\Documents\\Cursos\\0 BOOTCAMP\\NOTAS.txt");
            try {
                byte []datos = fichero.readAllBytes(); // guarda todo le documento en memoria ram, ssolo con archivos pequeños
                for (byte dato: datos){
                    System.out.print((char)dato);
                }
            } catch (IOException e){
                System.out.println("No puedo leer el fichero: "+ e.getMessage());
            }

        } catch (FileNotFoundException e){
            System.out.println("Existe un error: " +e.getMessage());
        }





    }
}
