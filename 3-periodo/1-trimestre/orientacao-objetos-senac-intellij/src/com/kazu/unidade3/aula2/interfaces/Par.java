package com.kazu.unidade3.aula2.interfaces;

public class Par implements Predicado{

    @Override
    public Boolean teste(Integer valor) {
        return 0 == valor % 2;
    }
}
