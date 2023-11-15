package EjercicioExtra1.Estancia.Entidades;

public class Familia {
  private int idFamilia;
    private String nombre;
    private int edadMinima;
    private int edadMaxima;
    private int numHijos;
    private String email;
    private int idCasaFamilia;  
    
public Familia() {
    this.idFamilia = 0;
    this.nombre = "";
    this.edadMinima = 0;
    this.edadMaxima = 0;
    this.numHijos = 0;
    this.email = "";
    this.idCasaFamilia = 0;
}    
public Familia(int idFamilia, String nombre, int edadMinima, int edadMaxima, int numHijos, String email, int idCasaFamilia) {
        this.idFamilia = idFamilia;
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.numHijos = numHijos;
        this.email = email;
        this.idCasaFamilia = idCasaFamilia;
    }
    public int getIdFamilia() {
        return idFamilia;
    }
    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdadMinima() {
        return edadMinima;
    }
    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
    public int getEdadMaxima() {
        return edadMaxima;
    }
    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }
    public int getNumHijos() {
        return numHijos;
    }
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdCasaFamilia() {
        return idCasaFamilia;
    }
    public void setIdCasaFamilia(int idCasaFamilia) {
        this.idCasaFamilia = idCasaFamilia;
    }
    public void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
