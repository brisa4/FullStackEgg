package Ejercicio3.main;

import Ejercicio3.entidad.Alumno;
import java.util.ArrayList;
import Ejercicio3.servicio.AlumnoServicio;

public class Main {
  public static void main(String[] args) {
        AlumnoServicio as = new AlumnoServicio();
        ArrayList<Alumno> alumnos = as.crearListaAlumnos();

        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }
        System.out.println("El promedio del alumno es " + as.buscarAlumno(alumnos));
    }  
}
