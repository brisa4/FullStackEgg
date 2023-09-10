package EjercicioExtra1.entidad;

import java.util.Date;

public class Alquiler {
  private String nombre;
    private long documento;
    private Date fechaAlquiler;
    private Date devolucion;
    private int posicionAmarre;
    private Barco barco;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getDocumento() {
        return documento;
    }
    public void setDocumento(long documento) {
        this.documento = documento;
    }
    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }
    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
    public Date getDevolucion() {
        return devolucion;
    }
    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }
    public int getPosicionAmarre() {
        return posicionAmarre;
    }
    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }
    public Barco getBarco() {
        return barco;
    }
    public void setBarco(Barco barco) {
        this.barco = barco;
    }  
}
