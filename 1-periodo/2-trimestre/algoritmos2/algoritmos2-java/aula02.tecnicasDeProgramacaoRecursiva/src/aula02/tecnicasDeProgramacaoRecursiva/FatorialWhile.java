package aula02.tecnicasDeProgramacaoRecursiva;

import java.util.Scanner;

public class FatorialWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do fatorial: ");
		int num = scan.nextInt();
		long fatorial = 1;
		int i = 1;
		
		while(i <= num) {
			fatorial = fatorial * i;
			i++;
			System.out.println(fatorial);
		}
		

	}

}
