package EjercicioExtra3.servicio;

import EjercicioExtra3.entidad.Residencia;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResidenciaServicio {
  private List<Residencia> residencias = new ArrayList<>();

    public List<Residencia> obtenerTodos() {
        return residencias;
    }

    public void agregarResidencia(Residencia residencia) {
        residencias.add(residencia);
    }

    public List<Residencia> obtenerResidenciasConDescuento() {
        return residencias.stream()
                .filter(Residencia::isDescuentosGremios)
                .collect(Collectors.toList());
    }  
}
