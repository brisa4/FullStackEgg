package Ejercicio2y3.servicio;

import Ejercicio2y3.entidad.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }
    public String comprobarColor(String color) {
        color = color.toLowerCase();
        if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
            return color;
        } else {
            return "blanco";
        }
    }
    public Electrodomestico crearElectrodomestico() {
        System.out.println("Ingrese el precio del electrodomestico");
        double precio = leer.nextDouble() + 1000;
        System.out.println("Ingresa el color");
        String color = comprobarColor(leer.next());
        System.out.println("Ingresa el tipo de consumo");
        char consumo = comprobarConsumoEnergetico(leer.next().charAt(0));
        System.out.println("Ingresa el peso");
        int peso = leer.nextInt();
        return new Electrodomestico(precio, color, consumo, peso);
    }
    public double precioFinal(Electrodomestico electrodomestico) {
        switch (electrodomestico.getConsumoEnergetico()) {
            case 'A':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 1000);
                break;
            case 'B':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 800);
                break;
            case 'C':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 600);
                break;
            case 'D':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 500);
                break;
            case 'E':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 300);
                break;
            case 'F':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 100);
                break;
        }
        if (electrodomestico.getPeso() >= 1 && electrodomestico.getPeso() <= 19) {
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 100);
        } else if (electrodomestico.getPeso() >= 20 && electrodomestico.getPeso() <= 49) {
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 500);
        } else if (electrodomestico.getPeso() >= 50 && electrodomestico.getPeso() <= 79) {
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 800);
        } else {
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 1000);
        }
        return electrodomestico.getPrecio();
    }
}
