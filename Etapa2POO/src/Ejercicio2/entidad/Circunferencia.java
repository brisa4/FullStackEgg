package Ejercicio2.entidad;

import java.util.Scanner;

public class Circunferencia {
  private double radio;

    public Circunferencia() {
    }
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio del objeto");
        this.radio = (leer.nextDouble());
    }
    public void area() {
        double area = Math.PI * (Math.pow(this.radio, 2));
        System.out.println("El área del círculo es: " + area);
    }
    public void perimetro() {
        double perimetro = Math.PI * this.radio * 2;
        System.out.println("El área del círculo es: " + perimetro);
    }  
}
