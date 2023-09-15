package EjercicioExtra2.entidad;

public class EdificioDeOficina extends Edificio {
    private int numeroOficina;
    private int personasPorOficina;
    private int numeroPisos;

    public EdificioDeOficina(double ancho, double alto, double largo, int numeroOficinas, int personasPorOficina, int numeroPisos) {
        super(ancho, alto, largo);
        this.numeroOficina = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
    }
    @Override
    public double calcularSuperficie() {
        return 2 * (alto * largo + alto * ancho + largo * ancho);
    }
    @Override
    public double calcularVolumen() {
        return alto * largo * ancho;
    }
    public int cantPersonas() {
        int personasPorPiso = numeroOficina * personasPorOficina;
        int personasEnEdificio = personasPorPiso * numeroPisos;
        return personasPorPiso;
    }
}
