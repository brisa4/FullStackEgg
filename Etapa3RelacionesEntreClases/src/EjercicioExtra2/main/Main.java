package EjercicioExtra2.main;

import EjercicioExtra2.entidad.Cine;
import EjercicioExtra2.servicio.CineServicio;

public class Main {
  public static void main(String[] args) {
        CineServicio cs = new CineServicio();
        Cine cine = cs.simulacion();
    }  
}
