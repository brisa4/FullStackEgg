package EjercicioExtra1.main;

import EjercicioExtra1.entidad.Perro;
import EjercicioExtra1.entidad.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import EjercicioExtra1.servicio.PerroServicio;
import EjercicioExtra1.servicio.PersonaServicio;


public class Main {
  public static void main(String[] args) {

        PersonaServicio ser = new PersonaServicio();
        PerroServicio serv = new PerroServicio();
        ArrayList<Perro> perros = serv.crearPerros();
        ArrayList<Persona> personas = ser.crearPersona();
        HashMap<Persona, Perro> adoptar = new HashMap<>();
        ser.adoptarPerro(personas, perros, adoptar);
    }  
}
