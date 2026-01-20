package edu.alan.parra.act22.Ui;

import java.util.Scanner;
import edu.alan.parra.act22.Process.Calculadora;

public class Cli {
    private static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("--- CALCULADORA ARITMÉTICA ---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo (Residuo)");
        System.out.println("6. Potencia");
        System.out.println("7. Raíz (Entera)");
        System.out.println("8. Logaritmo (Entero)");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void launchApp() {
        int opcion;
        do {
            showMenu();
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 8) {
                System.out.print("Ingrese el primer valor (operando/base): ");
                double n1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo valor (operando/exponente): ");
                double n2 = scanner.nextDouble();

                double resultado = Calculadora.ejecutar(opcion, n1, n2);
                System.out.println("\n> El resultado es: " + resultado + "\n");
            } else if (opcion != 0) {
                System.out.println("\n[!] Opción no válida.\n");
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }
}