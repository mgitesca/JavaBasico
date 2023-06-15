package com.company;

public class TryCatchMain {
    public static void main(String[] args) {
        // Tratamiento para cuando existene errores

        try{
            // Codigo que puede dar errores
            int result = 5/0;
        //} catch (Exception e){   Captura todas las exception
        } catch (ArithmeticException e){ // catch (<TipoException> e) el e siempre va
            e.printStackTrace();
        } finally {
            System.out.println("Cierre de recursos");
            //Esto siempre se ejecuta
        }
        System.out.println("FIN");

    }
}
