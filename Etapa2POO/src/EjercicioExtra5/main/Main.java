package EjercicioExtra5.main;

import EjercicioExtra5.entidad.Empleado;

public class Main {
  public static void main(String[] args) {
        Empleado empleado1 = new Empleado("brisa", 18, 20000);
        Empleado empleado2 = new Empleado("uma", 14, 20000);

        System.out.println("El sueldo del empleado 1 es: " + empleado1.getSalario());
        System.out.println("El sueldo del empleado 2 es: " + empleado2.getSalario());
        empleado1.calcular_aumento();
        empleado2.calcular_aumento();
        System.out.println("El sueldo del empleado 1 es: " + empleado1.getSalario());
        System.out.println("El sueldo del empleado 2 es: " + empleado2.getSalario()); 
    }  
}
