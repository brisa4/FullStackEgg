package Guia3.Extra;

import java.util.Scanner;

public class Extra10 {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);  
  int num1 =(int)(Math.random()*10);
  int num2 =(int)(Math.random()*10);
  int respuesta;
  System.out.println("Adivine el resultadon de la multiplicacion entre " +num1+ " y " + num2+ ":");
  do {
            System.out.println("respuesta:");
            respuesta = scanner.nextInt();
            if (respuesta == num1*num2) {
            System.out.println("correcto:");    
            } else {
                System.out.println("incorrecto intentalo de nuevo:");
             }
          } while(respuesta!= num1*num2);
 }  
}
