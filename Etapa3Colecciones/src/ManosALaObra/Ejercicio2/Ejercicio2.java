package ManosALaObra.Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio2 {
  public static void main(String[] args) {
        ArrayList<Integer> numerosA = new ArrayList<>();
        numerosA.add(10);
        numerosA.add(20);
        numerosA.add(30);
        numerosA.add(40);
        numerosA.add(50);
        numerosA.remove(2);

        HashSet<Integer> numerosB = new HashSet<>();
        numerosB.add(5);
        numerosB.add(15);
        numerosB.add(25);
        numerosB.add(35);
        numerosB.add(45);
        numerosB.remove(25);

        HashMap<Integer, String> alumnos = new HashMap<>();
        alumnos.put(12345678, "Juan");
        alumnos.put(23456789, "Ana");
        alumnos.put(34567890, "Carlos");
        alumnos.put(45678901, "Elena");
        alumnos.put(56789012, "Luisa");
        alumnos.remove(34567890);
    }  
}
//Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
//cada forma que aprendiste arriba.