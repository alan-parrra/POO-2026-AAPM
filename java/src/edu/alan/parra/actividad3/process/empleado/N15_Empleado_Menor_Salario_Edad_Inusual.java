package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado;

import java.util.List;

public class N15_Empleado_Menor_Salario_Edad_Inusual {

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

    public Empleado encontrarEspecial(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        int minFrecuencia = Integer.MAX_VALUE;

        for (Empleado e : empleados) {
            int frecuenciaActual = contarRepeticionesEdad(empleados, e.edad);
            if (frecuenciaActual < minFrecuencia) {
                minFrecuencia = frecuenciaActual;
            }
        }

        Empleado ganador = null;

        for (Empleado e : empleados) {
            int frecuenciaDeEste = contarRepeticionesEdad(empleados, e.edad);

            if (frecuenciaDeEste == minFrecuencia) {

                if (ganador == null || e.salario < ganador.salario) {
                    ganador = e;
                }
            }
        }

        return ganador;
    }

    private int contarRepeticionesEdad(List<Empleado> lista, int edadBuscada) {
        int contador = 0;
        for (Empleado e : lista) {
            if (e.edad == edadBuscada) {
                contador++;
            }
        }
        return contador;
    }
}