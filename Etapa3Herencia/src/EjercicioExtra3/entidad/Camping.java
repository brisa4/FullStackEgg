package EjercicioExtra3.entidad;

public class Camping extends AlojamientoExtraHotelero {
    private int capacidadMaximaCarpas;
    private int cantidadBanios;
    private boolean tieneRestaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente,
                   boolean privado, double metrosCuadrados, int capacidadMaximaCarpas,
                   int cantidadBanios, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanios = cantidadBanios;
        this.tieneRestaurante = tieneRestaurante;
    }
    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }
    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }
    public int getCantidadBanios() {
        return cantidadBanios;
    }
    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }
    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }
    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }
}
