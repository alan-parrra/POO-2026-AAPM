package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.string;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.string.N13_String_Ubicacion_Caracter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class N13_String_Ubicacion_Caracter_Test {

    N13_String_Ubicacion_Caracter procesador = new N13_String_Ubicacion_Caracter();

    @Test
    void testEncontrarCaracter() {
        assertEquals(1, procesador.obtenerUbicacion("hola", 'o'));
    }

    @Test
    void testNoEncontrado() {
        assertEquals(-1, procesador.obtenerUbicacion("hola", 'r'));
    }

    @Test
    void testPrimeraAparicion() {
        assertEquals(1, procesador.obtenerUbicacion("banana", 'a'));
    }
}