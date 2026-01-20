package edu.alan.parra.act22.Data;

public class Avanzadas {
    public class Potencia {
        public static double realizarOperacion(double base, double exponente) {
            if (exponente == 0) return 1;
            double resultado = base;
            for (int i = 1; i < exponente; i++) {
                resultado = Multiplicacion_Division.Multiplicacion.realizarOperacion(resultado, base);
            }
            return resultado;
        }
    }

    public class Raiz {
        // Método de aproximación por fuerza bruta (solo enteros para este reto)
        public static double realizarOperacion(double indice, double radicando) {
            double x = 0;
            while (Potencia.realizarOperacion(x, indice) <= radicando) {
                x++;
            }
            return Suma_Resta.Resta.realizarOperacion(x, 1); // Retorna el entero más cercano hacia abajo
        }
    }

    public class Logaritmo {
        public static double realizarOperacion(double base, double argumento) {
            double count = 0;
            double valor = argumento;
            while (valor >= base) {
                valor = Multiplicacion_Division.Division.realizarOperacion(valor, base);
                count++;
            }
            return count;
        }
    }
}
