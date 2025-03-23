import java.util.ArrayList;
/**
 * Classe que representa um triangulo como subclasse de um poligono.
 *
 *
 * @author Tomás Luz
 *
 * @version 1.0 01/04/2024
 *
 * @inv o triangulo tem de ter 3 pontos
 *
 */

public class Triangulo extends Poligono
{

    /**
     * Construtor da classe Triangulo. Verifica se a lista de pontos forma um triângulo válido.
     *
     * @param pontos Lista de pontos que define o triângulo.
     */
    public Triangulo(ArrayList<Ponto> pontos)
    {
        super(pontos);
        if(getPontos().size() != 3)
        {
            System.out.println("Triangulo:vi");
            System.exit(0);
        }
    }
    /**
     * Construtor da classe Triangulo a partir de uma string de entrada. Transforma a string em uma lista de pontos.
     *
     * @param input String de entrada contendo as coordenadas dos pontos.
     */
    public Triangulo(String input)
    {
        this(toInt(input));
    }
    /**
     * Retorna uma representação em forma de string do triângulo.
     *
     * @return String representando o triângulo.
     */
    @Override
    public String toString() {
        return "Triangulo: " + getPontos().toString();
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
     * Realiza a rotação do triângulo em torno de um ponto (centroide) dado um ângulo.
     * Para cada ponto do triângulo, aplica-se a rotação utilizando a função de rotação definida na classe Ponto.
     *
     * @param angulo Ângulo de rotação em graus.
     * @param centroide Ponto em torno do qual o triângulo será rotacionado.
     * @return Novo triângulo resultante da rotação.
     */
    @Override
    public Triangulo rotacao(int angulo, Ponto centroide) {
        ArrayList<Ponto> newPontos = new ArrayList<>();
        for (Ponto ponto : pontos) {
            newPontos.add(ponto.rotacaoPonto(angulo, centroide));
        }
        return new Triangulo(newPontos);
    }
    /**
     * Realiza a translação do triângulo movendo todos os seus pontos por uma quantidade específica nas direções x e y.
     * Para cada ponto do triângulo, aplica-se a translação utilizando a função de translação definida na classe Ponto.
     *
     * @param x Quantidade a ser transladada na direção x.
     * @param y Quantidade a ser transladada na direção y.
     * @return Novo triângulo resultante da translação.
     */
    @Override
    public Triangulo translacao(int x, int y)
    {
        ArrayList<Ponto> newPontos = new ArrayList<>();
        for (Ponto ponto : pontos) {
            newPontos.add(ponto.translacaoPonto(x, y));
        }

        return new Triangulo(newPontos);
    }

}