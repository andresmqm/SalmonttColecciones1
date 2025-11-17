package Validaciones;

public class ValidadorRut {

    public static boolean validarRut(String rut) {

        if (rut == null || rut.isBlank()) return false;


        rut = rut.replace(".", "").toUpperCase();


        return rut.matches("\\d{7,8}-[0-9K]");
    }
}


