package Guia3.Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args){   
  Scanner leer = new Scanner(System.in); 
  System.out.println("ingrese un numero :");
  int num1= leer.nextInt(); 
  if (num1% 2==0){
  System.out.println("su numero es par:");
  } else {
      System.out.println("su numero es inpar:");
  }
  }  
}
