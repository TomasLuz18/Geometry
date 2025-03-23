
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um polígono definido por uma lista de pontos. Tem como responsabilidades calcular
 * o perímetro do polígono, fazer verificações das características que formam um polígono
 *
 *
 * @author Tomás Luz
 *
 * @version 1.2 27/02/2024
 *
 * @inv o polígono tem de ter pelo menos 3 pontos
 *
 */

public class Poligono {

    private final ArrayList<Ponto> pontos;
    /**
     * Construtor da classe Poligono. Verifica se a lista de pontos forma um polígono válido e inicializa os pontos
     * do polígono.
     *
     * @param pontos Lista de pontos que define o polígono.
     */
    public Poligono(ArrayList<Ponto> pontos){

        if(pontos.size() < 3){

            System.out.println("Poligono:vi");
            throw new IllegalArgumentException();
        }
        retas(pontos);
        segmentos(pontos);
        this.pontos = pontos;

    }
    /**
     * Obtém a lista de pontos que define o polígono.
     *
     * @return Lista de pontos do polígono.
     */
    public ArrayList<Ponto> getPontos() {
        return pontos;
    }
    /**
     * Cria as retas que conectam os pontos do polígono e verifica se eles são colineares.
     *
     * @param pontos Lista de pontos que define o polígono.
     */
    public void retas(List<Ponto> pontos){

        for(int i=0; i < pontos.size(); i++){

            Reta reta = new Reta(pontos.get(i), pontos.get((i + 1) % pontos.size()));
            reta.colineares(pontos.get((i + 2) % pontos.size()));
        }
    }

    /**
     * Cria os segmentos de reta a partir dos pontos do polígono e verifica se eles se cruzam.
     *
     * @param pontos Lista de pontos que define o polígono.
     */
    public void segmentos(List<Ponto> pontos){

        for(int i = 0; i < pontos.size(); i++){

            SegmentoReta segmento1 = new SegmentoReta(pontos.get(i), pontos.get((i + 1) % pontos.size()));
            SegmentoReta segmento2 = new SegmentoReta(pontos.get((i + 2) % pontos.size()),pontos.get((i + 3) % pontos.size()));
            if(segmento1.arestasCruzam(segmento2)){

                System.out.println("Poligono:vi");
                System.exit(0);
            };

        }

    }
    /**
     * Calcula o perímetro do polígono.
     *
     * @param pontos Lista de pontos que define o polígono.
     *
     * @return  perímetro do polígono.
     */

    public int perimetro(List<Ponto> pontos){

        double result = 0;
        for(int i = 0; i < pontos.size() ; i++){

            result += pontos.get(i).dist(pontos.get((i + 1) % pontos.size()));
        }

        return (int) result;
    }


}
