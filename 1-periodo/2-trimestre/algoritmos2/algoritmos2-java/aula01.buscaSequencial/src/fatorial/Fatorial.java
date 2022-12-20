package fatorial;

public class Fatorial {

	public static void main(String[] args) {
		
		for(int n = 0; n <= 3; n++) {
			System.out.printf("%d! => %d\n", n, fatorial(n));
		}
			

	}
	
	 public static int fatorial(int n) {
		 
		 if(n <= 1) return 1; // caso básico
		 	return n * fatorial(n - 1); // passo recursivo
	 }

}
