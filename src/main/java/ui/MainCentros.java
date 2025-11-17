package ui;

import model.CentroCultivo;
import data.GestorDatos;

import java.util.HashMap;

public class MainCentros {
    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        HashMap<String, CentroCultivo> centros =
                gestor.leerCentrosComoMapa("Centros.txt");

        centros.forEach((rut, c) -> System.out.println(rut + " -> " + c));

        System.out.println("\n=== Centros con toneladas > 1000 ===");
        centros.forEach((rut, c) -> {
            if (c.getToneladas() > 1000)
                System.out.println(c);
        });
    }
}

