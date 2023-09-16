package Ejercicio3.main;

import Ejercicio3.entidad.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Por favor, introduce el primer número:");
        String num1Str = scanner.next();

        System.out.println("Por favor, introduce el segundo número:");
        String num2Str = scanner.next();

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        try {
            int resultado = DivisionNumero.dividirNumeros(num1, num2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (Exception e) {
            
        }
    }  
}
