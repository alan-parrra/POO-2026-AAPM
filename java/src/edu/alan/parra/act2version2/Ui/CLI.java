package edu.alan.parra.act2version2.Ui;
import edu.alan.parra.act2version2.Process.*;
import java.util.Scanner;

public class CLI {

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        // Interfaz visual del menú principal
        System.out.println("--- Panel de Operaciones ---");
        System.out.println("1. Adición");
        System.out.println("2. Sustracción");
        System.out.println("3. Producto");
        System.out.println("4. Cociente");
        System.out.println("5. Residuo (Módulo)");
        System.out.println("6. Exponenciación");
        System.out.println("7. Radicación");
        System.out.println("8. Logaritmo");
        System.out.println("9. Finalizar programa");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();

        // Variables de entrada (podrías optimizar usando solo dos variables para todo)
        int op1, op2;

        switch(opcion){
            case 1:
                System.out.println("Ingrese el primer sumando:");
                op1 = scanner.nextInt();
                System.out.println("Ingrese el segundo sumando:");
                op2 = scanner.nextInt();
                System.out.printf("La suma de %d y %d resulta en: %d%n", op1, op2, Suma.realizarOperacion(op1, op2));
                break;

            case 2:
                System.out.println("Escriba el valor del minuendo:");
                op1 = scanner.nextInt();
                System.out.println("Escriba el valor del sustraendo:");
                op2 = scanner.nextInt();
                System.out.printf("La diferencia entre %d y %d es: %d%n", op1, op2, Resta.realizarOperacion(op1, op2));
                break;

            case 3:
                System.out.println("Defina el multiplicando:");
                op1 = scanner.nextInt();
                System.out.println("Defina el multiplicador:");
                op2 = scanner.nextInt();
                System.out.printf("El producto total es: %d%n", multiplicacion.realizarOperacion(op1, op2));
                break;

            case 4:
                System.out.println("Indique el dividendo:");
                op1 = scanner.nextInt();
                System.out.println("Indique el divisor:");
                op2 = scanner.nextInt();
                if (op2 == 0) {
                    System.out.println("Error: No es posible realizar una división por cero.");
                } else {
                    System.out.printf("El cociente obtenido es: %d%n", Division.realizarOperacion(op1, op2));
                }
                break;

            case 5:
                System.out.println("Indique el dividendo:");
                op1 = scanner.nextInt();
                System.out.println("Indique el divisor:");
                op2 = scanner.nextInt();
                System.out.printf("El sobrante de la operación es: %d%n", Modulo.realizarOperacion(op1, op2));
                break;

            case 6:
                System.out.println("Establezca la base:");
                op1 = scanner.nextInt();
                System.out.println("Establezca el exponente:");
                op2 = scanner.nextInt();
                System.out.printf("El resultado de la potencia es: %d%n", Potencia.realizarOperacion(op1, op2));
                break;

            case 7:
                System.out.println("Indique el grado de la raíz (índice):");
                op1 = scanner.nextInt();
                System.out.println("Ingrese el radicando:");
                op2 = scanner.nextInt();
                System.out.printf("La raíz calculada es: %d%n", Raiz.realizarOperacion(op1, op2));
                break;

            case 8:
                System.out.println("Ingrese la base logarítmica:");
                op1 = scanner.nextInt();
                System.out.println("Ingrese el argumento:");
                op2 = scanner.nextInt();
                System.out.printf("El exponente (logaritmo) es: %d%n", Logaritmo.realizarOperacion(op1, op2));
                break;

            case 9:
                System.out.println("Saliendo del sistema. ¡Hasta luego!");
                break;

            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                break;
        }
    }
}