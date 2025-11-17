package ui;

import model.Productos;
import data.GestorDatos;
import Libreria.Buscador;
import Libreria.Estadisticas;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();


        List<Productos> inventario = gestor.leerInventario("Inventario.txt");


        System.out.println(" Inventario ");
        inventario.forEach(System.out::println);


        System.out.println("\n Producto  de Salmon sin Piel ");
        Productos encontrado = Buscador.buscarProductoPorId(inventario, 3);
        System.out.println(encontrado);


        double total = Estadisticas.valorTotalInventario(inventario);
        System.out.println("\n Valor total del inventario: " + total);
    }
}

