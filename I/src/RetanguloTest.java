import	static	org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import	org.junit.jupiter.api.Test;

public class RetanguloTest {
    @Test
    public void testConstrutor0() {
        String input = "4 0 4 2 0 2 2 0";
        new Retangulo(input);
    }

    @Test
    public void testConstrutor1() {
        String input = "4 0 4 2 0 2";
        new Retangulo(input);
    }

    @Test
    public void testToString()
    {
        ArrayList<Ponto> pontos = new ArrayList<>();
        pontos.add(new Ponto(0,0));
        pontos.add(new Ponto(3,0));
        pontos.add(new Ponto(3,3));
        pontos.add(new Ponto(0,2));

        Retangulo r = new Retangulo(pontos);
        assertEquals("Retangulo: [(0,0), (3,0), (3,3), (0,2)]",r.toString());
    }


}
