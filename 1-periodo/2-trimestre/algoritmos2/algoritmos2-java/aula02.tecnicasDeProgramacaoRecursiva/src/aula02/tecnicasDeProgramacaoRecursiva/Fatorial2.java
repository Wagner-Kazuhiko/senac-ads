package aula02.tecnicasDeProgramacaoRecursiva;

public class Fatorial2 {

	public static void main(String[] args) {
		
		int x = fatorial(5);
		System.out.println(x);

	}
	
	public static int fatorial(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n *fatorial(n -1);
	}

}
