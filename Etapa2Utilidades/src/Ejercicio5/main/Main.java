package Ejercicio5.main;

import Ejercicio5.entidad.Persona;
import Ejercicio5.servicio.PersonaServicio;

public class Main {
   public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();

        Persona persona = personaServicio.crearPersona();

        int edad = personaServicio.calcularEdad(persona);
        System.out.println("La edad de " + persona.getNombre() + " es: " + edad + " años");

        int edadComparar = 30;
        boolean esMenor = personaServicio.menorQue(persona, edadComparar);
        System.out.println(persona.getNombre() + (esMenor ? " es" : " no es") + " menor que " + edadComparar + " años");

        System.out.println("Información de la persona:");
        personaServicio.mostrarPersona(persona);
    }  
}
