package ManosALaObra.entidad;

public class Persona {
  private String nombre;
    private int edad;
    private String correoElectronico;

    public Persona(String nombre, int edad, String correoElectronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }  
}
