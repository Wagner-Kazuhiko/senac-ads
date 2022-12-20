package exercicios;

public class Fatorial {

	public static void main(String[] args) {
		for(int i = 0; i <= 5; i++) {
			System.out.println(fatorial(i));
		}

	}
	
	public static int fatorial(int n) {
		if(n <= 1) {
			return 1;
		}
		
		return n * fatorial(n - 1);
	}

}
