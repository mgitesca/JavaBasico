package com.company.EntradaSalida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedInputStream;

public class bufferInputStream {
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\Migue\\Documents\\Cursos\\0 BOOTCAMP\\NOTAS.txt");
            BufferedInputStream  ficheroBuffer = new BufferedInputStream(fichero);
            // lee el fichero por trozos grandes
            try {
                int dato = ficheroBuffer.read();
                while (dato != -1){
                    System.out.print((char) dato);
                    dato = ficheroBuffer.read();
                }

            } catch (IOException e){
                System.out.println("No puedo leer el fichero: "+ e.getMessage());
            }

        } catch (FileNotFoundException e){
            System.out.println("Existe un error: " +e.getMessage());
        }
    }


}
