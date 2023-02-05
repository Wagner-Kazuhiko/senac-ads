package com.kazu.unidade3.aula1.exercicios;

public class Quadrado extends Forma2D{

    public Quadrado(double x, double y) {
        super(x, y);
    }

    @Override
    public double area(double x, double y) {
        return x * y;
    }
}
