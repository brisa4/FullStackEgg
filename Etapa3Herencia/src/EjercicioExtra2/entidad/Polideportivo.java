package EjercicioExtra2.entidad;

public class Polideportivo extends Edificio {
    private String nombre;
    private String tipoInstalacion; // Puede ser "Techado" o "Abierto"

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (alto * largo + alto * ancho + largo * ancho);
    }

    @Override
    public double calcularVolumen() {
        return alto * largo * ancho;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }
}
