package EjercicioExtra3.entidad;

public class Hotel extends Alojamiento {
    private int cantidadHabitaciones;
    private int numeroCamas;
    private int cantidadPisos;
    private String restauranteNombre;
    private int capacidadRestaurante;
    private char tipoGimnasio; // 'A' o 'B'
    private int cantidadLimosinas;
    private double precioHabitacion;

    public Hotel(String nombre, String direccion, String localidad, String gerente,
                 int cantidadHabitaciones, int numeroCamas, int cantidadPisos,
                 String restauranteNombre, int capacidadRestaurante, char tipoGimnasio,
                 int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.restauranteNombre = restauranteNombre;
        this.capacidadRestaurante = capacidadRestaurante;
        this.tipoGimnasio = tipoGimnasio;
        this.cantidadLimosinas = cantidadLimosinas;
        calcularPrecioHabitacion();
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public String getRestauranteNombre() {
        return restauranteNombre;
    }

    public void setRestauranteNombre(String restauranteNombre) {
        this.restauranteNombre = restauranteNombre;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public char getTipoGimnasio() {
        return tipoGimnasio;
    }

    public void setTipoGimnasio(char tipoGimnasio) {
        this.tipoGimnasio = tipoGimnasio;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

   public void calcularPrecioHabitacion() {
        // Implementa la fórmula de cálculo del precio aquí
    } 
}
