package edu.alan.parra.java.src.edu.alan.parra.calculadorav2.Process;

/**
 * Calcula el residuo de una división usando restas sucesivas.
 /** @author Alan Parra */
public class Modulo extends Resta {
    @Override
    public int operar(int dividendo, int divisor) {
        int residuo = dividendo;
        while (residuo >= divisor) {
            residuo = super.operar(residuo, divisor);
        }
        return residuo;
    }
}