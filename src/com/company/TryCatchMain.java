package com.company;

public class TryCatchMain {
    public static void main(String[] args) {
        // Tratamiento para cuando existene errores

        try{
            // Codigo que puede dar errores
            int result = 5/0;
        } catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("Cierre de recursos");
            //Esto siempre se ejecuta
        }
        System.out.println("FIN");

    }
}
