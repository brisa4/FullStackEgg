package Guia4.Manos.a.la.obra;

import java.util.Scanner;

public class Manosalalobra1 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        do {
            System.out.println("Ingrese una palabra o frase que termine con un punto:");
            palabra = leer.nextLine();
        } while (!palabra.endsWith("."));
        cambiarLetras(palabra);
    }

    public static void cambiarLetras(String palabra) {
        String palabraAuxiliar = "";
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.substring(i, i + 1)) {
                case "a":
                case "A":
                    palabraAuxiliar = palabraAuxiliar.concat("@");
                    break;
                case "e":
                case "E":
                    palabraAuxiliar = palabraAuxiliar.concat("#");
                    break;
                case "i":
                case "I":
                    palabraAuxiliar = palabraAuxiliar.concat("$");
                    break;
                case "o":
                case "O":
                    palabraAuxiliar = palabraAuxiliar.concat("%");
                    break;
                case "u":
                case "U":
                    palabraAuxiliar = palabraAuxiliar.concat("*");
                    break;
                default:
                    palabraAuxiliar = palabraAuxiliar.concat(palabra.substring(i, i + 1));
            }
        }
        System.out.println("La palabra cambiada es: " + palabraAuxiliar);  
}  
}
