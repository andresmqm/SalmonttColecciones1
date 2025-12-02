package model;

public class CentroCultivo {

    private String rut;
    private String nombre;
    private String region;
    private int toneladas;


    public CentroCultivo(String rut, String nombre, String region, int toneladas) {
        this.rut=rut;
        this.nombre = nombre;
        this.region = region;
        this.toneladas = toneladas;
    }



    public int getToneladas() {
        return toneladas;
    }



    @Override
    public String toString() {
        return nombre + " (" + region + "), " + toneladas + " toneladas";
    }
}
