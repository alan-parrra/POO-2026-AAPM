package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado;

import java.util.List;

public class N9_Empleado_Promedio_Edad_25K {

    public static class Empleado {
        public String nombre;
        public int edad;
        public double salario;

        public Empleado(String nombre, int edad, double salario) {
            this.nombre = nombre;
            this.edad = edad;
            this.salario = salario;
        }
    }

    public double calcularPromedioEdadAltosIngresos(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return 0;
        }

        double sumaEdades = 0;
        int contador = 0;

        for (Empleado e : empleados) {
            if (e.salario > 25000) {
                sumaEdades += e.edad;
                contador++;
            }
        }

        if (contador == 0) {
            return 0;
        }

        return sumaEdades / contador;
    }
}