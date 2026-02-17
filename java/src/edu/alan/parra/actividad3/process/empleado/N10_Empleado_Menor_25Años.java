package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado;

/**
    * esta clase se encarga de filtrar a los empleados basandose 
    * en la edad y identifica los menores de 25
    */

import java.util.ArrayList;
import java.util.List;

public class N10_Empleado_Menor_25Años {

    public static class Empleado {
        public String nombre;
        public int edad;

        public Empleado(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }

    public List<Empleado> filtrarMenores25(List<Empleado> empleados) {
        List<Empleado> resultado = new ArrayList<>();

        if (empleados == null) {
            return resultado;
        }

        for (Empleado e : empleados) {
            if (e.edad < 25) {
                resultado.add(e);
            }
        }

        return resultado;
    }
}
