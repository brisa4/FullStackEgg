package Guia3.Extra;

import java.util.Scanner;

public class Extra3 {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);  
  System.out.print("Ingrese una letra");
  String letra = scanner.next().toLowerCase();

        if (letra.equals("a")|| letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra NO es vocal");
        }            
  }  
}
