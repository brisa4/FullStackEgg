package Ejercicio3.main;

import Ejercicio3.entidad.Operacion;

public class Main {
  public static void main(String[] args) {
        Operacion operacion1 = new Operacion();

        operacion1.crearOperacion();
        operacion1.sumar();
        operacion1.restar();
        operacion1.multiplicar();
        operacion1.dividir();
    }  
}
