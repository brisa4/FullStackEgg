package EjercicioExtra2.servicio;

import java.util.Scanner;
import EjercicioExtra2.entidad.Ahorcado;

public class AhorcadoServicio {
  Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego() {
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("Ingrese la palabra a adivinar");
        String palabraABuscar = leer.next();
        char[] palabra = new char[longitud(palabraABuscar)];
        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = palabraABuscar.charAt(i);
        }
        ahorcado.setPalabraABuscar(palabra);
        System.out.println("Ingrese la cantidad de jugadas máxima");
        ahorcado.setCantidadDeJugadas(leer.nextInt());
        boolean finDeIntentos;
        boolean palabraEncontrada;
        do {
            System.out.println("Ingrese la letra a buscar");
            char letra = leer.next().charAt(0);
            encontradas(letra, ahorcado);
            finDeIntentos = ahorcado.getCantidadDeJugadas() > 0;
            palabraEncontrada = palabraEncontrada = ahorcado.getLetrasEncontradas() == ahorcado.getPalabraABuscar().length;
            if (palabraEncontrada) {
                System.out.println("----------------------------------");
                System.out.println("----------------------------------");
                System.out.println("Felicidades!! Ganaste");
                System.out.println("----------------------------------");
                System.out.println("----------------------------------");
                break;
            } else if (!finDeIntentos) {
                System.out.println("----------------------------------");
                System.out.println("----------------------------------");
                System.out.println("Perdiste!! :c");
                System.out.println("----------------------------------");
                System.out.println("----------------------------------");
                break;
            }
        } while (true);
    }

    public int longitud(String palabra) {
        return palabra.length();
    }

    public boolean buscarLetra(char letra, Ahorcado ahorcado) {

        boolean letraEncontrada = false;
        char[] palabra = ahorcado.getPalabraABuscar();
        for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
            if (letra == palabra[i]) {
                letraEncontrada = true;
                break;
            }
        }
        if (letraEncontrada) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra NO pertenece a la palabra");
        }
        return letraEncontrada;
    }
    public boolean encontradas(char letra, Ahorcado ahorcado) {
        boolean letraEncontrada = buscarLetra(letra, ahorcado);
        char[] palabra = ahorcado.getPalabraABuscar();
        if (letraEncontrada) {
            for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
                if (letra == palabra[i]) {
                    letraEncontrada = true;
                    ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                }
            }
        } else {
            ahorcado.setCantidadDeJugadas(ahorcado.getCantidadDeJugadas() - 1);
            intentos(ahorcado);
        }
        int faltantes = ahorcado.getPalabraABuscar().length - ahorcado.getLetrasEncontradas();
        System.out.println("Faltan " + faltantes + " letras");
        return letraEncontrada;
    }
    public void intentos(Ahorcado ahorcado) {
        System.out.println("Te quedan " + ahorcado.getCantidadDeJugadas() + " intentos campeón");
    }
    public void juego() {
        crearJuego();
    }  
}
