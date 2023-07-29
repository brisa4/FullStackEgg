package Guia5.Extra;

import java.util.Scanner;

public class Extra4 {
  public static void main(String[] args) {
        int cantidadAlumnos = 10;
        int aprobados = 0;
        int desaprobados = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= cantidadAlumnos; i++) {
            System.out.println("Alumno " + i);

            double promedio = (obtenerNota(scanner, "Primer trabajo práctico evaluativo") * 0.1)
                    + (obtenerNota(scanner, "Segundo trabajo práctico evaluativo") * 0.15)
                    + (obtenerNota(scanner, "Primer integrador") * 0.25)
                    + (obtenerNota(scanner, "Segundo integrador") * 0.5);

            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
    public static double obtenerNota(Scanner scanner, String mensaje) {
        System.out.print("Ingrese la nota del " + mensaje + ": ");
        return scanner.nextDouble();
    }    
}
