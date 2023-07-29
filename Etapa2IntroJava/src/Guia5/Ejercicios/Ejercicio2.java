package Guia5.Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
   public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        int[] num = new int[15];
        for (int i = 1; i < num.length; i++) {
            num[i] = (int) (Math.random() * 15);
        }
        for (int i = 1; i < num.length; i++) {
            System.out.print(num[i] + " - ");
        }
        System.out.println("");
        System.out.println("Valor a buscar:");

        int valor = leer.nextInt();

        for (int i = 1; i < num.length; i++) {
            if (valor == num[i]) {

                System.out.println("se encontro el valor en la posicion: " + i);
            }   
        }   
  }    
}
