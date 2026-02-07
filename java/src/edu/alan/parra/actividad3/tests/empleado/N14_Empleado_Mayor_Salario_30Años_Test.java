package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.empleado;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N14_Empleado_Mayor_Salario_30Años;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N14_Empleado_Mayor_Salario_30Años.Empleado;

class N14_Empleado_Mayor_Salario_30Años_Test {

    N14_Empleado_Mayor_Salario_30Años procesador = new N14_Empleado_Mayor_Salario_30Años();

    @Test
    void testEncontrarGanador() {

        List<Empleado> lista = Arrays.asList(
                new Empleado("Juan", 20, 1000000),
                new Empleado("Ana", 35, 5000),
                new Empleado("Luis", 40, 10000)
        );

        Empleado resultado = procesador.encontrarMejorPagadoMayor30(lista);

        assertNotNull(resultado);
        assertEquals("Luis", resultado.nombre);
    }

    @Test
    void testNadieCumpleEdad() {
        List<Empleado> lista = Arrays.asList(
                new Empleado("Chavo1", 25, 20000),
                new Empleado("Chavo2", 30, 30000)
        );

        assertNull(procesador.encontrarMejorPagadoMayor30(lista));
    }
}