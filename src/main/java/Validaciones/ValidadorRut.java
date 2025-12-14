package Validaciones;

import Excepciones.RutInvalido;

public class ValidadorRut {

    public static void validarRut(String rut) throws RutInvalido {

        if (rut == null || rut.isBlank()) {
            throw new RutInvalido("El RUT no puede estar vacío");
        }

        rut = rut.replace(".", "").toUpperCase();

        if (!rut.matches("\\d{7,8}-[0-9K]")) {
            throw new RutInvalido("Formato de RUT inválido");
        }
    }
}



