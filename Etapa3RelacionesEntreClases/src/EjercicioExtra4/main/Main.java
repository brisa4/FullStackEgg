package EjercicioExtra4.main;

import EjercicioExtra4.entidad.Alumno;
import EjercicioExtra4.entidad.Voto;
import EjercicioExtra4.servicio.SimuladorServicio;
import java.util.List;

public class Main {
  public static void main(String[] args) {
        SimuladorServicio simuladorServicio = new SimuladorServicio();
        int numAlumnos = 20; // Ajusta la cantidad de alumnos según tus necesidades

        List<Alumno> listaAlumnos = simuladorServicio.generarListaAlumnosAleatorios(numAlumnos);
        List<String> listaDnis = simuladorServicio.generarListaDnis(numAlumnos);

        simuladorServicio.asignarNombresYDnis(listaAlumnos, listaDnis);

        System.out.println("Lista de Alumnos:");
        simuladorServicio.imprimirListaAlumnos(listaAlumnos);

        List<Voto> votos = simuladorServicio.votacion(listaAlumnos);

        System.out.println("\nResultados de la votación:");
        simuladorServicio.mostrarResultadosVotacion(votos);

        System.out.println("\nConteo de votos:");
        simuladorServicio.contarVotos(listaAlumnos);
    }
}
