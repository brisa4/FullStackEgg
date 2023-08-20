package Ejercicio3.main;

import Ejercicio3.servicio.ArregloServicio;


public class Main {
  public static void main(String[] args) {
        ArregloServicio arrS = new ArregloServicio();
        double[] A = new double[50];
        double[] B = new double[20];

        arrS.inicializarA(A);
        arrS.mostrarArreglo(A);
        arrS.mostrarArregloMayorAMenor(A);
        arrS.inicializarB(A, B);
        arrS.mostrarArreglo(A);
        arrS.mostrarArreglo(B);
    }  
}
