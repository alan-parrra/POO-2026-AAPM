package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado;

import java.util.List;

public class N6_Empleado_Edad_Comun {

    public static class Empleado {
        public String nombre;
        public int edad;

        public Empleado(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }

    public int encontrarEdadComun(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return 0;
        }

        int edadGanadora = 0;
        int maximoDeVeces = 0;

        for (int i = 0; i < empleados.size(); i++) {
            int edadActual = empleados.get(i).edad;
            int contador = 0;

            for (int j = 0; j < empleados.size(); j++) {
                if (empleados.get(j).edad == edadActual) {
                    contador++;
                }
            }

            if (contador > maximoDeVeces) {
                maximoDeVeces = contador;
                edadGanadora = edadActual;
            }
        }

        return edadGanadora;
    }
}