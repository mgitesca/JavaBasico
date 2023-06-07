package com.company;

public class CocheHibrido extends Coche{
    // Atributos
    String motorHibrido;
    // Constructor
    public  CocheHibrido(){}
    public CocheHibrido(String motorHibrido){
        this.motorHibrido = motorHibrido;
    }
    // sino se agrega la propiedad motorHibrido a ToString
    // Cuando se imprima el objeto del tipo cocheHibrido
    // Solo tendra los atributos declarados en coche
}