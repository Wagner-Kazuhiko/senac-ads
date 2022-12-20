package fibo;

public class Metodos {

	int fibonacci (int n) {
		if(n == 1 || n == 0) return n;
		return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
