package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.string;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.string.N4_String_Vocales;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class N4_String_Vocales_Test {

    N4_String_Vocales procesador = new N4_String_Vocales();

    @Test
    void testContarVocales_Hola() {
        assertEquals(2, procesador.contarVocales("hola"));
    }

    @Test
    void testContarVocales_SinVocales() {
        assertEquals(0, procesador.contarVocales("xyz"));
    }
}