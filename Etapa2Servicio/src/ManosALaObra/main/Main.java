package ManosALaObra.main;

import ManosALaObra.entidad.Persona;


public class Main {
   public static void main(String[] args) {

        Persona persona = new Persona("Juan", 30, "juan@example.com");

        mostrarAtributosPersona(persona);
    }

    public static void mostrarAtributosPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Correo Electrónico: " + persona.getCorreoElectronico());
    }  
}
