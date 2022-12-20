package ptiAlgoritmos2;

import java.util.Scanner;

public class MeuPrograma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	       int N = scan.nextInt();

	       if (N > 0) {

	           int[] vetor = new int[N];

	           for (int i = 0; i < N; i++) {

	               vetor[i] = scan.nextInt();

	           }

	           System.out.println();

	           System.out.println(maiorDiferenca(vetor));

	           System.out.println(ordemCrescente(vetor));

	       }

	   }

	   public static int maiorDiferenca(int vetor[]) {

	       int maior, segundoMaior;

	       maior = vetor[0];

	       segundoMaior = maior;

	       for (int i = 1; i < vetor.length; i++) {

	           if (vetor[i] > maior) {

	               segundoMaior = maior;

	               maior = vetor[i];

	           } else if (vetor[i] > segundoMaior && vetor[i] != maior) {

	               segundoMaior = vetor[i];

	           }

	       }

	       if (maior == segundoMaior) {

	           return 0;

	       }

	       return maior - segundoMaior;

	   }

	   public static boolean ordemCrescente(int vetor[]) {

	       for (int i = 1; i < vetor.length; i++) {

	           if (vetor[i] < vetor[i - 1]) {

	               return false;

	           }

	       }

	       return true;

	   }

	

	}


