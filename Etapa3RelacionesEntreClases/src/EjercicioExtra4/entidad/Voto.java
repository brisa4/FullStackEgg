package EjercicioExtra4.entidad;

import java.util.ArrayList;
import java.util.List;

public class Voto {
  private Alumno alumnoVotante;
    private List<Alumno> alumnosVotados;

    public Voto(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
        this.alumnosVotados = new ArrayList<>();
    }
    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }
    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }
    public void agregarVoto(Alumno alumnoVotado) {
        alumnosVotados.add(alumnoVotado);
    }
    
    @Override
    public String toString() {
        return alumnoVotante.getNombreCompleto() + " votó por: " + obtenerNombresVotados();
    }
    private String obtenerNombresVotados() {
        List<String> nombresVotados = new ArrayList<>();
        for (Alumno alumno : alumnosVotados) {
            nombresVotados.add(alumno.getNombreCompleto());
        }
        return String.join(", ", nombresVotados);
    }
}
