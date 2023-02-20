package com.kazu.unidade4.aula2.generics2;

import java.util.ArrayList;

public class Pilha<E>{

    private ArrayList<E> elementos = new ArrayList<>();

    public void empilha(E valor){
        elementos.add(valor);
    }

    public E desempilha(){
        if (elementos.isEmpty()) return null;
        return elementos.remove(elementos.size() - 1);
    }
}
