package EjercicioExtra3.entidad;

 public class Residencia extends AlojamientoExtraHotelero {
    private int cantidadHabitaciones;
    private boolean descuentoGremios;
    private boolean tieneCampoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente,
                      boolean privado, double metrosCuadrados, int cantidadHabitaciones,
                      boolean descuentoGremios, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }
    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }
    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }
    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }
    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }
    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }
}
