package edu.alan.parra.java.src.edu.alan.parra.calculadorav2.Process;

/**
 * La clase Suma implementa la operación básica de adición.
 * Esta clase es fundamental, ya que es la base para la operación de multiplicación.
 * * @author Alan Parra
 */
public class Suma extends Operacion {

    /**
     * Realiza la suma de dos números enteros.
     * * @param op1 El primer sumando.
     * @param op2 El segundo sumando.
     * @return El resultado total de la adición.
     */
    @Override
    public int operar(int op1, int op2) {
        return op1 + op2;
    }
}