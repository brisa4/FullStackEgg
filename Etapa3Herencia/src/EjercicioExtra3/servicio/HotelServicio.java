package EjercicioExtra3.servicio;

import EjercicioExtra3.entidad.Hotel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HotelServicio {
    private List<Hotel> hoteles = new ArrayList<>();

    public List<Hotel> obtenerTodos() {
        return hoteles;
    }
    public void agregarHotel(Hotel hotel) {
        hoteles.add(hotel);
    }
    public List<Hotel> obtenerHotelesDeMasCaroAMasBarato() {
        List<Hotel> hotelesOrdenados = new ArrayList<>(hoteles);

        Collections.sort(hotelesOrdenados, Comparator.comparingDouble(Hotel::calcularPrecioHabitacion).reversed());
        return hotelesOrdenados;
    }
}
