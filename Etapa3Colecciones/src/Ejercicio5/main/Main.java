package Ejercicio5.main;

import java.util.HashSet;
import java.util.Scanner;
import Ejercicio5.servicio.PaisServicio;

public class Main {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisServicio ps = new PaisServicio();
        HashSet<String> paises = ps.cargarPaises(leer);
        System.out.println("Ordenar y mostrar");
        System.out.println("------------------------");
        ps.ordernarYmostrar(paises);
        System.out.println("Eliminar pais");
        System.out.println("------------------------");
        ps.eliminarPais(paises, leer);
        System.out.println("Mostrar");
        System.out.println("------------------------");
        ps.ordernarYmostrar(paises);
    }  
}
