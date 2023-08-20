package EjercicioExtra1.main;

import EjercicioExtra1.entidad.Mes;
import EjercicioExtra1.servicio.MesServicio;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        MesServicio mesesService = new MesServicio();
        Mes mesSecreto = mesesService.obtenerMesSecreto();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adivina el mes secreto. Introduce el nombre del mes en minúsculas: ");
        String intento = scanner.nextLine();

        while (!intento.equals(mesSecreto.getNombre())) {
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            intento = scanner.nextLine();
        }
        System.out.println("¡Ha acertado!");
        scanner.close();
    }  
}
