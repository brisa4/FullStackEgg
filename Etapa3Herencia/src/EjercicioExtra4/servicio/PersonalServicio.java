package EjercicioExtra4.servicio;

import EjercicioExtra4.entidad.Empleado;

public class PersonalServicio extends Empleado {
    private String seccion;
    public PersonalServicio(String nombre, String apellidos, String numeroIdentificacion,
                            String estadoCivil, int anioIncorporacion, String numeroDespacho,
                            String seccion) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, anioIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }
    public String getSeccion() {
        return seccion;
    }
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    public void trasladarASeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }
    @Override
    public String toString() {
        return super.toString() +
               "\nSección: " + seccion;
    }
}
