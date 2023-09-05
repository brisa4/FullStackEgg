
package DeteccionDeErrores.Tres3;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3 {
  public static void main(String[] args) {
  ArrayList<String> bebidas = new ArrayList();  
  bebidas.add("café");
  bebidas.add("té");
  Iterator<String> it = bebidas.iterator();
  while (it.hasNext()) {
            String bebida = it.next();
            if (bebida.equals("café")) {
                it.remove();
            }
        }
  for (String bebida : bebidas) {
            System.out.println(bebida);
        }
  }
}
