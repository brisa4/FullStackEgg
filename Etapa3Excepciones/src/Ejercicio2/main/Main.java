package Ejercicio2.main;

public class Main {
  public static void main(String[] args) {
        int[] numeros = new int[2];
        try {
            for (int i = 0; i < 3; i++) {
                numeros[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fuera de rango");
        }
    }  
}
