package com.kazu.unidade3.aula2.exercicio;

public class MultiplosDe3 implements Predicado{


    @Override
    public Boolean teste(Integer valor) {
        return 0 == valor % 3;
    }
}
