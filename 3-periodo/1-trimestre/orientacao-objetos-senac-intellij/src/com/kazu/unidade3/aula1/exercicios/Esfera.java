package com.kazu.unidade3.aula1.exercicios;

public class Esfera extends Forma3D{


    public Esfera(double x, double y, double z) {
        super(x, y, z);
    }

    public Esfera(double x, double y) {
        super(x, y);
    }

    public Esfera(double x) {
        super(x);
    }

    @Override
    public double area(double x, double y, double z) {
        return 4 * x * y * z;
    }
}
