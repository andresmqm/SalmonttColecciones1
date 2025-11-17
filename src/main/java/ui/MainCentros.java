package ui;

import model.CentroCultivo;
import data.GestorDatos;

import java.util.HashMap;

public class MainCentros {
    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        HashMap<String, CentroCultivo> centros = gestor.leerCentros("Centros.txt");

        System.out.println(" Cargar Centros");
        for (String rut : centros.keySet()) {
            System.out.println(rut + " -> " + centros.get(rut));
        }


        System.out.println("\n Centros Superiores a los 1000 toneladas.");
        for (CentroCultivo c : centros.values()) {
            if (c.getToneladas() > 1000) {
                System.out.println(c);
            }
        }
    }
}
