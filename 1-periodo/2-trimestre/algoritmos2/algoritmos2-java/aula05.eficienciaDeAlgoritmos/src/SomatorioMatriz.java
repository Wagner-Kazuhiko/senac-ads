public class SomatorioMatriz {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15}
        };

        int[] somaDasLinhas = {0, 0, 0};
        int totalDaSoma = 0;

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaDasLinhas[i] = somaDasLinhas[i] + matriz[i][j];
                totalDaSoma = totalDaSoma + matriz[i][j];
            }
        }

        System.out.printf("O soma total é: %d\n", totalDaSoma);
    }
}
