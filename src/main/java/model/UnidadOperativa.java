package model;

public class UnidadOperativa {

    private String nombre;
    private String comuna;
    private String estado;


    public UnidadOperativa(String nombre, String comuna, String estado) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ",  Comuna: " + comuna +
                ",  Estado: " + estado;
    }

}
