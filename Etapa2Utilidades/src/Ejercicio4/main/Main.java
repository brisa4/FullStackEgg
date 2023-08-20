package Ejercicio4.main;

import Ejercicio4.servicio.FechaServicio;
import java.util.Date;

public class Main {
   public static void main(String[] args) {
        FechaServicio fechaService = new FechaServicio();

        Date fechaNacimiento = fechaService.fechaNacimiento();

        Date fechaActual = fechaService.fechaActual();

        int edad = fechaService.diferencia(fechaNacimiento, fechaActual);

        System.out.println("Tu edad es: " + edad + " años");
    }  
}
