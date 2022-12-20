package exercicios;

public class FatorialIterativo {

	public static void main(String[] args) {
		for(int n = 0; n <=5; n++) {
			System.out.println(iterativo(n));
		}

	}
	
	public static int iterativo(int n) {
		int resultado = 1;
		for(int i = resultado; i <= n; i++) {
			resultado *= i;
		}
		return resultado;
	}

}
