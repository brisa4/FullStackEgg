package EjercicioExtra2.servicio;

public class CantanteFamosoServicio {
  private String nombre;
    private String discoConMasVentas;

    public CantanteFamosoServicio(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }
}
