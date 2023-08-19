package EjercicioExtra4.entidad;

import java.util.Scanner;

public class Cuenta {
  private int base;
    private int altura;

    public Cuenta() {
    }
    
    public Cuenta(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base");
        this.base = (leer.nextInt());
        System.out.println("Ingrese la altura");
        this.altura = (leer.nextInt());
    }
    public void calcularSuperficie() {
        int superficie = this.base * this.altura;
        System.out.println("La superficie del rectángulo es: " + superficie);
    }
    public void calcularPerimetro() {
        int perimetro = (this.base + this.altura) * 2;
        System.out.println("La superficie del rectángulo es: " + perimetro);
    }  
}
