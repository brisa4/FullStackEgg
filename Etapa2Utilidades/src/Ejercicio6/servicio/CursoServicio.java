package Ejercicio6.servicio;

import java.util.Scanner;
import java.util.Arrays;
import Ejercicio6.entidad.Curso;

public class CursoServicio {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso() {
        Curso curso = new Curso();
        System.out.println("Ingresa el nombre del curso");
        curso.setNombreCurso(leer.next());
        System.out.println("Ingres la cantidad de horas por día de cursado");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingresa la cantidad de días que se va a dictar el cursado");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese si es turno mañana o tarde");
        curso.setTurno(leer.next());
        System.out.println("Ingresa el valor de la hora del cursado");
        curso.setPrecioPorHora(leer.nextInt());
        
        curso.setAlumnos(cargarAlumnos(curso.getAlumnos().length));
        return curso;
    }
    private String[] cargarAlumnos(int longitudVector) {
        String[] alumnos = new String[longitudVector];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumnos[i] = leer.next();
        }
        return alumnos;
    }
    public void mostrarAlumnos(Curso curso) {
        System.out.println(Arrays.toString(curso.getAlumnos()));
    }
    public void calcularGananciaSemanal(Curso curso) {
        System.out.println("La ganancia semanal es de " + (curso.getCantidadDiasPorSemana() * curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length));
    }  
}
