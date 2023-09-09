package Ejercicio1.main;

import Ejercicio1.entidad.Perro;
import Ejercicio1.entidad.Persona;

public class Main {
  public static void main(String[] args) {
        Persona[] personas = new Persona[2];
        personas[0] = new Persona("Jeremias", "Rivelli", 28, 12345, null);
        personas[1] = new Persona("Jorge", "Lanatta", 21312, 123, null);
        Perro[] perros = new Perro[2];
        perros[0] = new Perro("Chiquito", "Rotwailer", 2, "chiquito");
        perros[1] = new Perro("Cartucho", "Chihuahua", 1, "grande");

        for (int i = 0; i < personas.length; i++) {
            personas[i].setPerro(perros[i]);
        }
        
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }  
}
