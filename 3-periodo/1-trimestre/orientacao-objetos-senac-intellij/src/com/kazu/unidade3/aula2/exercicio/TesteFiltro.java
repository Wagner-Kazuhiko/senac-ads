package com.kazu.unidade3.aula2.exercicio;

import java.util.List;

public class TesteFiltro {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Filtro filtro = new Filtro();
        List<Integer> pares = filtro.filtra(numeros, new Par());
        List<Integer> impares = filtro.filtra(numeros, new Impar());
        List<Integer> primos = filtro.filtra(numeros, new Primos());
        List<Integer> multiplosDe3 = filtro.filtra(numeros, new MultiplosDe3());

        System.out.printf("Números pares:%22s\n", pares);
        System.out.printf("Números ímpares:%22s\n", impares);
        System.out.printf("Números primos:%22s\n", primos);
        System.out.printf("Números multiplos de 3:%22s\n", multiplosDe3);
    }
}
