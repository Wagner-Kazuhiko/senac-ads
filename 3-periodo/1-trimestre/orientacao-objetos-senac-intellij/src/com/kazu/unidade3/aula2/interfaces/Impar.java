package com.kazu.unidade3.aula2.interfaces;

public class Impar implements Predicado{


    @Override
    public Boolean teste(Integer valor) {
        return 1 == valor % 2;
    }
}
