package edu.alan.parra.java.src.edu.alan.parra.calculadorav2.Process;

/**
 * La clase Logaritmo calcula el exponente al que se debe elevar una base
 * para obtener un argumento dado, mediante divisiones sucesivas.
 * Hereda de la clase Division.
 * @author Alan Parra
 */
public class Logaritmo extends Division {

    /**
     * Calcula el logaritmo entero de un argumento en una base específica.
     * @param base La base del logaritmo (debe ser mayor a 1).
     * @param argumento El número al que se le calculará el logaritmo.
     * @return El logaritmo resultante. Retorna 0 si la base es menor o igual a 1.
     */
    @Override
    public int operar(int base, int argumento) {
        if (base <= 1) return 0;

        int contador = 0;
        int actual = argumento;

        while (actual >= base) {
            actual = super.operar(actual, base);
            contador++;
        }

        return contador;
    }
}