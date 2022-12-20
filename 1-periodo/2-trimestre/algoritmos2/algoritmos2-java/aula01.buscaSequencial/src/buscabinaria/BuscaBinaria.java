package buscabinaria;

import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("PROGRAMA BUSCA SEQUENCIAL OTIMIZADA");
		System.out.println("--------------------------");
		
		System.out.println("Digite a quantidade de elementos que o vetor terá: ");
		int n = scan.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o elemento do vetor na posição número " + i);
			vetor[i] = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("--------------------------");

		System.out.println("Qual o número procurado: ");
		int numeroProcurado = scan.nextInt();
		
		System.out.println();
		System.out.println("--------------------------");

		
		System.out.print("Vetor = ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println(buscaBinaria(vetor, numeroProcurado));

	}

	public static int buscaBinaria(int[] vetor, int numeroProcurado) {
		int inicio = 0;
		int fim = vetor.length - 1;
		
		while(inicio < fim) {
			int meio = (inicio + fim) / 2;
			if(vetor[meio] > numeroProcurado) {
				fim = meio - 1;
			}
			else if(vetor[meio] < numeroProcurado) {
				fim = meio + 1;
			}
			else {
				return meio;
			}
		}
		return -1;
	}
}
