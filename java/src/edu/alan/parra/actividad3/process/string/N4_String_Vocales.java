package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.string;

public class N4_String_Vocales {

    public int contarVocales(String texto) {
        if (texto == null) {
            return 0;
        }

        int contador = 0;
        String textoMin = texto.toLowerCase();

        for (int i = 0; i < textoMin.length(); i++) {
            char letra = textoMin.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }
}