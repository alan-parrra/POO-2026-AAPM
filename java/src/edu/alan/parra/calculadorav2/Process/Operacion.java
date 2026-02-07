package edu.alan.parra.java.src.edu.alan.parra.calculadorav2.Process;

/**
 * Clase abstracta que sirve como base para todas las operaciones aritméticas.
 * @author Alan Parra
 */
public abstract class Operacion {
    /**
     * Método abstracto para realizar un cálculo entre dos números.
     * @param op1 Primer operando.
     * @param op2 Segundo operando.
     * @return El resultado de la operación.
     */
    public abstract int operar(int op1, int op2);
}