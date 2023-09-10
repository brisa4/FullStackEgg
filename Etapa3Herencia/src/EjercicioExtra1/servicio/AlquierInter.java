package EjercicioExtra1.servicio;

import EjercicioExtra1.entidad.Alquiler;

public interface AlquierInter {

    public void crearAlquiler(Alquiler alquiler);

    public double calculoAlquiler(Alquiler alquiler);

    public double diasOcupacion(Alquiler alquiler);

}
