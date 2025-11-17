package data;

import model.Productos;
import model.CentroCultivo;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GestorDatos {


    public ArrayList<Productos> leerInventarioDesdeResources(String nombreRecurso) {
        ArrayList<Productos> lista = new ArrayList<>();

        try (InputStream is = getClass().getClassLoader().getResourceAsStream(nombreRecurso)) {

            if (is == null) {

                System.out.println("No se encontró recurso: " + nombreRecurso);
                return lista;
            }
            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

                String linea;

                while ((linea = br.readLine()) != null) {

                    if (linea.trim().isEmpty()) continue;
                    String[] p = linea.split(";");
                    if (p.length < 5) continue;

                    int id = Integer.parseInt(p[0].trim());
                    String nombre = p[1].trim();
                    String descripcion = p[2].trim();
                    int cantidad = Integer.parseInt(p[3].trim());
                    double precio = Double.parseDouble(p[4].trim());

                    lista.add(new Productos(id, nombre, descripcion, cantidad, precio));
                }
            }
        } catch (Exception e) {
            System.out.println("Error cargando inventario: " + e.getMessage());
        }
        return lista;
    }


    public ArrayList<CentroCultivo> leerCentrosComoLista(String nombreRecurso) {

        ArrayList<CentroCultivo> lista = new ArrayList<>();

        try (InputStream is = getClass().getClassLoader().getResourceAsStream(nombreRecurso)) {

            if (is == null) {
                System.out.println("No se encontró recurso: " + nombreRecurso);
                return lista;
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

                String linea;

                while ((linea = br.readLine()) != null) {
                    if (linea.trim().isEmpty()) continue;
                    String[] c = linea.split(";");
                    if (c.length < 4) continue;

                    String rut = c[0].trim();
                    String nombre = c[1].trim();
                    String region = c[2].trim();
                    int toneladas = Integer.parseInt(c[3].trim());

                    lista.add(new CentroCultivo(nombre, region, toneladas));
                }
            }


        } catch (Exception e) {
            System.out.println("Error cargando centros: " + e.getMessage());
        }

        return lista;
    }


    public HashMap<String, CentroCultivo> leerCentrosComoMapa(String nombreRecurso) {

        HashMap<String, CentroCultivo> mapa = new HashMap<>();

        try (InputStream is = getClass().getClassLoader().getResourceAsStream(nombreRecurso)) {

            if (is == null) {
                System.out.println("No se encontró recurso: " + nombreRecurso);
                return mapa;
            }

            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

                String linea;

                while ((linea = br.readLine()) != null) {
                    if (linea.trim().isEmpty()) continue;
                    String[] c = linea.split(";");
                    if (c.length < 4) continue;

                    String rut = c[0].trim();
                    String nombre = c[1].trim();
                    String region = c[2].trim();
                    int toneladas = Integer.parseInt(c[3].trim());

                    mapa.put(rut, new CentroCultivo(nombre, region, toneladas));
                }
            }


        } catch (Exception e) {
            System.out.println("Error cargando centros: " + e.getMessage());
        }

        return mapa;
    }
}
