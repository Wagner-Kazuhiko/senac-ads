package desafioSenac;

import java.util.Scanner;

public class EncontraImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("PROGRAMA SOMA IMPAR");
        System.out.println("---------------------------");

        System.out.println("Digite a quantidade de elementos do vetor: ");
        int elementos = scan.nextInt();

        int[] vetor = new int[elementos];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o elemento do vetor na posição " + i);
            vetor[i] = scan.nextInt();
        }

        System.out.println("A soma dos números ímpares do vetor é: " + somaImpar(vetor));
    }

    public static int somaImpar(int[] vetor) {
        int impares = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 != 0){
                impares += vetor[i];
            }
        }
        return impares;
    }
}
