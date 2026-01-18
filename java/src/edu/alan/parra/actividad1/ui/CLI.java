package edu.alan.parra.actividad1.ui;

import edu.alan.parra.actividad1.Data.Catalogo;
import edu.alan.parra.actividad1.process.Vehiculos;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class CLI {

    public static void start() {
        Scanner sc = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();

        System.out.print("Nombre del cliente: ");
        String cliente = sc.nextLine();

        Vehiculos[] carrito = new Vehiculos[10];
        int contador = 0;
        double total = 0;
        boolean continuar = true;

        while (continuar) {
            catalogo.mostrarCatalogo();
            System.out.print("Elige un vehículo (número): ");
            int opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= catalogo.totalVehiculos()) {
                Vehiculos v = catalogo.getVehiculo(opcion - 1);
                carrito[contador] = v;
                contador++;
                total += v.getPrecio();
                System.out.println("Agregado: " + v.getDescripcion());
            } else {
                System.out.println("Opción inválida");
            }

            System.out.print("¿Agregar otro vehículo? (1 = Sí / 0 = No): ");
            continuar = sc.nextInt() == 1;
        }

        // ===== TICKET EN CONSOLA =====
        System.out.println("\n===== TICKET DE VENTA =====");
        System.out.println("Cliente: " + cliente);
        System.out.println("Fecha: " + LocalDate.now());
        System.out.println("Vehículos comprados:");

        for (int i = 0; i < contador; i++) {
            System.out.println("- " + carrito[i].getDescripcion());
        }

        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("===========================");

        // ===== GUARDAR TICKET =====
        try {
            FileWriter writer = new FileWriter("tickets.txt", true);
            writer.write("===== TICKET DE VENTA =====\n");
            writer.write("Cliente: " + cliente + "\n");
            writer.write("Fecha: " + LocalDate.now() + "\n");
            writer.write("Vehículos comprados:\n");

            for (int i = 0; i < contador; i++) {
                writer.write("- " + carrito[i].getDescripcion() + "\n");
            }

            writer.write("TOTAL A PAGAR: $" + total + "\n");
            writer.write("===========================\n\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al guardar el ticket");
        }
    }
}
