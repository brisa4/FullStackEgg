package Guia5.Ejercicios;

import java.util.Random;

public class Ejercicio4 {
   public static void main(String[] args) {
        int[][] matriz = generarMatrizAleatoria(4, 4);
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        
        int[][] traspuesta = obtenerMatrizTraspuesta(matriz);
        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);
    }
    public static int[][] generarMatrizAleatoria(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(10); 
            }
        }
        return matriz;
    }
    public static int[][] obtenerMatrizTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] traspuesta = new int[columnas][filas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }
    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }  
}
