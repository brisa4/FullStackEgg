package Guia3.Extra;

import java.util.Scanner;

public class Extra9 {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);  
  System.out.println("Ingrese un dividendo");
  int dividendo = scanner.nextInt();
  System.out.println("Ingrese un divisor");
  int divisor = scanner.nextInt();
  int cociente = 0;
  int residuo = dividendo;
  while (residuo>=divisor){
      residuo-= divisor;
      cociente++;
  }
  System.out.println( "El residuo es " +residuo + " y el cociente es " + cociente);
  }  
}
