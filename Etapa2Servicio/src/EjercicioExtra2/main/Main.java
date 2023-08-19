package EjercicioExtra2.main;

import EjercicioExtra2.entidad.NIF;
import EjercicioExtra2.servicio.NIFServicio;

public class Main {
  public static void main(String[] args) {
        NIFService nifService = new NIFService();
        NIF nif = new NIF();
        nifService.crearNIF(nif);
        nifService.mostrar(nif);
    } 
}
