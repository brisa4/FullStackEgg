package DeteccionDeErrores.Dos2;

import java.util.HashMap;

public class Ejercicio2 {
   public static void main(String[] args) {
   HashMap<Integer, String> personas = new HashMap<>();
   personas.put(1, "Albus");
   personas.put(2, "Severus");
   String n1 = personas.get(1);
   String n2 = personas.get(2);
   System.out.println(n1);
   System.out.println(n2);
}
}