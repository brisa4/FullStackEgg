package EjercicioExtra1.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese valores numéricos enteros (-99 para finalizar):");
        while (true) {
            int numero = scanner.nextInt();
            if (numero == -99) {
                break;
            }
            numeros.add(numero);
        }
        scanner.close();
        if (numeros.size() > 0) {
            int suma = 0;
            for (int num : numeros) {
                suma += num;
            }
            int cantidadValores = numeros.size();
            double media = (double) suma / cantidadValores;
            System.out.println("Número de valores leídos: " + cantidadValores);
            System.out.println("Suma de los valores: " + suma);
            System.out.println("Media (promedio) de los valores: " + media);
        } else {
            System.out.println("No se han ingresado valores.");
        }
    }  
}
