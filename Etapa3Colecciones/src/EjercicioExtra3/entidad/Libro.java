package EjercicioExtra3.entidad;

public class Libro {
  private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    public Libro(String titulo, String autor, int numEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getNumEjemplares() {
        return numEjemplares;
    }
    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }
    public void prestar() {
        if (numEjemplares > numEjemplaresPrestados) {
            numEjemplaresPrestados++;
            System.out.println("Libro prestado: " + titulo);
        } else {
            System.out.println("No quedan ejemplares disponibles para prestar de: " + titulo);
        }
    }
    public void devolucion() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            System.out.println("Libro devuelto: " + titulo);
        } else {
            System.out.println("No hay ejemplares prestados de: " + titulo);
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                ", Autor: " + autor +
                ", Ejemplares disponibles: " + (numEjemplares - numEjemplaresPrestados);
    }  
}
