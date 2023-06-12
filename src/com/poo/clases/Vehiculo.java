package com.poo.clases;

public class Vehiculo {

        // 1. Atributos

        protected String fabricante;
        protected String modelo;
        protected double cc;
        protected int year;
        protected boolean sport;
        protected int velocidad;
        protected Motor motor;


        // 2. Constructores

        public Vehiculo (){}
        public Vehiculo (String fabricante, String modelo, double cc, int year, boolean sport, Motor motor){
            this.fabricante =fabricante;
            this.modelo = modelo;
            this.cc = cc;
            this.year = year;
            this.sport = sport;
            this.motor = motor;
            this.velocidad =0;
        }
        public Vehiculo (String fabricante, String modelo){
            this.fabricante = fabricante;
            this.modelo = modelo;
        }

        // 3. Métodos (comportamiento)
        public  void acelear( int cantidad){
            this.velocidad += cantidad;
        }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", sport=" + sport +
                ", velocidad=" + velocidad +
                '}';
    }
}
