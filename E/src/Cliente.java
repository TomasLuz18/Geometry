import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Classe responsável pela execução do programa, que interage com o usuário para obter o input,
 * criar instâncias dos objetos necessários e verificar a interseção entre a trajetória e os polígonos. Por
 * fim exibe no output se ocorreu interseção ou não.
 *
 * @author Tomás Luz
 *
 * @version 1.0 27/02/2024
 */ 
public class Cliente {

    public static void main(String[] a) {
        ArrayList<Ponto> pontosTrajetoria = new ArrayList<Ponto>();
        ArrayList<Poligono> poligonos = new ArrayList<>();

        Scanner s = new Scanner(System.in);;
        int n = s.nextInt();
        for(int i = 0; i < n; i++){

            Ponto p = new Ponto(s.nextDouble(), s.nextDouble());
            pontosTrajetoria.add(p);

        }
        Trajetoria trajetoria = new Trajetoria(pontosTrajetoria);
        int m = s.nextInt();
        for(int j = 0; j < m; j++){
            ArrayList<Ponto> pontos= new ArrayList<>();
            int k = s.nextInt();
            for(int z = 0; z < k; z++ ){

                Ponto p = new Ponto(s.nextDouble(), s.nextDouble());
                pontos.add(p);


            }
            Poligono poligono = new Poligono(pontos);
            poligonos.add(poligono);
        }
        s.close();
        Board board = new Board(trajetoria,poligonos);
        System.out.println(board.intersecao());

    }
}
