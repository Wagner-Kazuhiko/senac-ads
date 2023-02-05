package com.kazu.unidade3.aula1.exercicios;

public abstract class Forma3D extends Forma{

    public Forma3D(double x, double y, double z) {
        super(x, y, z);
    }

    public Forma3D(double x, double y) {
        super(x, y);
    }

    public Forma3D(double x) {
        super(x);
    }

    public abstract double area(double x, double y, double z);

}
