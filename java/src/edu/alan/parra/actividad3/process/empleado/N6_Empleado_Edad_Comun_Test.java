package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado.N6_Empleado_Edad_Comun.Empleado;

class N6_Empleado_Edad_Comun_Test {

    N6_Empleado_Edad_Comun procesador = new N6_Empleado_Edad_Comun();

    @Test
    void testEdadMasComun_Normal() {

        List<Empleado> lista = Arrays.asList(
                new Empleado("Juan", 25),
                new Empleado("Ana", 30),
                new Empleado("Luis", 25),
                new Empleado("Pedro", 25)
        );

        assertEquals(25, procesador.encontrarEdadComun(lista));
    }

    @Test
    void testEdadMasComun_Unico() {

        List<Empleado> lista = Arrays.asList(
                new Empleado("Solo", 40)
        );

        assertEquals(40, procesador.encontrarEdadComun(lista));
    }
}