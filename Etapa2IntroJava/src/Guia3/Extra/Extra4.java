package Guia3.Extra;

import java.util.Scanner;

public class Extra4 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 10");
        int num = leer.nextInt();

        switch (num) {
            case 1: System.out.println("en numeos romanos es: I");
            break;
            case 2: System.out.println("en numeos romanos es: II");
            break;
            case 3: System.out.println("en numeos romanos es: III");
            break;
            case 4: System.out.println("en numeos romanos es: IV");
            break;
            case 5: System.out.println("en numeos romanos es: V");
            break;
            case 6: System.out.println("en numeos romanos es: VI");
            break;
            case 7: System.out.println("en numeos romanos es: VII");
            break;
            case 8: System.out.println("en numeos romanos es: VIII");
            break;
            case 9: System.out.println("en numeos romanos es: IX");
            break;
            case 10: System.out.println("en numeos romanos es: X");
            break;            
        }
    }    
}
