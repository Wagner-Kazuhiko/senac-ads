package desafioSenac;

import java.util.Scanner;

public class EncontraPar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("PROGRAMA ENCONTRA PAR");
        System.out.println("-----------------------------------------");

        System.out.println("Digite a quantidade de elementos o vetor terá: ");
        int totalElementosVetor = scan.nextInt();

        int[] vetor = new int[totalElementosVetor];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o elemento do vetor na posição " + i);
            vetor[i] = scan.nextInt();
        }

        System.out.print("A soma dos pares do vetor é: " + somaPar(vetor));
    }



    public static int somaPar(int[] vetor){
        int somaPares = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                somaPares += vetor[i];
            }
        }
        return somaPares;
    }

}
