package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.empleado;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N9_Empleado_Promedio_Edad_25K;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N9_Empleado_Promedio_Edad_25K.Empleado;

class N9_Empleado_Promedio_Edad_25K_Test {

    N9_Empleado_Promedio_Edad_25K procesador = new N9_Empleado_Promedio_Edad_25K();

    @Test
    void testPromedioRicos() {

        List<Empleado> lista = Arrays.asList(
                new Empleado("Juan", 30, 30000),
                new Empleado("Ana", 20, 10000),
                new Empleado("Luis", 50, 50000)
        );

        assertEquals(40.0, procesador.calcularPromedioEdadAltosIngresos(lista));
    }

    @Test
    void testNadieCumple() {
        List<Empleado> lista = Arrays.asList(
                new Empleado("Pobre1", 25, 15000),
                new Empleado("Pobre2", 30, 20000)
        );

        assertEquals(0.0, procesador.calcularPromedioEdadAltosIngresos(lista));
    }
}