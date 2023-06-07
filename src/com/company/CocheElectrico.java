package com.company;
/*
Clase de herencia, en este caso hereda de coche
 */
public class CocheElectrico extends Coche{
    //Atributo
    String motorElectrico;
    // Constructor
    public CocheElectrico(){}
    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }
    // Metodo Super para acceder a las atributos de la clase pabre
    //  Cuando se crea un objeto del tipo CocheElectrico
    public CocheElectrico (String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad,String motorElectrico ){
        super(color, fabricante, modelo, peso, largo, velocidad);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
