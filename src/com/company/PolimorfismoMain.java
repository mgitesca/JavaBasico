package com.company;

public class PolimorfismoMain {
    public static void main(String[] args) {
        Coche coche1= new Coche();
        CocheElectrico coche2 = new CocheElectrico();
        CocheHibrido coche3= new CocheHibrido();

        // POLIFORMISMO (desde la base)
        /*
        Esto ayuda cuando se crean array de coches, ya que
        si son diferentes no se podria crear el array
         */
        Coche coche4 = new CocheElectrico();
        Coche coche5= new CocheHibrido();

        // verificar si coche4 es de la clase CocheElectrico
        if (coche4 instanceof CocheElectrico){
            System.out.println("ES Electrico");
        }

    }
}
