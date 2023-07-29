package Guia5.Extra;

import java.util.Scanner;
import java.util.Random;

public class Extra6 {
  public static void main(String[] args) {
        int tamano = 20;
        char[][] sopaDeLetras = new char[tamano][tamano];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] palabras = new String[5];
        int filaAleatoria = random.nextInt(tamano);

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine().toUpperCase();

            for (int j = 0; j < palabras[i].length(); j++) {
                sopaDeLetras[filaAleatoria][j] = palabras[i].charAt(j);
            }
            filaAleatoria = random.nextInt(tamano);
        }
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (sopaDeLetras[i][j] == '\u0000') {
                    sopaDeLetras[i][j] = (char) (random.nextInt(10) + '0');
                }
            }
        }
        System.out.println("Sopa de letras:");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println();
        }
    }  
}
