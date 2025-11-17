package model;

public class CentroCultivo {

    private String nombre;
    private String region;
    private int toneladas;

    public CentroCultivo(String nombre, String region, int toneladas) {
        this.nombre = nombre;
        this.region = region;
        this.toneladas = toneladas;
    }

    public int getToneladas() {
        return toneladas;
    }

    @Override
    public String toString() {
        return "CentroCultivo{" +
                "nombre='" + nombre + '\'' +
                ", region='" + region + '\'' +
                ", toneladas=" + toneladas +
                '}';
    }
}
