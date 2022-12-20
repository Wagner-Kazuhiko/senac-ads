package aula00.chamandoMetodo;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("PROGRAMA DO DOBRO");
		System.out.println("-------------------------------------------------------");
		System.out.println("Digite um número e ele será dobrado: ");
		
		int n = scan.nextInt();
		int x = dobro(n);
		System.out.println("O dobro de " + n + " é " + x);

	}
	
	public static int dobro (int numero) {
		int d = numero * 2;
		return d;
	}

}
