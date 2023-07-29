package Guia5.Extra;

import java.util.Random;

public class Extra5 {
  public static void main(String[] args) {
        int N = 3; 
        int M = 4; 

        int[][] matriz = new int[N][M];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = random.nextInt(100); 
            }
        }
        System.out.println("Matriz generada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int suma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("Suma de los elementos: " + suma);
    }    
}
