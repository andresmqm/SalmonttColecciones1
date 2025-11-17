package Validaciones;

import model.Productos;
import java.util.List;

public class ValidadorProducto {

    public static boolean validarCantidad(int cantidad) {
        return cantidad >= 0;
    }

    public static boolean validarPrecio(double precio) {
        return precio > 0;
    }

    public static boolean existeProducto(List<Productos> lista, int id) {
        return lista.stream().anyMatch(p -> p.getId() == id);
    }
}


