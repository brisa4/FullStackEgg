package EjercicioExtra3.servicio;

import EjercicioExtra3.entidad.Camping;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CampingServicio {
  private List<Camping> campings = new ArrayList<>();

    public List<Camping> obtenerTodos() {
        return campings;
    }

    public void agregarCamping(Camping camping) {
        campings.add(camping);
    }

    public List<Camping> obtenerCampingsConRestaurante() {
        return campings.stream()
                .filter(Camping::isTieneRestaurante)
                .collect(Collectors.toList());
    }  
}
