package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.numero;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.numero.N1_Lista_Ceros;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class N1_Lista_Ceros_Test {

    N1_Lista_Ceros procesador = new N1_Lista_Ceros();

    @Test
    void testMoverCeros() {
        int[] input = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        assertArrayEquals(expected, procesador.moverceros(input));
    }

    @Test
    void testContarPares() {
        int[] input = {1, 2, 3, 4, 5, 6};

        assertEquals(3, procesador.contarpares(input));
    }
}