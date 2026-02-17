package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado;

/**
* este se basa en 
* analizar los salarios y 
* checar el mas alto
*/

import java.util.List;

public class N5_Empleado_Mayor_Salario {

    public static class Empleado {
        public String nombre;
        public double salario;

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }
    }

    public Empleado encontrarMayorSalario(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        Empleado elMasRico = empleados.get(0);

        for (Empleado e : empleados) {
            if (e.salario > elMasRico.salario) {
                elMasRico = e;
            }
        }
        return elMasRico;
    }
}
