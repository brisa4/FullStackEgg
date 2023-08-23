package Ejercicio1y2.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        ArrayList<String> razaPerros = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean bucle = true;
        do {
            System.out.println("Ingresa una raza de perro");
            razaPerros.add(leer.next().toUpperCase());
            System.out.println("Desea agregar otro perro? S/N");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("N")) {
                bucle = false;
            }
        } while (bucle);
        for (String razaPerro : razaPerros) {
            System.out.println(razaPerro);
        }  
        System.out.println("Ingrese el nombre de la raza que desea eliminar");
        String razaEliminar = leer.next().toUpperCase();
        boolean noEncontrado = true;
        Iterator it = razaPerros.iterator();
        System.out.println("---------------------------------");
        while (it.hasNext()) {
            if (it.next().equals(razaEliminar)) {
                it.remove();
                noEncontrado = false;
                break;
            }
        }
        Collections.sort(razaPerros);
        for (String razaPerro : razaPerros) {
            System.out.println(razaPerro);
        }
        if (noEncontrado) {
            System.out.println("NO se encontró la raza que desea eliminar");
        }
    }
}
