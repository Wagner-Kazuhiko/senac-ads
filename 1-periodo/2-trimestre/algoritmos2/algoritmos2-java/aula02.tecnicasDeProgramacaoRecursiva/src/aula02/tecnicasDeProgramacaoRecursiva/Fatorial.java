package aula02.tecnicasDeProgramacaoRecursiva;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int num;
		System.out.println("Informe um numero para calcular o fatorial: ");
		num = scan.nextInt();
		long fatorial = 1;
		for (int i = 1; i <= num; i++) {
			fatorial = fatorial * i;
			System.out.println(fatorial);
		}
		System.out.println("O fatorialde " + num + " e " + fatorial);
		
		

	}

}
