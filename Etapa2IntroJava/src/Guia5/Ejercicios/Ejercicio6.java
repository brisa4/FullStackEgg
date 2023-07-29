package Guia5.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los números del cuadrado mágico (1 al 9):");

        // Leer los números del cuadrado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado[i][j] = scanner.nextInt();

                // Comprobar que los números están entre 1 y 9
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: Los números deben estar entre 1 y 9.");
                    return;
                }
            }
        }

        // Comprobar si es un cuadrado mágico
        if (esCuadradoMagico(cuadrado)) {
            System.out.println("¡Es un cuadrado mágico!");
        } else {
            System.out.println("No es un cuadrado mágico.");
        }
    }

    // Método para comprobar si es un cuadrado mágico
    public static boolean esCuadradoMagico(int[][] cuadrado) {
        int sumaFila1 = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        int sumaFila2 = cuadrado[1][0] + cuadrado[1][1] + cuadrado[1][2];
        int sumaFila3 = cuadrado[2][0] + cuadrado[2][1] + cuadrado[2][2];
        int sumaColumna1 = cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0];
        int sumaColumna2 = cuadrado[0][1] + cuadrado[1][1] + cuadrado[2][1];
        int sumaColumna3 = cuadrado[0][2] + cuadrado[1][2] + cuadrado[2][2];
        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];

        // Comprobar si las sumas son idénticas
        if (sumaFila1 == sumaFila2 && sumaFila2 == sumaFila3 && sumaFila3 == sumaColumna1 &&
                sumaColumna1 == sumaColumna2 && sumaColumna2 == sumaColumna3 && sumaColumna3 == sumaDiagonal1 &&
                sumaDiagonal1 == sumaDiagonal2) {
            return true;
        } else {
            return false;
        }
    }  
}
