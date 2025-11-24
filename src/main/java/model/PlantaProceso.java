package model;

public class PlantaProceso extends UnidadOperativa{

    private int yearConstruccion;
    private String tipo;
    private int capacidadProceso;


    public PlantaProceso(String nombre, String comuna, String estado, int yearConstruccion, String tipo, int capacidadProceso) {
        super(nombre, comuna, estado);
        this.yearConstruccion = yearConstruccion;
        this.tipo = tipo;
        this.capacidadProceso = capacidadProceso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "   Año Construcción: " + yearConstruccion +
                "   Tipo: " + tipo +
                "   Capacidad: " + capacidadProceso;
    }
}
