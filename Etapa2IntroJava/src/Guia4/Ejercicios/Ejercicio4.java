package Guia4.Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);  
  System.out.println("ingese un numero para saber si es primo o no");
  int num= leer.nextInt();
  System.out.println(esPrimo(num));
  }
  public static boolean esPrimo(int num) {
  int contador = 0;  
  for (int i = 1; i <= num; i++){
  if(num % i == 0){
     contador++;
  }
   if (contador > 2){
       break;
   }
  }
  return contador <= 2;
 }  
}
