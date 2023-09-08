package EjercicioExtra3.main;

import EjercicioExtra3.entidad.Poliza;
import EjercicioExtra3.servicio.PolizaServicio;

public class Main {
   public static void main(String[] args) {
        PolizaServicio ps = new PolizaServicio();
        Poliza poliza = ps.contratarSeguro();
    }  
}
