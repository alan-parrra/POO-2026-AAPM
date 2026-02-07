package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.string;

public class N3_String_Palindromo {

    public boolean esPalindromo(String texto) {
        if (texto == null) {
            return false;
        }

        String textoInvertido = new StringBuilder(texto).reverse().toString();

        return texto.equals(textoInvertido);
    }
}