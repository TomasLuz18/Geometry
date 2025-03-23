import java.util.ArrayList;
/**
 * Classe que representa um quadrado como subclasse do retangulo e do poligono.
 *
 *
 * @author Tomás Luz
 *
 * @version 1.0 01/04/2024
 *
 * @inv o quadrado tem de ter 4 pontos
 *
 */
public class Quadrado extends Retangulo
{
    /**
     * Construtor da classe Quadrado a partir de uma string de entrada. Transforma a string em uma lista de pontos.
     *
     * @param input String de entrada contendo as coordenadas dos pontos.
     */
    public Quadrado(String input){this(toInt(input)); }

    /**
     * Construtor da classe Quadrado. Verifica se a lista de pontos forma um quadrado válido.
     *
     * @param pontos Lista de pontos que define o quadrado.
     */
    public Quadrado(ArrayList<Ponto> pontos) {
        super(pontos);
        if (pontos.size() != 4) {
            System.out.println("Quadrado:vi");
            System.exit(0);
        }
    }

    /**
     * Retorna uma representação em forma de string do quadrado.
     *
     * @return String representando o quadrado.
     */
    @Override
    public String toString() {
        return "Quadrado: " + getPontos().toString();
    }

    /**
     *Converte uma string de entrada em uma lista de pontos.
     *
     * @param input String de entrada contendo as coordenadas dos pontos.
     * @return Lista de pontos extraída da string de entrada.
     */
    private static ArrayList<Ponto> toInt (String input) {
        String [] parts = input.split(" ");

        if(parts.length-1 % 2 == 0)
            System.exit(0);
        ArrayList<Ponto> pontos = new ArrayList<>();
        for(int i = 0; i < parts.length; i+=2){
            pontos.add(new Ponto(Integer.parseInt(parts[i]),Integer.parseInt(parts[i+1])));
        }
        return pontos;
    }
    /**
     * Realiza a rotação do quadrado em torno de um ponto (centroide) dado um ângulo.
     * Para cada ponto do quadrado, aplica-se a rotação utilizando a função de rotação definida na classe Ponto.
     *
     * @param angulo Ângulo de rotação em graus.
     * @param centroide Ponto em torno do qual o quadrado será rotacionado.
     * @return Novo quadrado resultante da rotação.
     */
    @Override
    public Quadrado rotacao(int angulo, Ponto centroide) {
        ArrayList<Ponto> newPontos = new ArrayList<>();
        for (Ponto ponto : pontos) {
            newPontos.add(ponto.rotacaoPonto(angulo, centroide));
        }
        return new Quadrado(newPontos);
    }
}
