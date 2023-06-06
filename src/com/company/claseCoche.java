package com.company;

public class claseCoche {
    // Atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad;

    //CONSTRUCTORES
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad){
        this.color = color;
        this.fabricante= fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo= largo;
        this.velocidad= velocidad;
    }

    // COMPORTAMIENTO
    public void  acelerar(Integer cantidad){
        if (cantidad >0 && cantidad<= 120){
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "claseCoche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
