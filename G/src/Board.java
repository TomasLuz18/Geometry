import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um plano cartesiano composto por dois polígonos.
 * Tem como responsabilidade verificar se há interseção entre os polígonos.
 *
 * @author Tomás Luz
 *
 * @version 1.0 06/03/2024
 */
public class Board {

    private Poligono poligono1, poligono2;

    /**
     * Construtor da classe Board.
     * Define os polígonos que compõem o plano cartesiano.
     *
     * @param poligono1 O primeiro polígono do plano cartesiano.
     * @param poligono2 O segundo polígono do plano cartesiano.
     */

    public Board(Poligono poligono1,Poligono poligono2){

        setPoligono1(poligono1);
        setPoligono2(poligono2);

    }
    /**
     * Obtém o primeiro polígono do plano cartesiano.
     *
     * @return O primeiro polígono do plano cartesiano.
     */
    public Poligono getPoligono1() {
        return poligono1;
    }

    /**
     * Define o primeiro polígono do plano cartesiano.
     *
     * @param poligono1 O novo primeiro polígono do plano cartesiano.
     */
    public void setPoligono1(Poligono poligono1) {
        this.poligono1 = poligono1;
    }
    /**
     * Obtém o segundo polígono do plano cartesiano.
     *
     * @return O segundo polígono do plano cartesiano.
     */
    public Poligono getPoligono2() {
        return poligono2;
    }
    /**
     * Define o segundo polígono do plano cartesiano.
     *
     * @param poligono2 O novo segundo polígono do plano cartesiano.
     */
    public void setPoligono2(Poligono poligono2) {
        this.poligono2 = poligono2;
    }
    /**
     * Verifica se há interseção entre os polígonos do plano cartesiano.
     *
     * @return true se houver interseção, false caso contrário.
     */
    public boolean intersecao(){

        ArrayList<Ponto> pontos1 = poligono1.getPontos();
        ArrayList<Ponto> pontos2 = poligono2.getPontos();

        for(int i = 0; i < pontos1.size(); i++){

            SegmentoReta segmentoPoligono1 = new SegmentoReta(pontos1.get(i), pontos1.get((i + 1) % pontos1.size()));

            for(int k = 0; k < pontos2.size(); k++){

                SegmentoReta segmentoPoligono2 = new SegmentoReta(pontos2.get(k), pontos2.get((k + 1) % pontos2.size()));
                if(segmentoPoligono1.arestasCruzam(segmentoPoligono2)){

                    return true;
                }
            }
        }

        return false;

    }
}
