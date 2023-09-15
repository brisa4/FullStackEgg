package EjercicioExtra2.main;

import EjercicioExtra2.entidad.Edificio;
import EjercicioExtra2.entidad.EdificioDeOficina;
import EjercicioExtra2.entidad.Polideportivo;
import java.util.ArrayList;
import java.util.List;

public class Main {
 public static void main(String[] args) {
        List<Edificio> edificios = new ArrayList<>();

        Polideportivo polideportivo1 = new Polideportivo(50, 30, 60, "Polideportivo 1", "Techado");
        Polideportivo polideportivo2 = new Polideportivo(40, 20, 80, "Polideportivo 2", "Abierto");
        EdificioDeOficina edificio1 = new EdificioDeOficina(25, 15, 10, 20, 10, 5);
        EdificioDeOficina edificio2 = new EdificioDeOficina(30, 20, 15, 30, 12, 7);

        edificios.add(polideportivo1);
        edificios.add(polideportivo2);
        edificios.add(edificio1);
        edificios.add(edificio2);

        for (Edificio edificio : edificios) {
            System.out.println("Superficie del edificio: " + edificio.calcularSuperficie());
            System.out.println("Volumen del edificio: " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println("Tipo de instalación: " + polideportivo.getTipoInstalacion());
            } else if (edificio instanceof EdificioDeOficina) {
                EdificioDeOficina edificioDeOficina = (EdificioDeOficina) edificio;
                System.out.println("Cantidad de personas en un piso: " + edificioDeOficina.cantPersonas());
            }
            System.out.println();
        }
    }
}
