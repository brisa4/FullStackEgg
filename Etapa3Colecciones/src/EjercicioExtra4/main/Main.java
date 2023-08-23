package EjercicioExtra4.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        Map<String, String> codigosPostales = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        codigosPostales.put("28001", "Madrid");
        codigosPostales.put("08001", "Barcelona");
        codigosPostales.put("41001", "Sevilla");
        codigosPostales.put("46001", "Valencia");
        codigosPostales.put("28002", "Madrid");
        codigosPostales.put("28003", "Madrid");
        codigosPostales.put("50001", "Zaragoza");
        codigosPostales.put("15001", "A Coruña");
        codigosPostales.put("29001", "Málaga");
        codigosPostales.put("07001", "Palma de Mallorca");

        System.out.println("Ingrese los datos de 10 códigos postales y sus ciudades:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Código Postal: ");
            String codigoPostal = scanner.nextLine();
            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine();
            codigosPostales.put(codigoPostal, ciudad);
        }
        System.out.println("\nDatos introducidos:");
        for (Map.Entry<String, String> entry : codigosPostales.entrySet()) {
            System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
        }
        System.out.print("\nIngrese un código postal para buscar la ciudad: ");
        String codigoBuscar = scanner.nextLine();
        if (codigosPostales.containsKey(codigoBuscar)) {
            System.out.println("Ciudad asociada: " + codigosPostales.get(codigoBuscar));
        } else {
            System.out.println("El código postal no existe en el mapa.");
        }
        System.out.print("\nIngrese un código postal y su ciudad para agregar al mapa:\nCódigo Postal: ");
        String codigoAgregar = scanner.nextLine();
        System.out.print("Ciudad: ");
        String ciudadAgregar = scanner.nextLine();
        codigosPostales.put(codigoAgregar, ciudadAgregar);

        System.out.println("\nDatos actualizados:");
        for (Map.Entry<String, String> entry : codigosPostales.entrySet()) {
            System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("\nIngrese una ciudad para eliminar del mapa: ");
            String ciudadEliminar = scanner.nextLine();
            boolean removed = codigosPostales.values().removeIf(value -> value.equalsIgnoreCase(ciudadEliminar));
            if (removed) {
                System.out.println("Ciudad eliminada: " + ciudadEliminar);
            } else {
                System.out.println("La ciudad no se encuentra en el mapa.");
            }
        }
        System.out.println("\nDatos finales:");
        for (Map.Entry<String, String> entry : codigosPostales.entrySet()) {
            System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
        }
        scanner.close();
    }  
}
