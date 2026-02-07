package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.string;

public class N12_String_Cadena_Invertida {

    public String invertirCadena(String texto) {
        if (texto == null) {
            return null;
        }

        StringBuilder resultado = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado.append(texto.charAt(i));
        }

        return resultado.toString();
    }
}