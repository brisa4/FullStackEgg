package Ejercicio4.main;

import Ejercicio4.entidad.Circulo;
import Ejercicio4.entidad.Rectangulo;

public class Main {
   public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 7);

        System.out.println("El área del círculo es: " + circulo.calcularArea());
        System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro());

        System.out.println("El área del cuadrado es: " + rectangulo.calcularArea());
        System.out.println("El perímetro del cuadrado es: " + rectangulo.calcularPerimetro());

    }  
}
