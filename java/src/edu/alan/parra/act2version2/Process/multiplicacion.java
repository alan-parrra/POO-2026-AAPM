package edu.alan.parra.act2version2.Process;

public class multiplicacion {
    /**
     * Obtiene el producto de dos números enteros mediante la ejecución
     * de una secuencia de sumas repetitivas.
     * @param op1 factor que se va a sumar (multiplicando)
     * @param op2 cantidad de veces que se debe sumar el primer factor (multiplicador)
     * @return el resultado total de la operación aritmética
     */
    public static int realizarOperacion(int op1, int op2) {
        int resultado = 0;

        // El ciclo itera tantas veces como indique el multiplicador para acumular el valor
        for (int i = 0; i < op2; i++) {
            // Se invoca la lógica de adición para ir construyendo el producto final
            resultado = Suma.realizarOperacion(resultado, op1);
        }
        return resultado;
    }
}