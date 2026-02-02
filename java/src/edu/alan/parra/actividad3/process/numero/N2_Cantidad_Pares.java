package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.numero;

/** 
* este analiza los datos
* y luego checa y cuenta cuantos son pares
    */

public class N2_Cantidad_Pares {

    public int contarPares(int[] numeros) {
        if (numeros == null) {
            return 0;
        }

        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}
