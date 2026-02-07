package edu.alan.parra.java.src.edu.alan.parra.calculadorav2.Process;

/**
 * La clase Resta implementa la operación básica de sustracción.
 * Sirve como base para las operaciones de División, Módulo y Raíz.
 * * @author Alan Parra
 */
public class Resta extends Operacion {

    /**
     * Realiza la resta entre dos números enteros.
     * * @param op1 El número minuendo.
     * @param op2 El número sustraendo.
     * @return El resultado de la sustracción (op1 - op2).
     */
    @Override
    public int operar(int op1, int op2) {
        return op1 - op2;
    }
}