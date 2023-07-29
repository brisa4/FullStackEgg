package Guia3.Extra;

import java.util.Scanner;

public class Extra11 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int numero = scanner.nextInt();
        int contador = 0;
        while (numero > 0) {
            numero /= 10;
            contador++;
        }
        System.out.println("la cantidad de digitos del numero ingresado es :"+contador);
    }  
}
