package edu.alan.parra.actividad1.process;

public abstract class Vehiculo {
    private String nombre;
    private double precio;

    public Vehiculo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract String getTipo();

    public String getDescripcion() {
        return nombre + " | Tipo: " + getTipo() + " | Precio: $" + precio;
    }

    public double getPrecio() {
        return precio;
    }
}

class Coche extends Vehiculo {
    public Coche(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String getTipo() {
        return "Coche";
    }
}
