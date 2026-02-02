package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.empleado;

/**
* aqui checa que empleado 
* mayor de 30 años  tiene
* el mayor salario
    */

import java.util.List;

public class N14_Empleado_Mayor_Salario_30Años {

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

    public Empleado encontrarMejorPagadoMayor30(List<Empleado> empleados) {
        if (empleados == null || empleados.isEmpty()) {
            return null;
        }

        Empleado candidatoGanador = null;

        for (Empleado e : empleados) {
            if (e.edad > 30) {

                if (candidatoGanador == null || e.salario > candidatoGanador.salario) {
                    candidatoGanador = e;
                }
            }
        }

        return candidatoGanador;
    }
}
