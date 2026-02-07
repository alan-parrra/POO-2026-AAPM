package edu.alan.parra.java.src.edu.alan.parra.calculadorav2.Process;

/** @author Alan Parra */
public class Division extends Resta {
    @Override
    public int operar(int dividendo, int divisor) {
        int cociente = 0;
        int acumulado = dividendo;
        while (acumulado >= divisor) {
            acumulado = super.operar(acumulado, divisor);
            cociente++;
        }
        return cociente;
    }
}