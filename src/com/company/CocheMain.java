package com.company;

public class CocheMain {
    public static void main(String[] args) {
        String coche = "alfa romeo";
        /* PARA DEFINES UN OBJETO SE HACE DE LA SIGUIENTE FORMA

        < NAME ( DE LA class)> <IDENTIFICADOR> = new <CONSTRUCTOR>
        De esta forma la classe funciona como una plantilla de los objetos declarados

         */
        Coche cocheObj = new Coche();
        Coche cocheObj2 = new Coche("rojo", "honda", "civic", 1430.20, 6.0, 120);

        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);
        System.out.println("_____cambio de peso______");
        cocheObj2.peso = 1350.8; // Se cambio el atributo peso
        System.out.println(cocheObj2);

        System.out.println("_____ Coche Electrico _____");
        // Se crea el objeto de coche electrico
        CocheElectrico cocheElec1 = new CocheElectrico();
        // Se editan los atributos
        cocheElec1.motorElectrico = "Motor de Tesla";
        cocheElec1.color = "Blanco";
        cocheElec1.fabricante = "Tesla";
        cocheElec1.modelo = "S1 pro";
        System.out.println(cocheElec1);

        System.out.println("_____ Coche Hibrido _____");
        CocheHibrido hibrido1 = new CocheHibrido();
        hibrido1.motorHibrido = "Motor Rivian";
        System.out.println(hibrido1.motorHibrido);

        System.out.println("_____ Coche Electrico con MetodoSuper _______");
        CocheElectrico cocheElec3 = new CocheElectrico("Gris", "Rivian", "Trucc", 2500.0,6.12, 0,"MotorRivian");
        System.out.println(cocheElec3);
        cocheElec3.acelerar(50);
        System.out.println(cocheElec3);




    }
}
