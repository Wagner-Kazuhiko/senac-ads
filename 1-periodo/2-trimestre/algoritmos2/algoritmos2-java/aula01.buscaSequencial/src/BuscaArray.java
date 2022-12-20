import java.util.Scanner;

public class BuscaArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de elementos o vetor terá: ");
		int elementos = scan.nextInt();
		
		System.out.println("Digite o número que quer encontrar: ");
		int x = scan.nextInt();
		
		int[] vetor = new int [elementos];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o elemento do vetor na posição " + i);
			vetor[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " "); 
		}
		
		System.out.print("Elemento encontrado na posição: ");
		System.out.print(buscaSequencial(vetor, x));
		
		
				
	}
	
	public static int buscaSequencial(int[] vetor, int valorProcurado) {
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == valorProcurado) {
				return i;
			}
		}
		return -1;
	}

}
