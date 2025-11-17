package data;

import model.Productos;
import model.CentroCultivo;

import Validaciones.ValidadorProducto;
import Validaciones.ValidadorRut;

import java.io.*;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GestorDatos {


    //validacion  de inventario


    public ArrayList<Productos> leerInventario(String archivo) {
        ArrayList<Productos> lista = new ArrayList<>();

        try (InputStream is = getClass().getClassLoader().getResourceAsStream(archivo)) {

            if (is == null) {
                System.out.println("Archivo no encontrado: " + archivo);
                return lista;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String linea;
            while ((linea = br.readLine()) != null) {

                if (linea.trim().isEmpty()) continue;

                try {
                    String[] p = linea.split(";");

                    int id = Integer.parseInt(p[0].trim());
                    String nombre = p[1].trim();
                    String descripcion = p[2].trim();
                    int cantidad = Integer.parseInt(p[3].trim());
                    double precio = Double.parseDouble(p[4].trim());


                    // validacion de productos

                    if (!ValidadorProducto.validarCantidad(cantidad)) {
                        System.out.println("Cantidad invalida para ID: " + id);
                        continue;
                    }

                    if (!ValidadorProducto.validarPrecio(precio)) {
                        System.out.println("Precio invalido para ID: " + id);
                        continue;
                    }

                    if (ValidadorProducto.existeProducto(lista, id)) {
                        System.out.println("Producto duplicado (ID: " + id + "), se omite.");
                        continue;
                    }

                    lista.add(new Productos(id, nombre, descripcion, cantidad, precio));

                } catch (Exception e) {
                    System.out.println("Error en linea inventario: " + linea);
                }
            }

        } catch (Exception e) {
            System.out.println("Error leyendo inventario: " + e.getMessage());
        }

        return lista;
    }



    public HashMap<String, CentroCultivo> leerCentros(String archivo) {

        HashMap<String, CentroCultivo> mapa = new HashMap<>();

        try (InputStream is = getClass().getClassLoader().getResourceAsStream(archivo)) {

            if (is == null) {
                System.out.println("Archivo no encontrado: " + archivo);
                return mapa;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String linea;
            while ((linea = br.readLine()) != null) {

                if (linea.trim().isEmpty()) continue;

                try {
                    String[] c = linea.split(";");
                    String rut = c[0].trim();
                    String nombre = c[1].trim();
                    String region = c[2].trim();
                    int toneladas = Integer.parseInt(c[3].trim());


                    if (!ValidadorRut.validarRut(rut)) {
                        System.out.println("Rut invalido → " + rut + " (linea omitida)");
                        continue;
                    }

                    mapa.put(rut, new CentroCultivo(rut, nombre, region, toneladas));

                } catch (Exception e) {
                    System.out.println("Error en linea centro: " + linea);
                }
            }

        } catch (Exception e) {
            System.out.println("Error leyendo centros: " + e.getMessage());
        }

        return mapa;
    }
}
