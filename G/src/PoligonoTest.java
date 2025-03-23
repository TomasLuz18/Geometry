
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

}