import java.util.List;
/**
 * Representa um plano composto por uma trajetória e vários polígonos. É responsável por verificar
 * se a trajetória interseta algum dos polígonos
 *
 * @author Tomás Luz
 * @version 1.0 27/02/2024
 *
 */
public class Board {

    private Trajetoria trajetoria;
    private List<Poligono> poligonos;
    /**
     * Construtor da classe Board. Inicializa a trajetoria e os poligonos
     *
     * @param trajetoria Trajetoria.
     * @param poligonos Lista de polígonos.
     */
    public Board(Trajetoria trajetoria, List<Poligono> poligonos){

        setTrajetoria(trajetoria);
        setPoligonos(poligonos);

    }
    /**
     * Obtém a trajetória
     *
     * @return Trajetória
     */

    public Trajetoria getTrajetoria() {
        return trajetoria;
    }
    /**
     * Define a trajetória
     *
     * @param trajetoria Nova trajetória .
     */
    public void setTrajetoria(Trajetoria trajetoria) {
        this.trajetoria = trajetoria;
    }
    /**
     * Obtém a lista de polígonos
     *
     * @return Lista de polígonos.
     */
    public List<Poligono> getPoligonos() {
        return poligonos;
    }
    /**
     * Define a lista de polígonos
     *
     * @param poligonos Nova lista de polígonos .
     */
    public void setPoligonos(List<Poligono> poligonos) {
        this.poligonos = poligonos;
    }
    /**
     * Verifica se a trajetória interseta algum dos polígonos no plano.
     *
     * @return 1 se houver interseção, 0 caso contrário.
     */
    public int intersecao(){


            for(int i = 0; i < trajetoria.getPontos().size() - 1; i++){

                SegmentoReta segmentoTrajetoria = new SegmentoReta(trajetoria.getPontos().get(i), trajetoria.getPontos().get(i + 1));

                for(int j = 0; j < poligonos.size(); j++){

                    Poligono poligono = poligonos.get(j);
                    List<Ponto> pontos = poligono.getPontos();

                    for(int k = 0; k < pontos.size(); k++){

                        SegmentoReta segmentoPoligono = new SegmentoReta(pontos.get(k), pontos.get((k + 1) % pontos.size()));
                        if(segmentoTrajetoria.arestasCruzam(segmentoPoligono)){

                            return 1;
                        }


                    }
                }
            }
            return 0;
    }
}
