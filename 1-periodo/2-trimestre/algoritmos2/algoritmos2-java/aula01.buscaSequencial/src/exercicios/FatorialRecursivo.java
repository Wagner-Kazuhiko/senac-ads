package exercicios;

public class FatorialRecursivo {

	public static void main(String[] args) {
		System.out.println(recursivo(5));

	}
	
	public static int recursivo(int n) {
		if(n == 0) {
			return 1;
		}
		return n* recursivo(n - 1);
	}

}
