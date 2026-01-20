package edu.alan.parra.act2version2.Process;

public class Potencia {
    /**
     * Resuelve la elevación de una cifra a una potencia determinada
     * empleando productos reiterados del mismo valor.
     * @param op1 número que se desea elevar (base)
     * @param op2 grado de elevación (exponente)
     * @return el valor final tras aplicar la potenciación
     */
    public static int realizarOperacion(int op1, int op2) {
        if (op2 == 0) return 1; // Caso base: cualquier valor con exponente nulo resulta en la unidad

        int resultado = 1;
        // Se ejecuta un ciclo para multiplicar la base por sí misma según el exponente indicado
        for (int i = 0; i < op2; i++) {
            resultado = multiplicacion.realizarOperacion(resultado, op1);
        }
        return resultado;
    }
}