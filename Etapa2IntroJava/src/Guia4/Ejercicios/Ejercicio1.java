package Guia4.Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
   public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  System.out.println("Ingrese dos números");
  int num1 = leer.nextInt();
  int num2 = leer.nextInt();  
  String opcion;
  double resultado;     
            System.out.println("Seleccione una opción"
                    + "\n1. Sumar"
                    + "\n2. Restar"
                    + "\n3. Multiplicar"
                    + "\n4. Dividir");
            opcion = leer.next();
  switch (opcion) {
                case "1":
                    System.out.println("el total de la suma es de : " + (num1 + num2));
                    break;
                case "2":
                    System.out.println("el total de la resta es de: " + (num1 - num2));
                    break;
                case "3":
                    System.out.println("el total de la multiplicacion es de: " + (num1 * num2));
                    break;

                case "4":
                    System.out.println("el total de la divicion es de : " + (num1 / num2));
                    break;
                    default:
                System.out.println("De 1 a 4 gil");
  }
    }
  public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
public static int restar(int num1, int num2) {
        return num1 - num2;
    }
public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
public static double dividir(double num1, double num2) {
        return num1 / num2;
  }  
}
