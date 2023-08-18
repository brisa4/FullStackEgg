package entidad;

public class Persona {
    String nombre;
    long dni;
    int edad;
    
    public Persona(){
}
   public Persona(String nombreParametro,long dniParametro, int edadParametro ){
   this.nombre = nombreParametro;
   this.dni =  dniParametro;
   this.edad = edadParametro;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 
   
   
   
}