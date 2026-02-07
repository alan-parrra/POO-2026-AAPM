package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado;

import java.util.List;

public class N11_Empleado_Departamento_Sistemas {

    public static class Empleado {
        public String nombre;
        public String departamento;

        public Empleado(String nombre, String departamento) {
            this.nombre = nombre;
            this.departamento = departamento;
        }
    }

    public int contarEmpleadosSistemas(List<Empleado> empleados) {
        if (empleados == null) {
            return 0;
        }

        int contador = 0;

        for (Empleado e : empleados) {
            if (e.departamento != null && e.departamento.equalsIgnoreCase("Sistemas")) {
                contador++;
            }
        }

        return contador;
    }
}