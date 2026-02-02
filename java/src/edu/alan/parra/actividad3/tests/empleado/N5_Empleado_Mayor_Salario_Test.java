package edu.alan.parra.java.src.edu.alan.parra.actividad3.tests.empleado;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N5_Empleado_Mayor_Salario;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N5_Empleado_Mayor_Salario.Empleado;

class N5_Empleado_Mayor_Salario_Test {

    N5_Empleado_Mayor_Salario procesador = new N5_Empleado_Mayor_Salario();

    @Test
    void testSalarioMasAlto() {
        Empleado e1 = new Empleado("Juan", 1000);
        Empleado e2 = new Empleado("Ana", 5000);
        Empleado e3 = new Empleado("Luis", 2500);

        List<Empleado> lista = Arrays.asList(e1, e2, e3);

        assertEquals(e2, procesador.encontrarMayorSalario(lista));
    }

    @Test
    void testListaVacia() {
        List<Empleado> listaVacia = Arrays.asList();

        assertNull(procesador.encontrarMayorSalario(listaVacia));
    }
}