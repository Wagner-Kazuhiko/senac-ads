package com.kazu.unidade3.aula1.exercicios;

public class Cubo extends Forma3D{


    public Cubo(double x, double y, double z) {
        super(x, y, z);
    }

    public Cubo(double x, double y) {
        super(x, y);
    }

    public Cubo(double x) {
        super(x);
    }

    @Override
    public double area(double x, double y, double z) {
        return x * y * z;
    }
}
