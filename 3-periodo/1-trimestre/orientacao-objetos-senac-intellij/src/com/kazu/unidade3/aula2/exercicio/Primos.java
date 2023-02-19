package com.kazu.unidade3.aula2.exercicio;

public class Primos implements Predicado{
    @Override
    public Boolean teste(Integer valor) {
        return 1 == valor / valor;
    }
}
