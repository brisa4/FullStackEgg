package Guia3.Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args){ 
  Scanner input = new Scanner(System.in);   
  System.out.println("ingrese un numero limite positivo:");
  int limite= input.nextInt();  
  int suma =0;
  int contador = 0;
  while (suma <= limite) {
   System.out.println("Ingrese un número");
   int num = input.nextInt();
   suma += num;
  }
  }  
}
