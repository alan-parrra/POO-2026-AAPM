package edu.alan.parra.actividad1.ui;

import edu.alan.parra.actividad1.process.Switch;

public class CLI {

    public static void start() {

        Switch switch_wifi = new Switch();

        System.out.println("El switch está apagado");
        System.out.println("El switch está: " + switch_wifi.isOn());

        if (switch_wifi.isOn()) {
            System.out.println("¿Desea apagar el switch?");
        } else {
            System.out.println("¿Lo deseas encender bro?");
        }

        System.out.println("El switch está: " + switch_wifi.isOn());
    }
}
