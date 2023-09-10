package EjercicioExtra4.servicio;

import EjercicioExtra4.entidad.Alumno;
import EjercicioExtra4.entidad.Simulador;
import EjercicioExtra4.entidad.Voto;
import java.util.List;

public class SimuladorServicio {
  private Simulador simulador;

    public SimuladorServicio() {
        this.simulador = new Simulador();
    }
    public List<Alumno> generarListaAlumnosAleatorios(int cantidad) {
        return simulador.generarListaAlumnosAleatorios(cantidad);
    }
    public List<String> generarListaDnis(int cantidad) {
        return simulador.generarListaDnis(cantidad);
    }
    public void asignarNombresYDnis(List<Alumno> alumnos, List<String> dnis) {
        simulador.asignarNombresYDnis(alumnos, dnis);
    }
    public void imprimirListaAlumnos(List<Alumno> alumnos) {
        simulador.imprimirListaAlumnos(alumnos);
    }
    public List<Voto> votacion(List<Alumno> listaAlumnos) {
        return simulador.votacion(listaAlumnos);
    }
    public void mostrarResultadosVotacion(List<Voto> votos) {
        simulador.mostrarResultadosVotacion(votos);
    }
    public void contarVotos(List<Alumno> alumnos) {
        simulador.contarVotos(alumnos);
    }  
}
