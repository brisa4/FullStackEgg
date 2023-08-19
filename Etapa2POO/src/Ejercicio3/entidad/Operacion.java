package Ejercicio3.entidad;

import java.util.Scanner;

public class Operacion {
  private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }
    public int getNumero1() {
        return numero1;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        this.numero1 = (leer.nextInt());
        System.out.println("Ingrese el segundo número");
        this.numero2 = (leer.nextInt());
    }
    public int sumar() {
        int suma = this.numero1 + this.numero2;
        System.out.println("La suma de los números es: " + suma);
        return suma;
    }
    public int restar() {
        int resta = this.numero1 - this.numero2;
        System.out.println("La resta de los números es: " + resta);
        return resta;
    }
    public int multiplicar() {
        int multiplicacion = 0;
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Se multiplicó por 0, por lo que el resultado es " + 0);
        } else {
            multiplicacion = this.numero1 * this.numero2;
            System.out.println("La multiplicacion de los números es: " + multiplicacion);
        }
        return multiplicacion;
    }
    public double dividir() {
        double num1 = this.numero1;
        double num2 = this.numero2;
        double division = 0;
        if (this.numero2 == 0) {
            System.out.println("Se dividió por 0, por lo que el resultado es " + 0 + ". Error en la operación.");
        } else {
            division = num1 / num2;
            System.out.println("La multiplicacion de los números es: " + division);
        }
        return division;
    }  
}
