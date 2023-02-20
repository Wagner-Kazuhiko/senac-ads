package com.kazu.unidade4.aula2.generics;

public class Metodos {
    public static void main(String[] args) {

        Integer[] inteiros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] reais = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5};
        Character[] letras = {'A', 'N', 'D', 'R', 'E', 'Y'};

        System.out.println("Exibição do vetor de inteiros: ");
        exibe(inteiros);
        System.out.println("Exibição de vetor de reais: ");
        exibe(reais);
        System.out.println("Exibição de vetor de letras: ");
        exibe(letras);
        
    }


    private static void exibe(Integer[] inteiros) {
        for (Integer elemento : inteiros){
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }

    private static void exibe(Double[] reais) {
        for (Double elemento : reais){
            System.out.printf("%d ", elemento);
        }
        System.out.println();
    }

    private static void exibe(Character[] letras) {
        for (Character elemento : letras){
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }

}
