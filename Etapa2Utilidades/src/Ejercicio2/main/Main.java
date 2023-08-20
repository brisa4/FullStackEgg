package Ejercicio2.main;

import Ejercicio2.entidad.ParDeNumeros;
import Ejercicio2.serviio.ParDeNumerosServicio;

public class Main {
   public static void main(String[] args) {
        ParDeNumeros numeros = new ParDeNumeros();

        ParDeNumerosServicio numerosService = new ParDeNumerosServicio();

        System.out.println("Valores de los números:");
        numerosService.mostrarValores(numeros);
        System.out.println();

        double mayor = numerosService.devolverMayor(numeros);
        System.out.println("El mayor de los dos números es: " + mayor);
        System.out.println();

        double potencia = numerosService.calcularPotencia(numeros);
        System.out.println("La potencia del mayor valor elevado al menor número es: " + potencia);
        System.out.println();

        double raiz = numerosService.calcularRaiz(numeros);
        System.out.println("La raíz cuadrada del menor valor es: " + raiz);
    }  
}
