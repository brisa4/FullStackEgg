package main;

import entidad.Persona;

public class Main {
  public static void main (String[]args) {
    Persona persona1 = new Persona ("brisa",1234567,18);
    
    System.out.println(persona1.getNombre());
    System.out.println(persona1.getDni());
    System.out.println(persona1.getEdad());

  }
}