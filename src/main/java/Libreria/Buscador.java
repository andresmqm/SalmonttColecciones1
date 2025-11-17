package Libreria;

import model.Productos;
import model.CentroCultivo;
import java.util.List;
import java.util.Map;

public class Buscador {

    public static Productos buscarProductoPorId(List<Productos> lista, int id) {
        for (Productos p : lista) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public static CentroCultivo buscarCentroPorRut(Map<String, CentroCultivo> mapa, String rut) {
        if (mapa.containsKey(rut)) {
            return mapa.get(rut);
        }
        return null;
    }
}
