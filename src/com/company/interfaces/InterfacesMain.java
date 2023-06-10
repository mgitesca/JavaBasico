package com.company.interfaces;

//Llamamos a la clase coche
import com.company.Coche;
/*
Las interfaces pueden ser las operaciones a realizar con las bases de datos
A Despues de aplican a los objetos (MySQL, PostgresSQL,...)
 */


public class InterfacesMain {
    public static void main(String[] args) {
        CocheService service1 = new CocheServiceSportImpl ();
        CocheService service2 = new CocheServiceClassicImpl ();

        Coche coche1 =  service1.crearCocheDemo();
        Coche coche2 =  service2.crearCocheDemo();



    }


}
