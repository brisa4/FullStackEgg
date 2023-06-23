package Guia2.Manosalaobra.ejercicios;

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args){  
   Scanner leer = new Scanner(System.in);  
    System.out.println("ingrese un numero entero:");
    int num1= leer.nextInt();
    System.out.println("ingrese el segundo numero entero:");
    int num2 = leer.nextInt();
    int suma = num1 + num2;
    System.out.println("el resultado es:" + suma);
   
  }  
}
