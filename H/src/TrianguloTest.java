import	static	org.junit.jupiter.api.Assertions.*;
import	org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TrianguloTest
{
    @Test
    public void testConstrutor0() {
        String input = "2 0 4 0 6 0";
        new Triangulo(input);
    }

    @Test
    public void testConstrutor1() {
        String input = "2 0 4 0 6 0 6 0";
        new Triangulo(input);
    }
    
    @Test
    public void testToString()
    {
        ArrayList<Ponto> pontos = new ArrayList<>();
        pontos.add(new Ponto(0,0));
        pontos.add(new Ponto(2,0));
        pontos.add(new Ponto(1,2));

        Triangulo triangulo = new Triangulo(pontos);
        assertEquals("Triangulo: [(0,0), (2,0), (1,2)]",triangulo.toString());

    }

}
