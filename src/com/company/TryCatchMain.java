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


        /*
                // 7.  DividePorCero
        System.out.println("____DividePorCero_____");
        try {
            DividePorCero(4,0);

        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }


            public static int DividePorCero (int a, int b) throws ArithmeticException{
        int div =0;
        try{
            div = a/b;
        } catch (ArithmeticException e){
            throw  new ArithmeticException();
        }

        return div;
    }
         */

    }
}
