
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PoligonoTest {

    @Test
    public void testeConstrutorComPontosValidos() {
        ArrayList<Ponto> pontos = new ArrayList<>(List.of(
                new Ponto(0, 0),
                new Ponto(0, 2),
                new Ponto(2, 2)
        ));
        Poligono poligono = new Poligono(pontos);
        assertNotNull(poligono);
        assertEquals(pontos, poligono.getPontos());
    }

    @Test
    public void testeCalculoPerimetro() {
        ArrayList<Ponto> pontos = new ArrayList<>(List.of(
                new Ponto(0, 0),
                new Ponto(0, 2),
                new Ponto(2, 2),
                new Ponto(2, 0)
        ));
        Poligono poligono = new Poligono(pontos);
        assertEquals(8, poligono.perimetro(pontos));
    }

    @Test
    public void testToString0() {
        String input1 = "4 5 5 8 6 8 7 5 7";
        assertEquals("Poligono de 4 vertices: [(5,5), (8,6), (8,7), (5,7)]", new Poligono(input1).toString());
        String input2 = "3 9 3 7 1 9 1";
        assertEquals("Poligono de 3 vertices: [(9,3), (7,1), (9,1)]", new Poligono(input2).toString());
        String input3 = "4 1 2 5 6 8 7 12 14";
        assertEquals("Poligono de 4 vertices: [(1,2), (5,6), (8,7), (12,14)]", new Poligono(input3).toString());
    }

    @Test
    public void testEquals() {
        assertTrue(new Poligono("3 9 3 7 1 9 1").equals(new Triangulo("7 1 9 1 9 3")));
        assertTrue(new Quadrado("1 1 1 4 4 4 4 1").equals(new Quadrado("4 1 1 1 1 4 4 4")));
        assertFalse(new Poligono("4 1 1 3 2 5 2 7 1").equals(new Poligono("4 1 2 2 3 4 4 7 1")));
        assertFalse(new Triangulo("0 0 3 3 6 0").equals(new Triangulo("1 1 3 3 5 1")));
    }

}