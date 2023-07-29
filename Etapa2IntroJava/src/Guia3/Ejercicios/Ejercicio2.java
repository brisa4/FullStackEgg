package Guia3.Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args){ 
  Scanner input = new Scanner(System.in); 
  System.out.println("ingrese una frase :");
  String frase= input.nextLine (); 
  if (frase.equals("eureka")){
  System.out.println("correcto:");
  } else {
      System.out.println("incorrecto:");
  }
  }  
}
