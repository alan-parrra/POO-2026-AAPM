package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.empleado;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N10_Empleado_Menor_25Años;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N10_Empleado_Menor_25Años.Empleado;

class N10_Empleado_Menor_25Años_Test {

    N10_Empleado_Menor_25Años procesador = new N10_Empleado_Menor_25Años();

    @Test
    void testFiltrarJovenes() {

        List<Empleado> lista = Arrays.asList(
                new Empleado("Juan", 30),
                new Empleado("Ana", 20),
                new Empleado("Luis", 24)
        );

        List<Empleado> resultado = procesador.filtrarMenores25(lista);

        assertEquals(2, resultado.size());
        assertEquals("Ana", resultado.get(0).nombre);
        assertEquals("Luis", resultado.get(1).nombre);
    }

    @Test
    void testNingunoCumple() {
        List<Empleado> lista = Arrays.asList(
                new Empleado("A", 25),
                new Empleado("B", 40)
        );

        List<Empleado> resultado = procesador.filtrarMenores25(lista);

        assertEquals(0, resultado.size());
    }
}