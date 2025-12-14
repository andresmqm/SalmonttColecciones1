package model;

public class UnidadOperativa implements Registrable {

    private String nombre;
    private String comuna;
    private String estado;


    public UnidadOperativa(String nombre, String comuna, String estado) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.estado = estado;
    }

    public String getTipo(){
        return "UnidadOperativa";

    }
    public String mostrarInformacion(){
        return  "Tipo: " + getTipo() + " - " +
                "Nombre: " + nombre + "-"+
                "Comuna: " + comuna + "-"+
                "Estado: " + estado;
    }

    @Override
    public String mostrarResumen() {
        return mostrarInformacion();
    }

}
