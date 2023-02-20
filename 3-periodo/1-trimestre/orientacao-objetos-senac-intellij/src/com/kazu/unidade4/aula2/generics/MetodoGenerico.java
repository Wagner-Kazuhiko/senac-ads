package com.kazu.unidade4.aula2.generics;

public class MetodoGenerico {
    public static <T> void exibe(T[] elementos){

        for (T elemento : elementos){
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }

}
