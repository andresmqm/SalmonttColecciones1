package ui;

import model.CentroCultivo;
import model.Productos;
import data.GestorDatos;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();


        ArrayList<Productos> inventario =
                gestor.leerInventarioDesdeResources("Inventario.txt");

        System.out.println("=== Inventario cargado desde archivo ===");
        inventario.forEach(System.out::println);



        HashMap<String, CentroCultivo> centros =
                gestor.leerCentrosComoMapa("Centros.txt");

        System.out.println("\n=== Centros de cultivo cargados ===");
        centros.forEach((rut, centro) ->
                System.out.println(rut + ": " + centro));


        CentroCultivo encontrado = centros.get("20.963.753-2");

        System.out.println("\nResultado de búsqueda:");
        System.out.println(encontrado != null ?
                "Encontrado: " + encontrado :
                "Centro no encontrado");
    }
}

