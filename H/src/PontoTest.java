
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PontoTest {

    @Test
    public void testeConstrutorComCoordenadasValidas() {
        Ponto ponto = new Ponto(3, 4);
        assertNotNull(ponto);
        assertEquals(3, ponto.getX());
        assertEquals(4, ponto.getY());
    }

    @Test
    public void testeCalculoDistancia() {
        Ponto ponto1 = new Ponto(0, 0);
        Ponto ponto2 = new Ponto(2, 0);
        assertEquals(2.0, ponto1.dist(ponto2));
    }

    @Test
    public void testToString() {
        assertEquals("(2,2)", new Ponto(2,2).toString());
        assertEquals("(3,2)", new Ponto (3,2).toString());
        assertEquals("(4,4)", new Ponto(4,4).toString());
    }

    @Test
    public void testEquals() {
        assertTrue(new Ponto(3,3).equals(new Ponto(3,3)));
        assertFalse(new Ponto(1,1).equals(new Ponto (3,2)));
        assertTrue(new Ponto(4,4).equals(new Ponto(4,4)));
    }

}
