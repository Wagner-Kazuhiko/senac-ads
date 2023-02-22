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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ponto ponto)) return false;
        return x == ponto.x && y == ponto.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double distancia(Ponto ponto){
        int deltaX = this.x - ponto.x;
        int deltaY = this.y - ponto.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
