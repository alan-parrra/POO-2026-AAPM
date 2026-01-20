package edu.alan.parra.act22.Process;
import edu.alan.parra.act22.Data.*;

public class Calculadora {
    public static double ejecutar(int opcion, double n1, double n2) {
        switch (opcion) {
            case 1: return Suma_Resta.Suma.realizarOperacion(n1, n2);
            case 2: return Suma_Resta.Resta.realizarOperacion(n1, n2);
            case 3: return Multiplicacion_Division.Multiplicacion.realizarOperacion(n1, n2);
            case 4: return Multiplicacion_Division.Division.realizarOperacion(n1, n2);
            case 5: return Multiplicacion_Division.Modulo.realizarOperacion(n1, n2);
            case 6: return Avanzadas.Potencia.realizarOperacion(n1, n2);
            case 7: return Avanzadas.Raiz.realizarOperacion(n1, n2);
            case 8: return Avanzadas.Logaritmo.realizarOperacion(n1, n2);
            default: return 0;
        }
    }
}