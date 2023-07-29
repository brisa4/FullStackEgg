package Guia5.Ejercicios;

import java.util.Arrays;

public class Ejercicio5 {
   public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz original:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
        int[][] traspuestaCambiadaDeSigno = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                traspuestaCambiadaDeSigno[j][i] = -matriz[i][j];
            }
        }
        System.out.println("Traspuesta cambiada de signo:");
        for (int[] fila : traspuestaCambiadaDeSigno) {
            System.out.println(Arrays.toString(fila));
        }
        boolean esAntisimetrica = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != -traspuestaCambiadaDeSigno[i][j]) {
                    esAntisimetrica = false;
                    break;
                }
            }
            if (!esAntisimetrica) {
                break;
            }
        }
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }  
}
