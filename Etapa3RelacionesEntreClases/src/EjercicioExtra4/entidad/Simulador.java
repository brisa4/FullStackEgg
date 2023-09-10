package EjercicioExtra4.entidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Simulador {
 private static final String[] NOMBRES = {"Juan", "Maria", "Carlos", "Ana", "Pedro", "Laura", "Diego", "Sofia", "Luis", "Elena"};
    private static final String[] APELLIDOS = {"Perez", "Lopez", "Gonzalez", "Rodriguez", "Martinez", "Fernandez", "Sanchez", "Torres"};

    public List<Alumno> generarListaAlumnosAleatorios(int cantidad) {
        Random rand = new Random();
        Set<String> nombresCompletosUsados = new HashSet<>();
        List<Alumno> listaAlumnos = new ArrayList<>();

        while (listaAlumnos.size() < cantidad) {
            String nombreCompleto;
            do {
                String nombre = NOMBRES[rand.nextInt(NOMBRES.length)];
                String apellido = APELLIDOS[rand.nextInt(APELLIDOS.length)];
                nombreCompleto = nombre + " " + apellido;
            } while (nombresCompletosUsados.contains(nombreCompleto));

            nombresCompletosUsados.add(nombreCompleto);
            listaAlumnos.add(new Alumno(nombreCompleto, ""));
        }

        return listaAlumnos;
    }
    public List<String> generarListaDnis(int cantidad) {
        List<String> listaDnis = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            int dni = rand.nextInt(89999999) + 10000000; // Genera un DNI de 8 dígitos
            listaDnis.add(String.valueOf(dni));
        }
        return listaDnis;
    }
    public void asignarNombresYDnis(List<Alumno> alumnos, List<String> dnis) {
        if (alumnos.size() != dnis.size()) {
            throw new IllegalArgumentException("La cantidad de alumnos y DNI debe ser la misma.");
        }

        for (int i = 0; i < alumnos.size(); i++) {
            alumnos.get(i).setDni(dnis.get(i));
        }
    }
    public void imprimirListaAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    public List<Voto> votacion(List<Alumno> listaAlumnos) {
        List<Voto> votos = new ArrayList<>();
        Random rand = new Random();

        for (Alumno votante : listaAlumnos) {
            Set<Alumno> votados = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                Alumno votado;
                do {
                    votado = listaAlumnos.get(rand.nextInt(listaAlumnos.size()));
                } while (votado == votante || votados.contains(votado));
                votados.add(votado);
                votado.incrementarVotos();
            }
            Voto voto = new Voto(votante);
            voto.getAlumnosVotados().addAll(votados);
            votos.add(voto);
        }
        return votos;
    }
    public void mostrarResultadosVotacion(List<Voto> votos) {
        for (Voto voto : votos) {
            System.out.println(voto);
        }
    }
    public void contarVotos(List<Alumno> alumnos) {
        alumnos.sort((a1, a2) -> Integer.compare(a2.getCantidadVotos(), a1.getCantidadVotos()));

        System.out.println("\nFacilitadores:");
        for (int i = 0; i < Math.min(5, alumnos.size()); i++) {
            Alumno facilitador = alumnos.get(i);
            System.out.println("Facilitador " + (i + 1) + ": " + facilitador);
        }
        if (alumnos.size() > 5) {
            System.out.println("\nFacilitadores Suplentes:");
            for (int i = 5; i < Math.min(10, alumnos.size()); i++) {
                Alumno suplente = alumnos.get(i);
                System.out.println("Suplente " + (i - 4) + ": " + suplente);
            }
        }
    }
}
