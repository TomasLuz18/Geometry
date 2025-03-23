
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Classe responsável pela execução do programa, que interage com o usuário para obter o input,
 * criar instâncias dos objetos necessários e verificar se existe interseção entre os poligonos e no
 * fim exibir true se estes se intersetarem e false em caso contrário
 *
 * @author Tomás Luz
 *
 * @version 1.0 06/03/2024
 **/
public class Cliente {

    public static void main(String[] a){


        int menorX = Integer.MAX_VALUE;
        int menorY = Integer.MAX_VALUE;
        int maiorX = Integer.MIN_VALUE;
        int maiorY = Integer.MIN_VALUE;

        Scanner s = new Scanner(System.in);;
        int n = s.nextInt();
        ArrayList<Ponto> pontosPoligonos1 = new ArrayList<>();
        for(int i = 0; i < n; i++){

            int x = s.nextInt();
            int y = s.nextInt();
            Ponto p = new Ponto(x, y);
            pontosPoligonos1.add(p);

            menorX = Math.min(menorX, x);
            menorY = Math.min(menorY, y);
            maiorX = Math.max(maiorX, x);
            maiorY = Math.max(maiorY, y);

        }
        Retangulo retangulo1 = new Retangulo(new Ponto(menorX, menorY), new Ponto(maiorX, maiorY));

         menorX = Integer.MAX_VALUE;
         menorY = Integer.MAX_VALUE;
         maiorX = Integer.MIN_VALUE;
         maiorY = Integer.MIN_VALUE;
         n = s.nextInt();
        ArrayList<Ponto> pontosPoligonos2 = new ArrayList<>();
        for(int i = 0; i < n; i++){

            int x = s.nextInt();
            int y = s.nextInt();
            Ponto p = new Ponto(x, y);
            pontosPoligonos2.add(p);

            menorX = Math.min(menorX, x);
            menorY = Math.min(menorY, y);
            maiorX = Math.max(maiorX, x);
            maiorY = Math.max(maiorY, y);

        }
        Retangulo retangulo2 = new Retangulo(new Ponto(menorX, menorY), new Ponto(maiorX, maiorY));
        if(!(retangulo1.intersecao(retangulo2))){

            System.out.println("false");
            System.exit(0);
        }

        Poligono poligono1 = new Poligono(pontosPoligonos1);
        Poligono poligono2 = new Poligono(pontosPoligonos2);
        Board board = new Board(poligono1, poligono2);
        if(board.intersecao()){

            System.out.println("true");
        } else{

            System.out.println("false");
        }



    }


}
