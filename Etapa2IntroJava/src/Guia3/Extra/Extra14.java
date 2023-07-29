package Guia3.Extra;

import java.util.Scanner;

public class Extra14 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa cuántas familias son");
        int nFamilias = leer.nextInt();
        int totalHijos = 0;
        int totalEdades = 0;
        for (int i = 0; i < nFamilias; i++) {
            System.out.println("Ingrese cuántos hijos tiene la familia " + (i + 1));
            int cantidadHijos = leer.nextInt();
            totalHijos += cantidadHijos;
            for (int j = 0; j < cantidadHijos; j++) {
                System.out.println("Ingresa la edad del hijo " + (j + 1));
                int edadHijo = leer.nextInt();
                totalEdades += edadHijo;
            }
        }
        double edadMedia = (double) totalEdades / totalHijos;
        System.out.println("La edad media de los hijos de todas las familias es de " + edadMedia);
    }    
}
