/**
 * Classe que representa um retângulo definido por dois pontos extremos deste. Tem como responsabilidade
 * verificar se há interseção entre dois retângulos.
 *
 * @author Tomás Luz
 *
 * @version 1.0 06/03/2024
 *
 * @inv O retângulo deve ser válido, ou seja, o ponto mínimo deve ter coordenadas menores que o ponto máximo.
 */
public class Retangulo {

    private Ponto pontoMin, pontoMax;

    /**
     * Construtor da classe Retangulo.
     *
     * @param min O ponto mínimo que define o canto inferior esquerdo do retângulo.
     * @param max O ponto máximo que define o canto superior direito do retângulo.
     */
    public Retangulo(Ponto min, Ponto max){

        if(min.getX() > max.getX() || min.getY() > max.getY()){

            System.exit(0);
        }
        setPontoMin(min);
        setPontoMax(max);
    }
    /**
     * Obtém o ponto que define o canto inferior esquerdo do retângulo.
     *
     * @return O ponto inferior esquerdo do retângulo.
     */
    public Ponto getPontoMin() {
        return pontoMin;
    }
    /**
     * Define o canto inferior esquerdo do retângulo.
     *
     * @param pontoMin O novo canto inferior esquerod do retângulo.
     */
    public void setPontoMin(Ponto pontoMin) {
        this.pontoMin = pontoMin;
    }
    /**
     * Obtém o ponto que define o canto superior direito do retângulo.
     *
     * @return O ponto superior direito do retângulo.
     */
    public Ponto getPontoMax() {
        return pontoMax;
    }
    /**
     * Define o canto superior direito do retângulo.
     *
     * @param pontoMax O novo canto superior direito do retângulo.
     */
    public void setPontoMax(Ponto pontoMax) {
        this.pontoMax = pontoMax;
    }

    /**
     * Verifica se há interseção entre este retângulo e outro retângulo.
     *
     * @param r O retângulo com o qual se vai verificar a interseção.
     * @return true se houver interseção, false caso contrário.
     */
    public boolean intersecao(Retangulo r){

        if(pontoMax.getX() < r.getPontoMin().getX() || r.getPontoMax().getX() < pontoMin.getX()){

            return false;
        }

        if(pontoMax.getY() < r.getPontoMin().getY() || r.getPontoMax().getY() < pontoMin.getY()){

            return false;
        }

        return true;

    }


}
