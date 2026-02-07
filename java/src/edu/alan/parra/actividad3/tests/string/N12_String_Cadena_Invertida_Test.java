package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.string;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.string.N12_String_Cadena_Invertida;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class N12_String_Cadena_Invertida_Test {

    N12_String_Cadena_Invertida procesador = new N12_String_Cadena_Invertida();

    @Test
    void testInvertirNormal() {
        assertEquals("aloh", procesador.invertirCadena("hola"));
    }

    @Test
    void testInvertirFrase() {
        assertEquals("avaJ", procesador.invertirCadena("Java"));
    }
}