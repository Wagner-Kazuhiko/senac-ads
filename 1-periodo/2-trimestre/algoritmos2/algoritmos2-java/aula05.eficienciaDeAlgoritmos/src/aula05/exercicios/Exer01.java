package aula05.exercicios;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos: ");
        int n = scan.nextInt();
        int cont = 0;
        int i = 1;

        while(i <= n){
            System.out.println(i);
            i++;
            cont++;
        }

        System.out.println(cont);

    }

}
