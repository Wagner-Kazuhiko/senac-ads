package aula03.busca;

import java.util.Locale;
import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe um texto: ");
		String texto = scan.nextLine();
		
		String yyy = inverter(texto);
		System.out.println(yyy);
		
		
		
		boolean x = palindromo(texto);
		if(x) {
			System.out.println("É um palindromo");
		}
		else {
			System.out.println("Não é palindromo");
		}
		
		
	}

	public static boolean palindromo(String texto) {
		String inverso = inverter(texto);
		return inverso.equalsIgnoreCase(texto);
	}
	
	public static String inverter(String texto) {
		String inverso = "";
		for(int i = texto.length() - 1; i >= 0; i--) {
			inverso += texto.charAt(i);
		}
		return inverso;
	}

}
