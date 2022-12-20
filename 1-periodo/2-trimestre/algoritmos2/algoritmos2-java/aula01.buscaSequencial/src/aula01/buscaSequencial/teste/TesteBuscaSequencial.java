package aula01.buscaSequencial.teste;

import java.util.Scanner;

public class TesteBuscaSequencial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("PROGRAMA BUSCA SEQUENCIAL");
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
		
		if(numeroProcurado == buscaLinear(vetor, numeroProcurado)) {
			buscaLinear(vetor, numeroProcurado);
		}
		

	}
	
	public static int buscaLinear(int[] vetor, int numeroProcurado) {
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == numeroProcurado) {
				System.out.println(vetor[i]);
			}
		}
		return -1;
	}

}
