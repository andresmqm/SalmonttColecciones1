package model;

public class CentroCultivo2 extends UnidadOperativa {

    private String tipoAmbiente;
    private String especieCultivada;
    private int toneladasProduccion;

    public CentroCultivo2(String nombre, String comuna, String estado, String tipoAmbiente, String especieCultivada, int toneladasProduccion) {
        super(nombre, comuna, estado);
        this.tipoAmbiente = tipoAmbiente;
        this.especieCultivada = especieCultivada;
        this.toneladasProduccion = toneladasProduccion;
    }

    @Override
    public String getTipo(){
        return " Centro de Cultivo ";
    }

    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() + "-" +
                "Tipo De Ambiente: " + tipoAmbiente + "-" +
                "Especie Cultivada: " + especieCultivada + "-" +
                "Produccion (Toneladas): " + toneladasProduccion;
    }

}
