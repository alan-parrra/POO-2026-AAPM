package edu.alan.parra.actividad1.Data;

import edu.alan.parra.actividad1.process.Vehiculos;

public class Catalogo {

    private Vehiculos[] vehiculos;

    public Catalogo() {
        vehiculos = new Vehiculos[3];
        vehiculos[0] = new Vehiculos("Dodge Stratus", "Sedán", 990000);
        vehiculos[1] = new Vehiculos("Nissan Versa", "Sedán", 150000);
        vehiculos[2] = new Vehiculos("Volkswagen Jetta", "Sedán", 200000);
    }

    public void mostrarCatalogo() {
        System.out.println("=== VEHÍCULOS EN EXHIBICIÓN ===");
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println((i + 1) + ". " + vehiculos[i].getDescripcion());
        }
    }

    public Vehiculos getVehiculo(int index) {
        return vehiculos[index];
    }

    public int totalVehiculos() {
        return vehiculos.length;
    }
}

