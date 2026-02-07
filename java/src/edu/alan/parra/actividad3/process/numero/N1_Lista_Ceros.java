package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.numero;

public class N1_Lista_Ceros {

    public int[] moverceros(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return numeros;
        }
        int posicion = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                numeros[posicion] = numeros[i];
                posicion++;
            }
        }
        while (posicion < numeros.length) {
            numeros[posicion] = 0;
            posicion++;
        }
        return numeros;
    }
    public int contarpares(int[] numeros) {
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

