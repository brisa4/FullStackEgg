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

    @Override
    public String toString() {
        return "Alumno: " + nombreCompleto + " (DNI: " + dni + ") - Votos: " + cantidadVotos;
    }  

    void setDni(String get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
