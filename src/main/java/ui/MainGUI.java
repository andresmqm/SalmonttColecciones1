package ui;

import data.GestorUnidades;
import model.*;

import javax.swing.JOptionPane;

public class MainGUI {

    public static void main(String[] args) {

        GestorUnidades gestor = new GestorUnidades();

        while (true) {

            String opcion = JOptionPane.showInputDialog(
                            "1. Agregar Centro de Cultivo\n" +
                            "2. Agregar Planta de Proceso\n" +
                            "3. Mostrar Unidades\n" +
                            "4. Salir"
            );

            if (opcion == null || opcion.equals("4")) break;

            switch (opcion) {
                case "1":
                    gestor.crearUnidades();
                    JOptionPane.showMessageDialog(null, "Centro agregado");
                    break;

                case "2":
                    gestor.crearUnidades();
                    JOptionPane.showMessageDialog(null, "Planta agregada");
                    break;

                case "3":
                    gestor.mostrarUnidades();
                    break;
            }
        }
    }
}

