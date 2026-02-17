package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.empleado;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N15_Empleado_Menor_Salario_Edad_Inusual;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N15_Empleado_Menor_Salario_Edad_Inusual.Empleado;

class N15_Empleado_Menor_Salario_Edad_Inusual_Test {

    N15_Empleado_Menor_Salario_Edad_Inusual procesador = new N15_Empleado_Menor_Salario_Edad_Inusual();

    @Test
    void testEdadUnicaGana() {

        List<Empleado> lista = Arrays.asList(
                new Empleado("Juan", 25, 1000),
                new Empleado("Ana", 25, 2000),
                new Empleado("Luis", 40, 5000)
        );

        Empleado resultado = procesador.encontrarEspecial(lista);
        assertEquals("Luis", resultado.nombre);
    }

    @Test
    void testEmpateRarezaMenorSalario() {

        List<Empleado> lista = Arrays.asList(
                new Empleado("Pedro", 30, 8000),
                new Empleado("Maria", 50, 3000)
        );

        Empleado resultado = procesador.encontrarEspecial(lista);
        assertEquals("Maria", resultado.nombre);
    }
}