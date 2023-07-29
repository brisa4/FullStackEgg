package Guia5.Extra;

import java.util.Scanner;

public class Extra7 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("---** FIBONACCI by MEL **---");
        System.out.print("Ingrese un numero: ");
        int n = leer.nextInt();
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(n + " en terminos de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }  
}
