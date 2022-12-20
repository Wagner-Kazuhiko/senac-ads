package aula03.busca;

import java.util.Locale;
import java.util.Scanner;

public class DesafioPalindromo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um texto: ");
		String texto = scan.nextLine();
		
		String y = inverter(texto);
		System.out.println(y);
		
		boolean x = palindromo(texto);
		
		if(x) {
			System.out.println("É palindromo");
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
		String textoInvertido = "";
		int cont = 0;
		while(cont < texto.length()) {
			char letra = texto.charAt(cont);
			cont ++;
		}
		return textoInvertido;
	}

}
