package Guia3.Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args){   
  Scanner leer = new Scanner(System.in).useDelimiter("\n");   
  String cadena;
        int contadorCorrectas = 0;
        int contadorIncorrectas = 0;
        do {
            System.out.println("Ingrese una cadena");
            cadena = leer.next();
            boolean b = cadena.length() <= 5 && cadena.startsWith("X") && cadena.endsWith("O");
            if (b) {
                contadorCorrectas++;
            } else {
                contadorIncorrectas++;
            }
        } while (!"&&&&&".equals(cadena));
        System.out.println("Se leyeron " + contadorCorrectas + " cadenas correctas");
        System.out.println("Se leyeron " + contadorIncorrectas + " cadenas incorrectas");
  }  
}
