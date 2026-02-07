package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.numero;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.numero.N2_Cantidad_Pares;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class N2_Cantidad_Pares_Test {

    N2_Cantidad_Pares procesador = new N2_Cantidad_Pares();

    @Test
    void testContarPares() {
        int[] input = {3, 4, 5, 7, 6};
        assertEquals(2, procesador.contarPares(input));
    }

    @Test
    void testSinPares() {
        int[] input = {1, 3, 5};
        assertEquals(0, procesador.contarPares(input));
    }
}