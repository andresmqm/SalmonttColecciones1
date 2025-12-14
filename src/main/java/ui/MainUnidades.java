package ui;

import data.GestorUnidades;
import model.UnidadOperativa;

import java.util.List;

public class MainUnidades {
    public static void main(String[] args) {


        GestorUnidades gestor = new GestorUnidades();
        gestor.crearUnidades();

        System.out.println("Listado de Unidades:");
        gestor.mostrarUnidades();
    }
}
