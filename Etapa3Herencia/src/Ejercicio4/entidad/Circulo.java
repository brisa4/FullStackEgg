package Ejercicio4.entidad;

import Ejercicio4.servicio.CalculosFormas;

public class Circulo implements CalculosFormas {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return PI * Math.pow(this.radio, 2);
    }
    @Override
    public double calcularPerimetro() {
        return PI * radio * 2;
    }
}
