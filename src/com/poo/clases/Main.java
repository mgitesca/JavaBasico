package com.poo.clases;

import com.poo.herencia.Camion;
import com.poo.herencia.Coche;
import com.poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        // Clase identificador = new Clase();

        Motor motorGTI = new Motor("GTI", 190,459.0,6);

        // Vehiculo con constructor vacio
        Vehiculo prius = new Vehiculo();

        // Vehiculo con parametros

        Vehiculo crv = new Vehiculo("Honda", "crv",1.5, 2019,false, motorGTI);
        System.out.println(crv);
        System.out.println(crv.modelo);

        System.out.println("____Cambio de velocidad______");
        System.out.println("Velocidad Inicial: " + crv.velocidad);
        crv.acelear(100);
        System.out.println("Velocidad Final: " + crv.velocidad);


        // Motocicleta herencia
        System.out.println("_______Herencia_____");
        Motocicleta kawasaki = new Motocicleta();
        kawasaki.fabricante = "kawasaki";
        System.out.println(kawasaki.fabricante);

        // Polimorfismo
        System.out.println("_______Polimorfismo_____");
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelear(50);
        System.out.println("Moto: " + vehiculo.velocidad);

        vehiculo = new Camion();
        vehiculo.acelear(50);
        System.out.println("Camion: " + vehiculo.velocidad);

        vehiculo = new Coche();
        vehiculo.acelear(50);
        System.out.println("Coche: " + vehiculo.velocidad);

        // 4. las clases abstractas no se pueden instaciar, solo las clases hijas
        // es decir; no se pueden crear obejtos de la clase Vehiculo,
        // solo de la clase camion, noche y motocicleta



    }


}
