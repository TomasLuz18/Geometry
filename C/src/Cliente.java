
import java.util.Scanner;

public class Cliente {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Ponto[] pontos = new Ponto[n];

        for(int i = 0; i < pontos.length; i++){

            pontos[i] = new Ponto(s.nextDouble(),s.nextDouble());

        }

        s.close();
        Path p = new Path(pontos);
        double l = p.lenght(pontos);
        System.out.printf("%.2f\n", l);




    }
}
