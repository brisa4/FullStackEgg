package EjercicioExtra4.main;

import EjercicioExtra4.entidad.Estudiante;
import EjercicioExtra4.entidad.Profesor;
import EjercicioExtra4.servicio.PersonalServicio;


public class Main {
  public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Juan", "Perez", "12345", "Soltero", "Ingeniería Informática");
        Profesor profesor = new Profesor("Maria", "Gomez", "67890", "Casado", 2015, "D101", "Informática");
        PersonalServicio personalServicio = new PersonalServicio("Luis", "Torres", "54321", "Soltero", 2010, "B201", "Biblioteca");

        System.out.println("Información de Estudiante:\n" + estudiante + "\n");
        System.out.println("Información de Profesor:\n" + profesor + "\n");
        System.out.println("Información de Personal de Servicio:\n" + personalServicio);
    }  
}
