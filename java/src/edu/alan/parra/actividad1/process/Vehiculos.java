package edu.alan.parra.actividad1.process;

public class Vehiculos {

    private String nombre;
    private String tipo;
    private double precio;

    public Vehiculos(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getDescripcion() {
        return nombre + " | Tipo: " + tipo + " | Precio: $" + precio;
    }

    public double getPrecio() {
        return precio;
    }
}
