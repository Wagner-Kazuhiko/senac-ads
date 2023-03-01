import java.util.Objects;

public class Ponto {

    private int x;
    private  int y;

    public Ponto(){
        this.x = 0;
        this.y = 0;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean igual(Ponto ponto) {
        if (this.x == ponto.x && this.y == ponto.y) return true;
        else return false;
    }

    public double distancia(Ponto ponto){
        int posicaoX = this.x - ponto.x;
        int posicaoY = this.y - ponto.y;
        return Math.sqrt(posicaoX * posicaoX + posicaoY * posicaoY);
    }
}
