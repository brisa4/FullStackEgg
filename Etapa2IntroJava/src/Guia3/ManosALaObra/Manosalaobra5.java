package Guia3.ManosALaObra;

import java.util.Scanner;

public class Manosalaobra5 {
  public static void main(String[] args){   
  Scanner scanner = new Scanner(System.in);   
  for (int i=0 ; i < 4; i++){
      System.out.printf("introduce un numero entre 1 y 20: " ,i+1);
      int numero = scanner.nextInt();
      for (int j=0 ; j < numero; j++){
   System.out.print( "*" );
  }  
  System.out.println( ); 
 } 
  }  
}
