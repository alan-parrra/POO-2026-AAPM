package edu.alan.parra.java.src.edu.alan.parra.calculadorav2;

import edu.alan.parra.java.src.edu.alan.parra.calculadorav2.Ui.CLI;

/**
 * Clase principal para iniciar la calculadora.
 * @author Alan Parra
 */
public class Main {
    public static void main(String[] args) {
        CLI interfaz = new CLI();
        interfaz.showMenu();
    }
}