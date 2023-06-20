package com.company.EntradaSalida;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class PrintStream {
    public static void main(String[] args) {


        try {
            InputStream in = new FileInputStream("C:\\Users\\Migue\\Documents\\Cursos\\0 BOOTCAMP\\NOTAS.txt");
            byte []datos = in.readAllBytes();
            in.close(); // cierra del documento-fichero

            java.io.PrintStream out = new java.io.PrintStream("C:\\Users\\Migue\\Documents\\Cursos\\0 BOOTCAMP\\NOTAS_java.txt");
            out.write(datos);
            out.close(); // cierra el fichero destino

        } catch (Exception e){
            System.out.println("Excepcion: " + e.getMessage());

        }







    }
}
