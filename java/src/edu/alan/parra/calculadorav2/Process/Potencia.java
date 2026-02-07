package edu.alan.parra.java.src.edu.alan.parra.calculadorav2.Process;

/**
 * La clase Potencia permite calcular el resultado de elevar una base
 * a un exponente utilizando multiplicaciones sucesivas.
 * Hereda de la clase multiplicacion.
 * @author Alan Parra
 */
public class Potencia extends multiplicacion {

    /**
     * Calcula la potencia de un número entero.
     * @param base El número que será multiplicado por sí mismo.
     * @param exp El exponente que define cuántas veces se multiplica la base.
     * @return El resultado de elevar la base al exponente. Retorna 1 si el exponente es 0.
     */
    @Override
    public int operar(int base, int exp) {
        if (exp == 0) return 1;

        int resultado = 1;
        for (int i = 0; i < exp; i++) {
            resultado = super.operar(resultado, base);
        }

        return resultado;
    }
}