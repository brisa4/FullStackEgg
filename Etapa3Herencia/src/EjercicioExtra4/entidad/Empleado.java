package EjercicioExtra4.entidad;


public abstract class Empleado extends Persona {
    private int anioIncorporacion;
    private String numeroDespacho;

    public Empleado(String nombre, String apellidos, String numeroIdentificacion,
                    String estadoCivil, int anioIncorporacion, String numeroDespacho) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public String getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(String numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
    public void reasignarDespacho(String nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nAño de Incorporación: " + anioIncorporacion +
               "\nNúmero de Despacho: " + numeroDespacho;
    }
}
