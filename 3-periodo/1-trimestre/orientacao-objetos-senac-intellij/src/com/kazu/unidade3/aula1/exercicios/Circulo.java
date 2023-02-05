package com.kazu.unidade3.aula1.exercicios;

public class Circulo extends Forma2D{


    public Circulo(double x, double y) {
        super(x, y);
    }

    @Override
    public double area(double x, double y) {
        return 2 * x * Math.pow(y, 2);
    }
}
