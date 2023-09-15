package EjercicioExtra3.Main;

import EjercicioExtra3.entidad.Camping;
import EjercicioExtra3.entidad.Hotel;
import EjercicioExtra3.entidad.Residencia;
import EjercicioExtra3.servicio.AlojamientoServicio;
import java.util.List;


public class Main {
  public static void main(String[] args) {
        AlojamientoServicio consulta = new AlojamientoServicio();

        consulta.agregarAlojamiento(new Hotel("Hotel 1", "Dirección 1", "Localidad 1", "Gerente 1",
                100, 200, 5, "Restaurante A", 50, 'A', 3));
        consulta.agregarAlojamiento(new Camping("Camping 1", "Dirección 2", "Localidad 2", "Gerente 2",
                true, 5000, 100, 20, true));
        consulta.agregarAlojamiento(new Residencia("Residencia 1", "Dirección 3", "Localidad 3", "Gerente 3",
                false, 300, 50, true, false));

        List<Hotel> hotelesOrdenados = consulta.obtenerHotelesDeMasCaroAMasBarato();
        List<Camping> campingsConRestaurante = consulta.obtenerCampingsConRestaurante();
        List<Residencia> residenciasConDescuento = consulta.obtenerResidenciasConDescuento();

   System.out.println("Hoteles de más caro a más barato:");
        for (Hotel hotel : hotelesOrdenados) {
            System.out.println("Nombre: " + hotel.getNombre() + ", Precio: " + hotel.getPrecioHabitacion());
        }

        System.out.println("\nCampings con restaurante:");
        for (Camping camping : campingsConRestaurante) {
            System.out.println("Nombre: " + camping.getNombre());
        }

        System.out.println("\nResidencias con descuento:");
        for (Residencia residencia : residenciasConDescuento) {
            System.out.println("Nombre: " + residencia.getNombre());
     }
   }
 }

