package recursaoLinear;

public class Somatorio {

	public static void main(String[] args) {
		int[] v = {1, 3, 5, 7, 9, 11, 13};
		System.out.println("O valor do somatório é " + somatorio(v, v.length));
	}
	
	public static int somatorio(int[] v, int n) {
		if(n == 1) {
			return v[0];
		}
		return somatorio(v, -n) + v[n];
	}

}
