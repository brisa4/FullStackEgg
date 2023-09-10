package EjercicioExtra3.main;

import EjercicioExtra3.entidad.Alojamiento;
import EjercicioExtra3.entidad.Camping;
import EjercicioExtra3.entidad.Hotel;
import EjercicioExtra3.entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
        // Crear instancias de servicios para hoteles, campings y residencias
        HotelServicio otelServicio = new HotelServiceImpl();
        CampingService campingService = new CampingServiceImpl();
        ResidenciaService residenciaService = new ResidenciaServiceImpl();

        // Agregar hoteles, campings y residencias a los servicios (datos de ejemplo)
        Hotel cuatroEstrellas1 = new HotelCuatroEstrellas("Hotel Cuatro Estrellas 1", "Dirección 1", "Localidad 1", "Gerente 1", 100, 200, 5, true, "Restaurante 1", 60, 100);
        Hotel cuatroEstrellas2 = new HotelCuatroEstrellas("Hotel Cuatro Estrellas 2", "Dirección 2", "Localidad 2", "Gerente 2", 80, 150, 4, false, "Restaurante 2", 40, 80);

        Camping camping1 = new Camping("Camping 1", "Dirección Camping 1", "Localidad Camping 1", "Gerente Camping 1", 300, 10, true);
        Camping camping2 = new Camping("Camping 2", "Dirección Camping 2", "Localidad Camping 2", "Gerente Camping 2", 150, 5, false);

        Residencia residencia1 = new Residencia("Residencia 1", "Dirección Residencia 1", "Localidad Residencia 1", "Gerente Residencia 1", 40, true, true);
        Residencia residencia2 = new Residencia("Residencia 2", "Dirección Residencia 2", "Localidad Residencia 2", "Gerente Residencia 2", 30, false, false);

        hotelServicio.agregarHotel(cuatroEstrellas1);
        hotelServicio.agregarHotel(cuatroEstrellas2);
        campingService.agregarCamping(camping1);
        campingService.agregarCamping(camping2);
        residenciaService.agregarResidencia(residencia1);
        residenciaService.agregarResidencia(residencia2);

        // Consultar y mostrar todos los alojamientos
        List<Alojamiento> todosLosAlojamientos = hotelServicio.obtenerTodos();
        todosLosAlojamientos.addAll(campingService.obtenerTodos());
        todosLosAlojamientos.addAll(residenciaService.obtenerTodos());

        System.out.println("Todos los alojamientos:");
        for (Alojamiento alojamiento : todosLosAlojamientos) {
            System.out.println(alojamiento.getNombre());
        }

        // Consultar y mostrar hoteles de más caro a más barato
        List<Hotel> hotelesOrdenados = hotelService.obtenerHotelesDeMasCaroAMasBarato();

        System.out.println("\nHoteles de más caro a más barato:");
        for (Hotel hotel : hotelesOrdenados) {
            System.out.println(hotel.getNombre() + " - Precio: $" + hotel.calcularPrecioHabitacion());
        }

        // Consultar y mostrar campings con restaurante
        List<Camping> campingsConRestaurante = campingService.obtenerCampingsConRestaurante();

        System.out.println("\nCampings con restaurante:");
        for (Camping camping : campingsConRestaurante) {
            System.out.println(camping.getNombre());
        }

        // Consultar y mostrar residencias con descuento
        List<Residencia> residenciasConDescuento = residenciaService.obtenerResidenciasConDescuento();

        System.out.println("\nResidencias con descuento:");
        for (Residencia residencia : residenciasConDescuento) {
            System.out.println(residencia.getNombre());
        }
    }  
}
