package EjercicioExtra1.Estancia.main;

import java.util.Scanner;

public class JDBC {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú de Consultas a la Base de Datos:");
            System.out.println("a) Listar familias con al menos 3 hijos menores de 10 años.");
            System.out.println("b) Buscar casas disponibles en Reino Unido en agosto de 2020.");
            System.out.println("c) Listar familias con correo de Hotmail.");
            System.out.println("d) Consultar casas disponibles a partir de una fecha y duración.");
            System.out.println("e) Listar clientes y descripción de la casa donde realizaron una estancia.");
            System.out.println("f) Listar estancias de clientes con información de la casa.");
            System.out.println("g) Incrementar precio por día en un 5% de casas en el Reino Unido.");
            System.out.println("h) Obtener el número de casas por país.");
            System.out.println("i) Listar casas en el Reino Unido con comentarios 'limpias'.");
            System.out.println("j) Insertar nuevas estancias verificando disponibilidad.");
            System.out.println("k) Salir");
            System.out.print("Elija una opción (a-k): ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Realizando consulta a)...");
                    break;
                case "b":
                    System.out.println("Realizando consulta b)...");
                    break;
                case "c":
                    System.out.println("Realizando consulta c)...");
                    break;
                case "d":
                    System.out.println("Realizando consulta d)...");
                    break;
                case "e":
                    System.out.println("Realizando consulta e)...");
                    break;
                case "f":
                    System.out.println("Realizando consulta f)...");
                    break;
                case "g":
                    System.out.println("Realizando consulta g)...");
                    break;
                case "h":
                    System.out.println("Realizando consulta h)...");
                    break;
                case "i":
                    System.out.println("Realizando consulta i)...");
                    break;
                case "j":
                    System.out.println("Realizando consulta j)...");
                    break;
                case "k":
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
        scanner.close();
    }  
}
