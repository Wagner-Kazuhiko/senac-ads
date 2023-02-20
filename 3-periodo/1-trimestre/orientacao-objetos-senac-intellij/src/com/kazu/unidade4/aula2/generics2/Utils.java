package com.kazu.unidade4.aula2.generics2;

import java.util.List;
import java.util.stream.Collectors;

public class Utils<T>{

    public List<T> filtra(List<T> elementos, Predicado<T> predicado){
        return elementos
                .stream()
                .filter(elemento -> predicado.valida(elemento))
                .collect(Collectors.toList());
    }

}
