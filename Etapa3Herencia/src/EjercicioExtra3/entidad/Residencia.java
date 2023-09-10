package EjercicioExtra3.entidad;

public class Residencia extends AlojamientoExtraHotelero {
    private int cantidadHabitaciones;
    private boolean descuentosGremios;
    private boolean tieneCampoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente,
                      boolean privado, double metrosCuadrados, int cantidadHabitaciones,
                      boolean descuentosGremios, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }
public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentosGremios() {
        return descuentosGremios;
    }

    public void setDescuentosGremios(boolean descuentosGremios) {
        this.descuentosGremios = descuentosGremios;
    }

    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
}

    public boolean getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}