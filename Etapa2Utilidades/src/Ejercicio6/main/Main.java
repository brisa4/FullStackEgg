package Ejercicio6.main;

import Ejercicio6.entidad.Curso;
import Ejercicio6.servicio.CursoServicio;

public class Main {
   public static void main(String[] args) {
        CursoServicio cs = new CursoServicio();
        Curso curso = cs.crearCurso();

        cs.mostrarAlumnos(curso);
        cs.calcularGananciaSemanal(curso);
    }  
}
