package Guia4.Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);  
  System.out.println("Ingrese la cantidad de euros");
  int num= leer.nextInt();  
  String opcion;
  double d;
            System.out.println("selecciona una opcion"
                    + "\n1. pasarlo a pesos"
                    + "\n2. pasarlo a dolares"
                    + "\n3. pasarlo a libra"
                    + "\n4. pasarlo a yenes");
            opcion = leer.next(); 
             switch (opcion) {
                case "1":
                     d = num * 209;
                   System.out.println("equivale a " + d + " pesos " );
                    break;
                case "2":
                     d = num * 1.28;
                    System.out.println("equivale a " + d + " dolar " );
                    break;
                case "3":
                    d = num * 0.86;
                    System.out.println("equivale a " + d + " dolar " );
                    break;
                case "4":
                    d = num * 144.87;
                    System.out.println("equivale a " + d + " dolar ");
                    break;
            }
        }  
}
