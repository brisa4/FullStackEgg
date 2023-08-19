package EjercicioExtra1.main;

import EjercicioExtra1.entidad.Cancion;

public class Main {
  public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("Merry Christmas Baby", "Elvis Presley");

        cancion1.setAutor("Arjona");
        cancion1.setTitulo("Señora de 4 decadas");
        System.out.println("El nombre de la primer canción es " + cancion1.getTitulo() + " y su autor es " + cancion1.getAutor());
        System.out.println("El nombre de la primer canción es " + cancion2.getTitulo() + " y su autor es " + cancion2.getAutor());
    }  
}
