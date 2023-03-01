public class Application {

    public static void main(String[] args) {

        Ponto pontoA = new Ponto(12, 12);
        Ponto pontoB = new Ponto(9, 9);


        System.out.println(pontoA.igual(pontoB));
        System.out.println(pontoA.distancia(pontoB));

    }
}
