package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.empleado;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N7_Empleado_Edad_Promedio;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N7_Empleado_Edad_Promedio.Empleado;

class N7_Empleado_Edad_Promedio_Test {

    N7_Empleado_Edad_Promedio procesador = new N7_Empleado_Edad_Promedio();

    @Test
    void testPromedioExacto() {

        List<Empleado> lista = Arrays.asList(
                new Empleado("A", 20),
                new Empleado("B", 30),
                new Empleado("C", 40)
        );

        assertEquals(30.0, procesador.calcularPromedioEdad(lista));
    }

    @Test
    void testPromedioDecimal() {

        List<Empleado> lista = Arrays.asList(
                new Empleado("A", 20),
                new Empleado("B", 21)
        );

        assertEquals(20.5, procesador.calcularPromedioEdad(lista));
    }
}