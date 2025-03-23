
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {


    @Test
    public void testeSemIntersecao() {
        // Criar polígonos sem interseção
        ArrayList<Ponto> pontos1 = new ArrayList<>();
        pontos1.add(new Ponto(1, 1));
        pontos1.add(new Ponto(3, 1));
        pontos1.add(new Ponto(3, 3));
        Poligono poligono1 = new Poligono(pontos1);

        ArrayList<Ponto> pontos2 = new ArrayList<>();
        pontos2.add(new Ponto(5, 5));
        pontos2.add(new Ponto(7, 5));
        pontos2.add(new Ponto(7, 7));
        Poligono poligono2 = new Poligono(pontos2);

        Board board = new Board(poligono1, poligono2);

        assertFalse(board.intersecao());
    }

    @Test
    public void testeIntersecao() {
        // Criar polígonos com interseção
        ArrayList<Ponto> pontos1 = new ArrayList<>();
        pontos1.add(new Ponto(1, 1));
        pontos1.add(new Ponto(3, 1));
        pontos1.add(new Ponto(3, 3));
        Poligono poligono1 = new Poligono(pontos1);

        ArrayList<Ponto> pontos2 = new ArrayList<>();
        pontos2.add(new Ponto(2, 2));
        pontos2.add(new Ponto(4, 2));
        pontos2.add(new Ponto(4, 4));
        Poligono poligono2 = new Poligono(pontos2);

        Board board = new Board(poligono1, poligono2);

        assertTrue(board.intersecao());
    }

}
