package aula02.tecnicasDeProgramacaoRecursiva;

import java.util.Scanner;

public class MaiorIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("PROGRAMA DA MAIOR IDADE");
		System.out.println("--------------------------------------------------");
		
		System.out.println("Informe a sua idade: ");
		int idade = scan.nextInt();
		
		boolean x = ehMaiorIdade(idade);
		
		System.out.println("É maior de idade?");
		System.out.println(x);
		

	}
	
	public static boolean ehMaiorIdade (int n) {
		boolean maior = n >= 18;
		return maior;
	}

}
