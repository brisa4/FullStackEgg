package Ejercicio1.main;

import Ejercicio1.entidad.Animal;
import Ejercicio1.entidad.Gato;
import Ejercicio1.entidad.Perro;

public class Main {
  public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.alimentarse();
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.alimentarse();
        Animal caballo1 = new Perro("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();
    }  
}
