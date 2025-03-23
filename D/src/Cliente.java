import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe que contém o método principal(main) para interação com o usuário. Tem como responsabilidades
 * ler as coordenadas dos pontos do polígono a partir do input do usuário, criar um objeto Poligono com base na lista
 * criada a partir dos pontos dados, calcular o seu perímetro e exibi-lo no output
 *
 * @author Tomás Luz
 *
 * @version 1.0 27/02/2024
 */
public class Cliente {

    public static void main(String[] a) {
        ArrayList<Ponto> pontos = new ArrayList<Ponto>();
        Scanner s = new Scanner(System.in);;
        int n = s.nextInt();
       for(int i = 0; i < n; i++){

           Ponto p = new Ponto(s.nextDouble(), s.nextDouble());
           pontos.add(p);

       }
        s.close();
        Poligono poligono = new Poligono(pontos);
        System.out.println(poligono.perimetro(pontos));

    }
 }

