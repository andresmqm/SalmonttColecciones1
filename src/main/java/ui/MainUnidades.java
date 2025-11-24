package ui;

import data.GestorUnidades;
import model.UnidadOperativa;

import java.util.List;

public class MainUnidades {
    public static void main(String[] args) {


        GestorUnidades gestor = new GestorUnidades();

                List<UnidadOperativa> unidades = gestor.crearUnidades();

        System.out.println("Listados de Unidades: ");

        for (UnidadOperativa u : unidades) {
            System.out.println(u.toString());
        }
    }

    }
