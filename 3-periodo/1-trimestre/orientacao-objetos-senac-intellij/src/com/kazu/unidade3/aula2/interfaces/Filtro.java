package com.kazu.unidade3.aula2.interfaces;

import java.util.List;
import java.util.stream.Collectors;

public class Filtro {

    public List<Integer> filtra(List<Integer> numeros, Predicado predicado){
        return numeros
                .stream()
                .filter(numero -> predicado.teste(numero))
                .collect(Collectors.toList());
    }

}
