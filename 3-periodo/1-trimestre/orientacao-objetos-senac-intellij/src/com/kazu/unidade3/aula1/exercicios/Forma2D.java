package com.kazu.unidade3.aula1.exercicios;

public abstract class Forma2D extends Forma{


    public Forma2D(double x, double y) {
        super(x, y);
    }

    public Forma2D(double x) {
        super(x);
    }

    public abstract double area(double x, double y);
}
