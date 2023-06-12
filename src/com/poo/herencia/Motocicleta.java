package com.poo.herencia;

import com.poo.clases.Motor;
import com.poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    // Atributos
    boolean baul;

    // 2 Constructor

    public  Motocicleta (){}
    public Motocicleta (String fabricante, String modelo, double cc, int year, boolean sport, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, year, sport, motor);
        this.baul = baul;
    }
}
