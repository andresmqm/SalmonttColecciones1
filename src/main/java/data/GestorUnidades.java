package data;

import model.CentroCultivo2;
import model.PlantaProceso;
import model.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;

public class GestorUnidades {

    private List <UnidadOperativa> listaUnidades;

    public GestorUnidades(){
        this.listaUnidades = new ArrayList<>();
    }
     public List <UnidadOperativa> crearUnidades() {

         CentroCultivo2 cc1 = new CentroCultivo2(
                 "Granja Austral",
                 "Chiloe",
                 "En Mantencion",
                 "Estanque en Tierra",
                 "Ostra Chilena",
                 150
         );

         CentroCultivo2 cc2 = new CentroCultivo2(
                 "Centro Bahia Azul",
                 "Puerto Montt",
                 "Activa",
                 "Mar Abierto (Jaulas)",
                 "Salmon Atlantico",
                 3200
         );

         CentroCultivo2 cc3 = new CentroCultivo2(
                 "Modulos Sur",
                 "Coyhaique",
                 "Desactivada",
                 "Mar Abierto (Jaulas)",
                 "Salmon del Pacifico",
                 0
         );

         PlantaProceso pl1 = new PlantaProceso(
                 "Planta San Antonio",
                 "San Antonio",
                 "Activa",
                 1998,
                 "Envasado y Frigorifico",
                 50
         );

         PlantaProceso pl2 = new PlantaProceso(
                 "Quimica Biobio",
                 "Concepcion",
                 "Desactivada",
                 1982,
                 "Quimica (Produccion Lotes)",
                 10
         );

         listaUnidades.add(cc1);
         listaUnidades.add(cc2);
         listaUnidades.add(cc3);
         listaUnidades.add(pl1);
         listaUnidades.add(pl2);

         return listaUnidades;
     }


}
