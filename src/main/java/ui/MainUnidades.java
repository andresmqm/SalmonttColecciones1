package ui;

import data.GestorUnidades;

public class MainUnidades {
    public static void main(String[] args) {


        GestorUnidades gestor = new GestorUnidades();
        gestor.crearUnidades();

        System.out.println("Listado de Unidades:");
        gestor.mostrarUnidades();
    }
}
