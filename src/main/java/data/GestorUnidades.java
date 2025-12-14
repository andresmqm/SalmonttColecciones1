package data;

import model.CentroCultivo2;
import model.PlantaProceso;
import model.Registrable;
import model.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;

public class GestorUnidades {

    private List <Registrable> listaUnidades;

    public GestorUnidades(){
        this.listaUnidades = new ArrayList<>();
    }
     public List <Registrable> crearUnidades() {

         listaUnidades.add (new CentroCultivo2(
                 "Granja Austral",
                 "Chiloe",
                 "En Mantencion",
                 "Estanque en Tierra",
                 "Ostra Chilena",
                 150
         ));

         listaUnidades.add (new CentroCultivo2(
                 "Centro Bahia Azul",
                 "Puerto Montt",
                 "Activa",
                 "Mar Abierto (Jaulas)",
                 "Salmon Atlantico",
                 3200
         ));

         listaUnidades.add (new CentroCultivo2(
                 "Modulos Sur",
                 "Coyhaique",
                 "Desactivada",
                 "Mar Abierto (Jaulas)",
                 "Salmon del Pacifico",
                 0
         ));

         listaUnidades.add (new PlantaProceso(
                 "Planta San Antonio",
                 "San Antonio",
                 "Activa",
                 1998,
                 "Envasado y Frigorifico",
                 50
         ));

         listaUnidades.add (new PlantaProceso(
                 "Quimica Biobio",
                 "Concepcion",
                 "Desactivada",
                 1982,
                 "Quimica (Produccion Lotes)",
                 10
         ));

         return listaUnidades;
     }

    public void mostrarUnidades() {

        for (Registrable r : listaUnidades) {

            if (r instanceof CentroCultivo2) {
                System.out.print("[Centro de Cultivo] ");
            } else if (r instanceof PlantaProceso) {
                System.out.print("[Planta de Proceso] ");
            }

            System.out.println(r.mostrarResumen());
        }
    }


}
