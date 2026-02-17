package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.empleado;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N11_Empleado_Departamento_Sistemas;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N11_Empleado_Departamento_Sistemas.Empleado;

class N11_Empleado_Departamento_Sistemas_Test {

    N11_Empleado_Departamento_Sistemas procesador = new N11_Empleado_Departamento_Sistemas();

    @Test
    void testContarSistemas() {

        List<Empleado> lista = Arrays.asList(
                new Empleado("Juan", "Sistemas"),
                new Empleado("Ana", "RH"),
                new Empleado("Luis", "Sistemas")
        );

        assertEquals(2, procesador.contarEmpleadosSistemas(lista));
    }

    @Test
    void testNingunoDeSistemas() {
        List<Empleado> lista = Arrays.asList(
                new Empleado("Pedro", "Ventas"),
                new Empleado("Maria", "Contabilidad")
        );

        assertEquals(0, procesador.contarEmpleadosSistemas(lista));
    }
}