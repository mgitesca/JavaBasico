package com.company.EntradaSalida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FicheroRead {
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\Migue\\Documents\\Cursos\\0 BOOTCAMP\\NOTAS.txt");
            try {
                int dato = fichero.read(); // Lee cada renglon del fichero
                while (dato != -1){
                    System.out.print((char) dato);
                    dato = fichero.read();
                }
            } catch (IOException e){
                System.out.println("No puedo leer el fichero: "+ e.getMessage());
            }

        } catch (FileNotFoundException e){
            System.out.println("Existe un error: " +e.getMessage());
        }






    }


}
