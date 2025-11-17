package Libreria;
import model.Productos;
import model.CentroCultivo;

import java.util.List;

public class Estadisticas {


    public static double valorTotalInventario(List<Productos> lista) {
        double total = 0;
        for (Productos p : lista) {
            total += p.getPrecio() * p.getCantidad();
        }
        return total;
    }

    public static int produccionTotalCentros(List<CentroCultivo> lista) {
        int total = 0;
        for (CentroCultivo c : lista) {
            total += c.getToneladas();
        }
        return total;
    }
}
