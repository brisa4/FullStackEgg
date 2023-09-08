package Ejercicio2.entidad;

import java.util.Random;

public class Revolver {
   private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }
    public int getPosicionActual() {
        return posicionActual;
    }
    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }
    public int getPosicionAgua() {
        return posicionAgua;
    }
    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
     public void llenarRevolver() {
        Random random = new Random();
        this.posicionActual = random.nextInt(6);
        this.posicionAgua = random.nextInt(6);
    }
    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;
    }
    public void siguienteChorro() {
        if (this.posicionActual == 5) {
            this.posicionActual = 0;
        } else {
            this.posicionActual = this.posicionActual + 1;
        }
    }
}
