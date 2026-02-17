package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.empleado;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N8_Empleado_Salario_Promedio;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N8_Empleado_Salario_Promedio.Empleado;

class N8_Empleado_Salario_Promedio_Test {

    N8_Empleado_Salario_Promedio procesador = new N8_Empleado_Salario_Promedio();

    @Test
    void testPromedioSalario_Normal() {

        List<Empleado> lista = Arrays.asList(
                new Empleado("Juan", 1000),
                new Empleado("Ana", 2000),
                new Empleado("Pedro", 3000)
        );

        assertEquals(2000.0, procesador.calcularPromedioSalario(lista));
    }

    @Test
    void testPromedioSalario_Decimales() {

        List<Empleado> lista = Arrays.asList(
                new Empleado("A", 1500.50),
                new Empleado("B", 2500.50)
        );

        assertEquals(2000.0, procesador.calcularPromedioSalario(lista));
    }
}