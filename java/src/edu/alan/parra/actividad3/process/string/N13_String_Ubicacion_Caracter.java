package edu.alan.parra.java.src.edu.alan.parra.actividad3.process.string;

/**
* busca la posicion de un caracter de texto y luego
* si no lo encuentra lo devuelve
    */

public class N13_String_Ubicacion_Caracter {

    public int obtenerUbicacion(String texto, char caracterBuscado) {
        if (texto == null) {
            return -1;
        }

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracterBuscado) {
                return i;
            }
        }

        return -1;
    }
}
