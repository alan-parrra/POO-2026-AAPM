package edu.alan.parra.act2version2.Process;

public class Raiz {
    /**
     * Determina el valor de la raíz entera mediante una búsqueda incremental
     * hasta encontrar el número que más se aproxime al objetivo.
     * @param op1 grado de la raíz (por ejemplo, 2 si es una raíz cuadrada)
     * @param op2 cifra de la cual se desea extraer la raíz (radicando)
     * @return el número entero que representa la raíz (redondeado hacia abajo si es necesario)
     */
    public static int realizarOperacion(int op1, int op2) {
        int i = 1;
        // Se evalúan valores naturales en orden ascendente, elevándolos a la potencia indicada
        // hasta que el resultado iguale o exceda al radicando
        while (true) {
            int potencia = Potencia.realizarOperacion(i, op1);
            if (potencia == op2) {
                return i; // Se localizó la raíz de forma precisa
            } else if (potencia > op2) {
                // En caso de superar el valor, se retorna el entero previo para truncar el resultado
                return i - 1;
            }
            i++;
        }
    }
}