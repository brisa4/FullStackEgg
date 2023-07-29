package Guia3.Extra;

public class Extra2 {
  public static void main(String[] args) {
        int A = 0, B = 3, C = 5, D = 6;
        System.out.println("Valores iniciales: A=" + A + ", B=" + B + ", C=" + C + ", D=" + D);
        if (A != B && B != C && C != D) {
            int aux = B;
            B = C;
            C = A;
            A = D;
            D = aux;
        } else {
            System.out.println("Los valores son iguales");
        }
        System.out.println("Valores finales: A=" + A + ", B=" + B + ", C=" + C + ", D=" + D);
    }    
}
