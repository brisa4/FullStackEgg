package EjercicioExtra2.main;

import EjercicioExtra2.servicio.CantanteFamosoServicio;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
   public static void mostrarCantantes(ArrayList<CantanteFamosoServicio> cantantes) {
        for (CantanteFamosoServicio cantante : cantantes) {
            System.out.println("Nombre: " + cantante.getNombre() + ", Disco con más ventas: " + cantante.getDiscoConMasVentas());
        }
    }

    public static void main(String[] args) {
        ArrayList<CantanteFamosoServicio> cantantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        cantantes.add(new CantanteFamosoServicio("Cantante1", "Disco1"));
        cantantes.add(new CantanteFamosoServicio("Cantante2", "Disco2"));
        cantantes.add(new CantanteFamosoServicio("Cantante3", "Disco3"));
        cantantes.add(new CantanteFamosoServicio("Cantante4", "Disco4"));
        cantantes.add(new CantanteFamosoServicio("Cantante5", "Disco5"));

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el nombre del cantante: ");
                String nombre = scanner.next();
                System.out.print("Ingrese el disco con más ventas: ");
                String disco = scanner.next();
                cantantes.add(new CantanteFamosoServicio(nombre, disco));
            } else if (opcion == 2) {
                mostrarCantantes(cantantes);
            } else if (opcion == 3) {
                System.out.print("Ingrese el nombre del cantante que desea eliminar: ");
                String nombre = scanner.next();
                Iterator<CantanteFamosoServicio> iterator = cantantes.iterator();
                while (iterator.hasNext()) {
                    CantanteFamosoServicio cantante = iterator.next();
                    if (cantante.getNombre().equals(nombre)) {
                        iterator.remove();
                    }
                }
            } else if (opcion == 4) {
                break;
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }

        System.out.println("\nLista de cantantes final:");
        mostrarCantantes(cantantes);
    } 
}
