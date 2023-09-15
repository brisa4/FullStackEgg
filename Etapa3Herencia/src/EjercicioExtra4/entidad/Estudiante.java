package EjercicioExtra4.entidad;

 public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellidos, String numeroIdentificacion,
                      String estadoCivil, String curso) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void matricularEnCurso(String nuevoCurso) {
        this.curso = nuevoCurso;
    }
    @Override
    public String toString() {
        return super.toString() +
               "\nCurso Matriculado: " + curso;
    }
}
