package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado;

/**
* este saca el promedio
* con la edad de todos los empleados
*/

import java.util.List;

public class N7_Empleado_Edad_Promedio {

    public static class Empleado {
        public String nombre;
        public int edad;

        public Empleado(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }

    public double calcularPromedioEdad(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return 0;
        }

        double sumaEdades = 0;

        for (Empleado e : empleados) {
            sumaEdades += e.edad;
        }

        return sumaEdades / empleados.size();
    }
}
