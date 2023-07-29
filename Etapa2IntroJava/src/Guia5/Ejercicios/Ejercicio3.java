package Guia5.Ejercicios;

import java.util.Random;

public class Ejercicio3 {
   public static void main(String[] args) {
      Random random = new Random();
  int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*99999)+1;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " - ");
        } 
        int [] digitos = new int[5];
        for (int i = 0; i < num.length; i++) {
            int numero=num[i];
            int digitosn = String.valueOf(numero).length();
            switch (digitosn) {
                case 1:
                    digitos[0]++;
                    break;
                case 2:
                    digitos[1]++;
                    break;
                case 3:
                    digitos[2]++;
                    break;
                case 4:
                    digitos[3]++;
                    break;
                case 5:
                    digitos[4]++;
                    break;
        }
       }
        System.out.println("");
        System.out.println("Un Digito: " + digitos[0]);
        System.out.println("dos Digito: " + digitos[1]);
        System.out.println("tres Digito: " + digitos[2]);
        System.out.println("cuatro Digito: " + digitos[3]);
        System.out.println("cinco Digito: " + digitos[4]);
}   
}
