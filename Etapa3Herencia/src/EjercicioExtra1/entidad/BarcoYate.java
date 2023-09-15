package EjercicioExtra1.entidad;

public class BarcoYate extends BarcoAMotor {
    private int numeroCamarotes;

    public BarcoYate(int numeroCamarotes, int potenciaMotor, String matricula, double eslora, int anio) {
        super(potenciaMotor, matricula, eslora, anio);
        this.numeroCamarotes = numeroCamarotes;
    }
    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }
    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }
}
