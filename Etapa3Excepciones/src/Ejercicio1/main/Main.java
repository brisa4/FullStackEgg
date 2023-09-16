package Ejercicio1.main;

import Ejercicio1.entidad.Persona;
import Ejercicio1.servicio.PersonaServicio;

public class Main {
  public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        Persona[] personas = new Persona[4];
        personas[0] = null;
        try {
            personaServicio.esMayorDeEdad(personas[0]);
        } catch (NullPointerException e) {
            System.out.println("Error al calcular la masa");
        }
    }  
}
