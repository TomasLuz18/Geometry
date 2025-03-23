import java.util.Objects;

/**
 * Classe que representa um ponto.
 *
 * @author Tomás Luz
 *
 * @version 1.3 01/04/2024
 *
 * @inv os pontos tem de estar no primeiro quadrante
 *
 */
public class Ponto {
    private int x,y;
    /**
     * Construtor da classe Ponto.
     * Define as coordenadas x e y do ponto.
     *
     * @param x coordenada x do ponto.
     * @param y coordenada y do ponto.
     */
    public Ponto(int x, int y){

        setX(x);
        setY(y);
    }
    /**
     * Calcula a distância entre este ponto e outro ponto dado.
     *
     * @param p Ponto ao qual a distância será calculada.
     * @return A distância entre os dois pontos.
     */
    public double dist(Ponto p){
        double dx = x - p.x;
        double dy = y - p.y;

        return Math.sqrt(dx*dx + dy*dy);
    }
    /**
     * Obtém a coordenada x do ponto.
     *
     * @return Coordenada x do ponto.
     */
    public int getX() {
        return x;
    }

    /**
     * Define a coordenada x do ponto.
     *
     * @param x Nova coordenada x do ponto.
     */
    public void setX(int x) {
        if(x < 0){
            System.out.println("Ponto:vi");
            System.exit(0);
        }
        this.x = x;
    }
    /**
     * Obtém a coordenada y do ponto.
     *
     * @return Coordenada y do ponto.
     */
    public int getY() {
        return y;
    }
    /**
     * Define a coordenada y do ponto.
     *
     * @param y Nova coordenada y do ponto.
     */
    public void setY(int y) {
        if(y < 0){
            System.out.println("Ponto:vi");
            System.exit(0);
        }
        this.y = y;
    }
    /**
     * Verifica se este ponto é igual a outro objeto.
     *
     * @param o Objeto a ser comparado.
     * @return true se o objeto passado é um ponto e tem as mesmas coordenadas x e y, false caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ponto ponto = (Ponto) o;
        return x == ponto.x && y == ponto.y;
    }
    /**
     * Retorna um código hash baseado nas coordenadas x e y do ponto.
     *
     * @return Código hash do ponto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    /**
     * Retorna uma representação em forma de string do ponto.
     *
     * @return String representando o ponto no formato "(x,y)".
     */
    @Override
    public String toString()
    {
        return "(" + getX() + "," + getY() + ")";
    }


}