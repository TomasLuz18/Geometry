/**
 * Classe que representa um ponto. Tem como responsabilidades calcular a distância entre dois
 * pontos e armanezar as coordenadas x e y de um ponto
 *
 * @author Tomás Luz
 *
 * @version 1.0 27/02/2024
 *
 * @inv os pontos tem de estar no primeiro quadrante
 *
 */
public class Ponto {
    private double x,y;
    /**
     * Construtor da classe Ponto.
     * Define as coordenadas x e y do ponto.
     *
     * @param x coordenada x do ponto.
     * @param y coordenada y do ponto.
     */
    public Ponto(double x, double y){

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
    public double getX() {
        return x;
    }

    /**
     * Define a coordenada x do ponto.
     *
     * @param x Nova coordenada x do ponto.
     */
    public void setX(double x) {
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
    public double getY() {
        return y;
    }
    /**
     * Define a coordenada y do ponto.
     *
     * @param y Nova coordenada y do ponto.
     */
    public void setY(double y) {
        if(y < 0){
            System.out.println("Ponto:vi");
            System.exit(0);
        }
        this.y = y;
    }
}