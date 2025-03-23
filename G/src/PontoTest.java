
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

}
