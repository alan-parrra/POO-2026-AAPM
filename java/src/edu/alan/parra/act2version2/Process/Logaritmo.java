package edu.alan.parra.act2version2.Process;

public class Logaritmo {
    /**
     * Obtiene la aproximación entera del logaritmo mediante el cálculo de potencias sucesivas.
     * @param op1 número que actúa como base logarítmica
     * @param op2 valor de referencia o argumento del cual se busca el exponente
     * @return la potencia entera (piso) que satisface la relación logarítmica
     */
    public static int realizarOperacion(int op1, int op2) {
        int exponente = 0;
        int valorActual = 1;

        // Se incrementa el exponente mientras el producto acumulado sea inferior al objetivo
        while (valorActual < op2) {
            valorActual = multiplicacion.realizarOperacion(valorActual, op1);
            exponente++;
        }

        // Validación final: si el acumulado excede el argumento, se ajusta al entero más cercano por debajo
        if (valorActual > op2) {
            // Se resta una unidad al contador para obtener el logaritmo truncado
            return exponente - 1;
        }
        return exponente;
    }
}