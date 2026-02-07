package edu.alan.parra.java.src.edu.alan.parra.calculadorav2.Process;

/**
 * Realiza la multiplicación mediante sumas sucesivas.
 * @author Alan Parra
 */
public class multiplicacion extends Suma {
    @Override
    public int operar(int op1, int op2) {
        int resultado = 0;
        for (int i = 0; i < op2; i++) {
            resultado = super.operar(resultado, op1);
        }
        return resultado;
    }
}