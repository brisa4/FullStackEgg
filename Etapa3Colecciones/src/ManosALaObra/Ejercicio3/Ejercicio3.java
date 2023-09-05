package ManosALaObra.Ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {
  public static void main(String[] args) {

        ArrayList<String> libros = new ArrayList<>();
        
        libros.add("El Gran Gatsby");
        libros.add("Cien años de soledad");
        libros.add("Matar a un ruiseñor");
        libros.add("1984");
        libros.add("Don Quijote de la Mancha");
        
        System.out.println("Títulos de los libros:");
        for (String libro : libros) {
            System.out.println(libro);
        }
    }  
}
