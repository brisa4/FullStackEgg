package Guia5.Extra;

import java.util.Scanner;

public class Extra1 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");// \ = alt + 92
       System.out.println("Tamaño del vector:");
       int n = leer.nextInt();
        int[] vec = new int[n];
        int total = 0;
for (int i = 0; i < vec.length; i++) {
            System.out.println("Ingresa los numeros");
            vec[i] = leer.nextInt();
total += vec[i];
        }
        System.out.println("la suma total es:" + total);
    }  
}
