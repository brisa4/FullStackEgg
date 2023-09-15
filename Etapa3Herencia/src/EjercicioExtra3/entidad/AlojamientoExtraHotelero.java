package EjercicioExtra3.entidad;

public abstract class AlojamientoExtraHotelero extends Alojamiento {
    private boolean privado;
    private double metrosCuadrados;

    public AlojamientoExtraHotelero(String nombre, String direccion, String localidad,
                                    String gerente, boolean privado, double metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }
    public boolean isPrivado() {
        return privado;
    }
    public void setPrivado(boolean privado) {
        this.privado = privado;
    }
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
}
