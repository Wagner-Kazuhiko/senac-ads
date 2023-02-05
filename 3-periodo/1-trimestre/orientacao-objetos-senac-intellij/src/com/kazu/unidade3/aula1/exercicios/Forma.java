package com.kazu.unidade3.aula1.exercicios;

public class Forma {

    private double x;
    private double y;
    private double z;

    public Forma(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Forma(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Forma(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
