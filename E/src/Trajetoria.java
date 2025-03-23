import java.util.List;
/**
 * Representa uma trajetória definida por uma lista de pontos. Tem como responsabilidade fazer verificações
 * das características que formam uma trajetória
 *
 * @author Tomás Luz
 * @version 1.0 27/02(2024
 * @inv A trajetória deve conter pelo menos 2 pontos
 */
public class Trajetoria {

     private List<Ponto> pontos;
     /**
      * Construtor da classe Trajetoria. Verifica se a lista de pontos forma uma trajetória válida e
      * inicializa os pontos.
      *
      * @param pontos Lista de pontos que define a trajetória.
      */
     public Trajetoria(List<Ponto> pontos){

          if(pontos.size() < 2){

               System.out.println("Trajetoria: vi");
               System.exit(0);
          }
          segmentos(pontos);
          setPontos(pontos);
     }
     /**
      * Obtém a lista de pontos que define a trajetória.
      *
      * @return Lista de pontos da trajetória.
      */
     public List<Ponto> getPontos() {
          return pontos;
     }
     /**
      * Define a lista de pontos que define a trajetória.
      *
      * @param pontos Nova lista de pontos da trajetória.
      */
     public void setPontos(List<Ponto> pontos) {
          this.pontos = pontos;
     }

     /**
      * Cria os segmentos de reta a partir dos pontos da trajetória e verifica se eles se cruzam
      *
      * @param pontos Lista de pontos que define a trajetória
      */

     public void segmentos(List<Ponto> pontos){

          for(int i = 0; i < pontos.size() - 1; i++){

               SegmentoReta segmento1 = new SegmentoReta(pontos.get(i), pontos.get((i + 1) % pontos.size()));
               SegmentoReta segmento2 = new SegmentoReta(pontos.get((i + 2) % pontos.size()),pontos.get((i + 3) % pontos.size()));
               segmento1.arestasCruzam(segmento2);

          }

     }
}
