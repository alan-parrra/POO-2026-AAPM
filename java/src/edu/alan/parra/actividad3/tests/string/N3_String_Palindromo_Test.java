package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.string;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.string.N3_String_Palindromo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class N3_String_Palindromo_Test {

    N3_String_Palindromo procesador = new N3_String_Palindromo();

    @Test
    void testEsPalindromo_CasoTrue() {
        assertTrue(procesador.esPalindromo("ana"));
    }

    @Test
    void testEsPalindromo_CasoFalse() {
        assertFalse(procesador.esPalindromo("hola mundo"));
    }

    @Test
    void testEsPalindromo_OtroCaso() {
        assertTrue(procesador.esPalindromo("oso"));
    }
}