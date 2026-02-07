package edu.alan.parra.java.src.edu.alan.parra.calculadorav2.Ui;

import edu.alan.parra.java.src.edu.alan.parra.calculadorav2.Process.*;
import java.util.Scanner;

/**
 * Interfaz de Línea de Comandos para la calculadora.
 * @author Alan Parra
 */
public class CLI {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        Operacion operacion = null;

        System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Modulo\n6. Potencia\n7. Raiz\n8. Logaritmo");
        System.out.println("Elige una opción:");
        int opcion = scanner.nextInt();

        switch(opcion) {
            case 1: operacion = new Suma(); break;
            case 2: operacion = new Resta(); break;
            case 3: operacion = new multiplicacion(); break;
            case 4: operacion = new Division(); break;
            case 5: operacion = new Modulo(); break;
            case 6: operacion = new Potencia(); break;
            case 7: operacion = new Raiz(); break;
            case 8: operacion = new Logaritmo(); break;
            default: System.out.println("Opción no válida"); return;
        }

        System.out.println("Ingresa operando 1:");
        int op1 = scanner.nextInt();
        System.out.println("Ingresa operando 2:");
        int op2 = scanner.nextInt();

        System.out.println("Resultado: " + operacion.operar(op1, op2));
    }
}