package exercicios;

import java.util.Arrays;

public class TesteBuble {

    public static void main(String[] args) {
        int[] v = {10, 8, 7, 0};

        System.out.printf("Início -> %s \n", Arrays.toString(v));

        bubleSort(v);
        System.out.printf("Fim -> %s \n", Arrays.toString(v));
    }

    public static void bubleSort(int[] v) {

        boolean troca = true;
        for(int i = 0; i < v.length && troca; i++) {
            troca = false;
            for(int j = 0; j < v.length - i - 1; j++) {
                if(v[j] > v[j + 1]) {
                    troca(v, j, j + 1);
                    troca = true;
                }
            }

            System.out.printf("Passagem %d -> %s\n", i, Arrays.toString(v));
        }
    }

    public static void troca(int[] v, int j, int i) {
        int aux = v[j];
        v[j] = v[i];
        v[i] = aux;
    }

}
