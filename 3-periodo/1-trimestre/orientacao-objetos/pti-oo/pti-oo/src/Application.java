public class Application {

    public static void main(String[] args) {

        Ponto ponto = new Ponto();
        System.out.println(ponto.getX());
        System.out.println(ponto.getY());

        System.out.println(ponto.distancia(new Ponto(3, 6) ));

    }
}
