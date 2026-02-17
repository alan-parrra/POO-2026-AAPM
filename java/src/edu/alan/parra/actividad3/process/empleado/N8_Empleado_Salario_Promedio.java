package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado;

/**
* este se enfoca en
* analizar todos los
* salarios y luego sacar el promedio
*/

import java.util.List;

public class N8_Empleado_Salario_Promedio {

    public static class Empleado {
        public String nombre;
        public double salario;

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }
    }

    public double calcularPromedioSalario(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return 0;
        }

        double sumaSalarios = 0;

        for (Empleado e : empleados) {
            sumaSalarios += e.salario;
        }

        return sumaSalarios / empleados.size();
    }
}
