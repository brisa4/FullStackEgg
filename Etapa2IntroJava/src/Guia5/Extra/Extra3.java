package Guia5.Extra;

import java.util.Scanner;

public class Extra3 {
  public static void main(String[] args) {
        int[] vec = new int[5];
        rellenarVector(vec);
        imprimirVector(vec);
    }
    public static void rellenarVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 10);
        }
    }
    public static void imprimirVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " - ");
        }
    }    
}
