package EjercicioExtra3.main;

import EjercicioExtra3.entidad.Libro;
import EjercicioExtra3.servicio.LibroServicio;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibroServicio libreria = new LibroServicio();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el número de ejemplares: ");
                    int numEjemplares = scanner.nextInt();
                    Libro libro = new Libro(titulo, autor, numEjemplares);
                    libreria.agregarLibro(libro);
                    System.out.println("Libro agregado.");
                    break;
                case 2:
                    System.out.print("Ingrese el título del libro a prestar: ");
                    String tituloPrestar = scanner.nextLine();
                    Libro libroPrestar = libreria.buscarLibro(tituloPrestar);
                    if (libroPrestar != null) {
                        libroPrestar.prestar();
                    } else {
                        System.out.println("El libro no existe en la librería.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el título del libro a devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    Libro libroDevolver = libreria.buscarLibro(tituloDevolver);
                    if (libroDevolver != null) {
                        libroDevolver.devolucion();
                    } else {
                        System.out.println("El libro no existe en la librería.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de libros en la librería:");
                    System.out.println(libreria.toString());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }  
}
