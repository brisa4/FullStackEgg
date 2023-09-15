package EjercicioExtra4.entidad;


 public class Profesor extends Empleado {
    private String departamento;

    public Profesor(String nombre, String apellidos, String numeroIdentificacion,
                    String estadoCivil, int anioIncorporacion, String numeroDespacho,
                    String departamento) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anioIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nDepartamento: " + departamento;
    }
}
