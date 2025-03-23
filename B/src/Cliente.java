import java.util.Scanner;

public class Cliente {

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        Ponto A = new Ponto(s.nextDouble(), s.nextDouble());
        Ponto B = new Ponto(s.nextDouble(), s.nextDouble());
        System.out.println((int) A.dist(B));


    }
}
