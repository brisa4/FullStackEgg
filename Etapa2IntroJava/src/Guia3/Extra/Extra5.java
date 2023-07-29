package Guia3.Extra;

import java.util.Scanner;

public class Extra5 {
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char tipoSocio;
        do {
            System.out.println("Ingrese el tipo de socio");
            tipoSocio = leer.next().charAt(0);
        } while (tipoSocio != 'A' && tipoSocio != 'B' && tipoSocio != 'C');

        int cuota = 0;
        System.out.println("Ingrese el costo del tratamiento");
        int importe = leer.nextInt();
        int importeTotal;
        switch (tipoSocio) {
            case 'A':    
                importe *= 0.5;
                break;
            case 'B':
                importe *= 0.65;
                break;
            case 'C':
                cuota = 100;
                break;
        }
        importeTotal = cuota + importe;
        System.out.println("El costo de tratamiento para el socio de tipo " + tipoSocio + " es de " + importeTotal);
}  
}
