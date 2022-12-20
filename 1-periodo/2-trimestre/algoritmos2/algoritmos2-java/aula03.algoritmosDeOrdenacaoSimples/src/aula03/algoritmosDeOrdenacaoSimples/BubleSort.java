package aula03.algoritmosDeOrdenacaoSimples;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		
		int[] v = {36, 12, 29, 42, 10, 83};
		System.out.printf("Início -> %s \n", Arrays.toString(v));
		
		bubleSort(v);
		System.out.printf("Fim -> %s \n", Arrays.toString(v));
	}
	
	public static void bubleSort(int[] v) {
		
		for(int i = 0; i < v.length; i++) {
			for(int j = 0; j < v.length; j++) {
				if(v[j] > v[j + 1]) {
					troca(v, j, j + 1);
				}
			}
		}
	}

	public static void troca(int[] v, int j, int i) {
		int aux = v[j];
		v[j] = v[i];
		v[i] = aux;
	}

}
