package exercicios;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {36, 15, 75, 2, 16, 48, 42, 51};
		int[] b = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};
		int[] c = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		
		selectionSort(a);
		selectionSort(b);
		selectionSort(c);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));


	}
	
	public static void selectionSort(int[] vetor) {
		for(int i = 0; i < vetor.length; i++){
			int sindex = i;
			for(int j = i + 1; j < vetor.length; j++) {
				if(vetor[j] < vetor[sindex]) {
					sindex = j;
				}
			}
			swap(vetor, i, sindex);
		}
	}

	public static void swap(int[] d, int a, int b) {
		int aux = d[a];
		d[a] = d[b];
		d[b] = aux;
		
	}

}
