package com.kazu.unidade4.aula2.generics2;

public class TestePilha {
    public static void main(String[] args) {

        Pilha<Integer> numeros = new Pilha<>();
        numeros.empilha(1);
        System.out.println(numeros.desempilha());

        Pilha<String> nomes = new Pilha<>();
        nomes.empilha("Andrey");
        System.out.println(nomes.desempilha());
    }
}
