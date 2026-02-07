package edu.alan.parra.java.src.edu.alan.parra.calculadorav2.Process;

/**
 * La clase Raiz permite calcular la raíz n-ésima entera de un número
 * comparando potencias sucesivas con el radicando dado.
 * Hereda de la clase Potencia.
 * @author Alan Parra
 */
public class Raiz extends Potencia {

    /**
     * Calcula la raíz entera de un número dado su índice.
     * @param indice El grado de la raíz (ej. 2 para raíz cuadrada).
     * @param radicando El número al cual se le extraerá la raíz.
     * @return La raíz entera resultante o el entero más cercano hacia abajo.
     */
    @Override
    public int operar(int indice, int radicando) {
        int i = 1;
        while (true) {
            int pot = super.operar(i, indice);

            if (pot == radicando) return i;
            if (pot > radicando) return i - 1;
            i++;
        }
    }
}