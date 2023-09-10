package Ejercicio4.entidad;

import Ejercicio4.servicio.CalculosFormas;

public class Rectangulo implements CalculosFormas {

    private double base;
    private double altura;

    public Rectangulo() {
    }
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return this.altura * this.base;
    }
    @Override
    public double calcularPerimetro() {
        return (this.base + this.altura) * 2;
    }
}
