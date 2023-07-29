package Guia4.Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
  static Scanner leer = new Scanner(System.in).useDelimiter("\n");
public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de personas etc");
        int num= leer.nextInt();
        edadPersonas(num);
    }
public static void edadPersonas(int num) {
        String opcion;
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el nombre de la persona");
            String nombrePersona = leer.next();
            System.out.println("Ingresa la edad");
            int edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
            System.out.println("Desea continuar?");
            opcion = leer.next();
            if (opcion.equalsIgnoreCase("NO")) {
                break;
            }
        }
    }  
}
