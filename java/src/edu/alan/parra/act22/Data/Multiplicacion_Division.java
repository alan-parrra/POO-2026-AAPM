package edu.alan.parra.act22.Data;

public class Multiplicacion_Division {
    public class Multiplicacion {
        public static double realizarOperacion(double a, double b) {
            double resultado = 0;
            for (int i = 0; i < Math.abs(b); i++) {
                resultado = Suma_Resta.Suma.realizarOperacion(resultado, a);
            }
            return (b < 0) ? -resultado : resultado;
        }
    }

    public class Division {
        public static double realizarOperacion(double a, double b) {
            if (b == 0) return 0; // Manejo básico de error
            double cociente = 0;
            double residuo = Math.abs(a);
            while (residuo >= Math.abs(b)) {
                residuo = Suma_Resta.Resta.realizarOperacion(residuo, Math.abs(b));
                cociente++;
            }
            return ((a < 0 ^ b < 0)) ? -cociente : cociente;
        }
    }

    public class Modulo {
        public static double realizarOperacion(double a, double b) {
            double residuo = Math.abs(a);
            while (residuo >= Math.abs(b)) {
                residuo = Suma_Resta.Resta.realizarOperacion(residuo, Math.abs(b));
            }
            return residuo;
        }
    }
}
