package edu.alan.parra.act2version2.Process;

public class Division {
    /**
     * Esta función toma un par de valores numéricos y calcula su cociente
     * mediante la sustracción sucesiva del divisor sobre el dividendo.
     * @param op1 cifra inicial (dividendo)
     * @param op2 cifra a restar (divisor)
     * @return la cantidad de veces que el divisor cabe en el dividendo
     */
    public static int realizarOperacion(int op1, int op2) {
        int cociente = 0;
        int acumulado = op1;

        // El ciclo continúa mientras el valor restante no sea menor al divisor
        while (acumulado >= op2) {
            acumulado = Resta.realizarOperacion(acumulado, op2);
            cociente++; // Se suma una unidad al contador por cada resta exitosa
        }
        return cociente;
    }
}