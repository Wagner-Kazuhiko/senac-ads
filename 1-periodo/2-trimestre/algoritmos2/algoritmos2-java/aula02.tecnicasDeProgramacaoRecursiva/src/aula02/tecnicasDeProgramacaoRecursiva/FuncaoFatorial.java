package aula02.tecnicasDeProgramacaoRecursiva;

public class FuncaoFatorial {
		
		public static int fatorial(int n) {
			if(n <= 1) return 1; // caso básico
		    	return n * fatorial(n - 1); // passo recursivo
		}
		
		public static void main(String[] args) {
			// cálculo do fatorial de 0 a 5
			for(int n = 0; n <= 5; n++)
		    System.out.printf("%d! => %d\n", n, fatorial(n));

	}

}
