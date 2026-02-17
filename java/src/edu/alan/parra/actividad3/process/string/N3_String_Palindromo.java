package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.string;

/**
* checa si una cadena de texto es palindromo y
* determina si el texto se lee igual de izquierda a derecha y viceversa
* dando false o true dependiendo la palabra
    */

public class N3_String_Palindromo {

    public boolean esPalindromo(String texto) {
        if (texto == null) {
            return false;
        }

        String textoInvertido = new StringBuilder(texto).reverse().toString();

        return texto.equals(textoInvertido);
    }
}
