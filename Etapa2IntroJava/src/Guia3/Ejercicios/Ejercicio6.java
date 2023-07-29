package Guia3.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
   public static void main(String[] args){   
  Scanner leer = new Scanner(System.in); 
  System.out.println("ingrese dos numero entero :");
  int num1 = leer.nextInt();   
  int num2 = leer.nextInt();  
  String opcion;
        do {
            System.out.println("Seleccione una opción"
                    + "\n1. Sumar"
                    + "\n2. Restar"
                    + "\n3. Multiplicar"
                    + "\n4. Dividir"
                    + "\n5. Salir"
                    + "\nElija opción");
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
                case "5":
                    System.out.println("Seguro desea salir s/n?");
                    opcion = leer.next();
            }
        } while (!"S".equalsIgnoreCase(opcion));
    }   
}
