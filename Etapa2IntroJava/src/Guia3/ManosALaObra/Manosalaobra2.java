package Guia3.ManosALaObra;

import java.util.Scanner;

public class Manosalaobra2 {
  public static void main(String[] args){   
  Scanner leer = new Scanner(System.in);  
  System.out.println("ingrese el numero del motor del 1 al 4");
  int motor= leer.nextInt();  
   switch (motor){
       case 1:
       System.out.println("La bomba es una bomba de agua");
       break;
      
       case 2:
       System.out.println("La bomba es una bomba de gasolina");
       break;
       
       case 3:
       System.out.println("La bomba es una bomba de hormigon");
       break;
       
       case 4:
       System.out.println("No existe un valor valido para tipo de bomba");
       break;
   }
 }  
}
