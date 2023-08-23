package Ejercicio3.servicio;

import Ejercicio3.entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {
  public ArrayList<Alumno> crearListaAlumnos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> alumnos = new ArrayList();
        boolean confirmacion = true;
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(leer.next());
            System.out.println("Ingresa las notas del alumno");
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }
            alumno.setNotas(notas);
            alumnos.add(alumno);
            System.out.println("Desea ingresar otro alumno? S/N");
            if (leer.next().equalsIgnoreCase("N")) {
                confirmacion = false;
            }
        } while (confirmacion);
        return alumnos;
    }
    public Double buscarAlumno(ArrayList<Alumno> alumnos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del alumno que desea calcular la nota final");
        String alumnoABuscar = leer.next();
        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()) {
            Alumno alumnoAuxiliar = it.next();
            if (alumnoAuxiliar.getNombre().equalsIgnoreCase(alumnoABuscar)) {
                return promedioNotas(alumnoAuxiliar);
            }
        }
        System.out.println("NO se encontró el alumno");
        return null;
    }
    public double promedioNotas(Alumno alumno) {
        double sumaNotas = 0;
        for (Integer nota : alumno.getNotas()) {
            sumaNotas += nota;
        }
        return sumaNotas / alumno.getNotas().size();
    }  
}
