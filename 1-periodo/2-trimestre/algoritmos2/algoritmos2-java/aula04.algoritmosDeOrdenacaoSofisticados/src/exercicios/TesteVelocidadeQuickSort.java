package exercicios;

import java.util.Arrays;

public class TesteVelocidadeQuickSort {

        public static void main(String[] args) {
            int a[] = {10, 29, 31, 15, 12};
            int b[] = {10, 15, 16, 18, 19, 20};
            int c[] = {1, 2, 3, 5, 4, 6, 7, 8};

            long tempoInicial = System.nanoTime();
            sort(a, 0, a.length - 1);
            long tempoFinal = System.nanoTime();

            System.out.printf("A ordenação do vetor A demorou %d nano segundos.\n", tempoFinal - tempoInicial);

            tempoInicial = System.nanoTime();
            sort(b, 0, b.length - 1);
            tempoFinal = System.nanoTime();

            System.out.printf("A ordenação do vetor B demorou %d nano segundos.\n", tempoFinal - tempoInicial);

            tempoInicial = System.nanoTime();
            sort(c, 0, b.length - 1);
            tempoFinal = System.nanoTime();

            System.out.printf("A ordenação do vetor C demorou %d nano segundos.\n", tempoFinal - tempoInicial);


        }
        public static void sort(int[] X, int inicio, int fim) {
            if(inicio < fim) {
                int pivot = divide(X, inicio, fim);
                sort(X, inicio, pivot - 1);
                sort(X, pivot + 1, fim);
            }
        }
        public static int divide(int[] X, int inicio, int fim) {
            int pivot = X[inicio];
            int postPivot = inicio;

            for (int i = inicio + 1; i <= fim; i++) {
                if(X[i] < pivot) {
                    X[postPivot] = X[i];
                    X[i] = X[postPivot + 1];
                    postPivot++;
                }
            }

            X[postPivot] = pivot;
            return postPivot;
        }


    }



