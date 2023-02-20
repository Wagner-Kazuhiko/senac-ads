package com.kazu.unidade4.aula2.generics2;

import java.util.List;

public class TesteFiltro {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Utils<Integer> filtroNumerico = new Utils<>();
        List<Integer> pares = filtroNumerico.filtra(numeros, numero -> numero % 2 == 0);
        List<String> nomes = List.of("Andrey", "Ana", "Joao", "Kathia", "Anabele", "Barbara", "Gerliane");
        Utils<String> filtroNomes = new Utils<>();
        List<String> nomesComA = filtroNomes.filtra(nomes, nome -> nome.toUpperCase().startsWith("A"));
        System.out.printf("Números pares:%22s\n", pares);
        System.out.printf("Nomes com A:%24s\n", nomesComA);
    }
}
