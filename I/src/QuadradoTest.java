import	static	org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import	org.junit.jupiter.api.Test;

public class QuadradoTest {
    @Test
    public void testConstrutor0() {
        String input = "1 0 1 1 5 1 5 0";
        new Quadrado(input);
    }

    @Test
    public void testConstrutor1() {
        String input = "1 1 3 1 3 3 1 3";
        new Quadrado(input);
    }

    @Test
    public void testToString()
    {
        ArrayList<Ponto> pontos = new ArrayList<>();
        pontos.add(new Ponto(0,0));
        pontos.add(new Ponto(0,3));
        pontos.add(new Ponto(3,3));
        pontos.add(new Ponto(3,0));

        Quadrado q= new Quadrado(pontos);
        assertEquals("Quadrado: [(0,0), (0,3), (3,3), (3,0)]",q.toString());
    }



}
