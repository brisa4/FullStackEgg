package Guia3.ManosALaObra;

import java.util.Scanner;

public class Manosalaobra1 {
  public static void main(String[] args){  
   Scanner leer = new Scanner(System.in);  
    System.out.println("ingrese un numero entero:");
    int num1= leer.nextInt();
    System.out.println("ingrese el segundo numero entero:");
    int num2 = leer.nextInt();  
    if (num1 > 25 && num2 >25) {
    System.out.println("ambos numero son mayores a 25:");
    }else if (num1 > 25 || num2 > 25) {
    System.out.println("uno de los numeros es mayor a 25:");    
    }else { 
    System.out.println("ningun numero es mayor a 25:");
    }
  }  
}
