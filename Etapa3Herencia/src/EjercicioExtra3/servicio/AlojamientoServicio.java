package EjercicioExtra3.servicio;

import EjercicioExtra3.entidad.Alojamiento;
import EjercicioExtra3.entidad.Camping;
import EjercicioExtra3.entidad.Hotel;
import EjercicioExtra3.entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlojamientoServicio {
    private List<Alojamiento> alojamientos;

    public AlojamientoServicio() {
        alojamientos = new ArrayList<>();
    }
    public void agregarAlojamiento(Alojamiento alojamiento) {
        alojamientos.add(alojamiento);
    }
    public List<Alojamiento> obtenerTodosLosAlojamientos() {
        return alojamientos;
    }
    public List<Hotel> obtenerHotelesDeMasCaroAMasBarato() {
        List<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }
        Collections.sort(hoteles, new Comparator<Hotel>() {
            public int compare(Hotel hotel1, Hotel hotel2) {
                return Double.compare(hotel2.getPrecioHabitacion(), hotel1.getPrecioHabitacion());
            }
        });

        return hoteles;
    }
    public List<Camping> obtenerCampingsConRestaurante() {
        List<Camping> campingsConRestaurante = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                if (camping.isTieneRestaurante()) {
                    campingsConRestaurante.add(camping);
                }
            }
        }
        return campingsConRestaurante;
    }
    public List<Residencia> obtenerResidenciasConDescuento() {
        List<Residencia> residenciasConDescuento = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                if (residencia.isDescuentoGremios()) {
                    residenciasConDescuento.add(residencia);
                }
            }
        }
        return residenciasConDescuento;
    }
}
