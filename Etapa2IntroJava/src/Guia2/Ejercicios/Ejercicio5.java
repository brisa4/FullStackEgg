package Guia2.Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args){  
   Scanner leer = new Scanner(System.in);  
   System.out.println("ingrese un numero:");
   int num1= leer.nextInt(); 
   int numeroDoble = num1 * 2;
        int numeroTriple = num1 * 3;
        double raizCuadrada = Math.sqrt(num1);
        System.out.println("El doble es: " + numeroDoble);
        System.out.println("El triple es: " + numeroTriple);
        System.out.println("El raiz cuadrada es: " + raizCuadrada);
  }  
}
