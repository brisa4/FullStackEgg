package EjercicioExtra1.main;

import EjercicioExtra1.entidad.Alquiler;
import EjercicioExtra1.servicio.AlquilerServicio;

public class Main {
   public static void main(String[] args) {
        Alquiler alquiler = new Alquiler();
        AlquilerServicio alqs = new AlquilerServicio();
        alqs.crearAlquiler(alquiler);
    }  
}
