package Ejercicio1.main;

import Ejercicio1.entidad.Libro;

public class Main {
   public static void main(String[] args) {
        Libro primerLibro = new Libro(12321, "Esta noche", "brisa", 234);
        Libro segundoLibro = new Libro();
        
        segundoLibro.cargarLibro();
        segundoLibro.mostrarLibro();
        primerLibro.mostrarLibro();
    }  
}
