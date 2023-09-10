package EjercicioExtra4.entidad;

public class Alumno {
 private String nombreCompleto;
    private String dni;
    private int cantidadVotos;

    public Alumno(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = 0;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getDni() {
        return dni;
    }
    public int getCantidadVotos() {
        return cantidadVotos;
    }
    public void incrementarVotos() {
        cantidadVotos++;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    @Override
    public String toString() {
        return "Alumno: " + nombreCompleto + " (DNI: " + dni + ") - Votos: " + cantidadVotos;
    }
}
