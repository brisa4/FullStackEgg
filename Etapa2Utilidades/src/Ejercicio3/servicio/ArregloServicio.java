package Ejercicio3.servicio;

import java.util.Arrays;

public class ArregloServicio {
  public void inicializarA(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 10;
        }
        System.out.println("-----------------------------------");
    }
    public void mostrarArreglo(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
        System.out.println("-----------------------------------");
    }
    public void mostrarArregloMayorAMenor(double[] arreglo) {
        Arrays.sort(arreglo);
        mostrarArreglo(arreglo);
    }  
     public void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, arregloB.length / 2);
        Arrays.fill(arregloB, arregloB.length / 2, arregloB.length, 0.5);
    }
}
