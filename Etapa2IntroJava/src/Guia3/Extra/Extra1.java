package Guia3.Extra;

import java.util.Scanner;

public class Extra1 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa un tiempo en minutos");
        int minutos = leer.nextInt();
        int horas = minutos / 60;
        int dias = 0;
        while (horas >= 24) {
            horas -= 24;
            dias++;
        }
        System.out.println("Su equivalente en días es " + dias + " y horas " + horas);
    }  
}
