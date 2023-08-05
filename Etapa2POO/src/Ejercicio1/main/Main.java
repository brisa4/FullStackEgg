package Ejercicio1.main;

import Ejercicio1.entidad.Libro;

public class Main {
  public static void main(String[] args) {
        Libro primerLibro = new Libro(12321, "Esta noche digo adios", "Jeremias", 234);
        Libro segundoLibro = new Libro();
        
        segundoLibro.cargarLibro();
        segundoLibro.mostrarLibro();
        primerLibro.mostrarLibro();
    }  
       
}