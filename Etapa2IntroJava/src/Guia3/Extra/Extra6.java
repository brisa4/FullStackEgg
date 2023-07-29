package Guia3.Extra;

import java.util.Scanner;

public class Extra6 {
  public static void main(String[] args){ 
  Scanner leer = new Scanner(System.in);   
  System.out.println("Ingrese la cantidad de personas");
  int cantidadPersonas = leer.nextInt();
  int altura;
  int bajitos = 0;
  int promedioTotal = 0, promedioBajos = 0;
  for (int i = 0; i < cantidadPersonas; i++) {
      System.out.println("Ingrese la altura de la persona");
      altura = leer.nextInt();
      promedioTotal += altura;
      if (altura <= 160) {
      bajitos++;
      promedioBajos += altura;
            }
        }
        promedioTotal /= cantidadPersonas;
        promedioBajos /= bajitos;
        System.out.println("El promedio de personas bajitas es de " + promedioBajos);
        System.out.println("El promedio de personas totales es de " + promedioTotal);
  }  
}
