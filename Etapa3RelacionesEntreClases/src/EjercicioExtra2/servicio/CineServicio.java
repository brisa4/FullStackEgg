package EjercicioExtra2.servicio;

import EjercicioExtra2.entidad.Asiento;
import EjercicioExtra2.entidad.Cine;
import EjercicioExtra2.entidad.Espectador;
import java.util.Random;
import java.util.Scanner;

public class CineServicio {
  public Cine simulacion() {
        Cine cine = new Cine();
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int espectadores = random.nextInt(100);
        Asiento[][] sala = cine.getSala().getAsientos();
        mostrarSala(cine);
        boolean salaLlena = false;
        for (int i = 0; i < espectadores; i++) {
            Espectador espectador = new Espectador();
            espectador.setNombre(String.valueOf(i));
            espectador.setEdad(random.nextInt(100));
            espectador.setDinero(random.nextInt(1000));
            if (espectador.getEdad() >= cine.getPelicula().getEdadMinima() && espectador.getDinero() > cine.getPrecioEntrada()) {
                int fila;
                int columna;
                int contador = 0;
                do {
                    columna = random.nextInt(6);
                    fila = random.nextInt(8);
                    contador++;
                    if (contador > 150) {
                        salaLlena = true;
                        break;
                    }
                } while (cine.getSala().getAsientos()[fila][columna].isOcupado());
                if (salaLlena) {
                    System.out.println("SE LLENÓ LA SALA, PESADO");
                    break;
                } else {
                    Asiento asiento = sala[fila][columna];
                    asiento.setNombre(asiento.getNombre() + " X");
                    asiento.setEspectador(espectador);
                    asiento.setOcupado(true);
                    sala[fila][columna] = asiento;
                }
            }
        }
        mostrarSala(cine);
        return cine;
    }

    public void mostrarSala(Cine cine) {
        for (int i = 0; i < cine.getSala().getAsientos().length; i++) {
            for (int j = 0; j < cine.getSala().getAsientos()[0].length; j++) {
                System.out.print(cine.getSala().getAsientos()[i][j] + " |");
            }
            System.out.println();
        }
    }  
}
