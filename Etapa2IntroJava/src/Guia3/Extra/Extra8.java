package Guia3.Extra;

import java.util.Scanner;

public class Extra8 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        int contadorPar = 0;
        int contadorImpar = 0;
        int contador = 0;
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if (num > 0) {
                if (num % 2 == 0) {
                    contadorPar++;
                } else {
                    contadorImpar++;
                }
            }
            contador++;
        } while (!(num % 5 == 0));
        System.out.println("Se leyeron " + contador + " números");
        System.out.println("Se leyeron " + contadorPar + " números pares");
        System.out.println("Se leyeron " + contadorImpar + " números impares");
    }    
}
