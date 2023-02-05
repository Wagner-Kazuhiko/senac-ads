package com.kazu.unidade3.aula1.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Forma2D> list2D = new ArrayList<>();

        list2D.add(new Circulo(2, 3.14));
        list2D.add(new Quadrado(4, 8));
        list2D.add(new Triangulo(4, 10));

        System.out.println();
    }
}
