package com.kazu.unidade3.aula1.exercicios;

public class Triangulo extends Forma2D{

    public Triangulo(double x, double y) {
        super(x, y);
    }

    @Override
    public double area(double x, double y) {
        return x * y / 2;
    }
}
