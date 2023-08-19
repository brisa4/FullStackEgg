package EjercicioExtra1.main;

import EjercicioExtra1.entidad.Raices;
import EjercicioExtra1.servicio.RaicesServicio;

public class Main {
  public static void main(String[] args) {
        Raices ecuacion = new Raices(1, 2, 1);
        RaicesServicio.calcular(ecuacion);
    }  
}
