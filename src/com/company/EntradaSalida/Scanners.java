package com.company.EntradaSalida;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {

        boolean ok = false;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mete dos números: ");
            //scanner.reset();
            try{
                int a= scanner.nextInt();
                int b= scanner.nextInt();
                ok = true;
            } catch (InputMismatchException e){
                System.out.println("Números invalidos: ");
            }

        } while (!ok);





    }




}
