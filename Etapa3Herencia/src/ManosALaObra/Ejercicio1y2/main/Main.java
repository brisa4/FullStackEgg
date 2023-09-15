package ManosALaObra.Ejercicio1y2.main;

import ManosALaObra.Ejercicio1y2.entidad.Animal;
import ManosALaObra.Ejercicio1y2.entidad.Gato;
import ManosALaObra.Ejercicio1y2.entidad.Perro;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        animales.add(a);
        animales.add(b);
        animales.add(c);
        for (Animal animal : animales) {
            animal.hacerRuido();
        }
    }  
}
