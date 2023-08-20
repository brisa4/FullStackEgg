package EjercicioExtra2.entidad;

public class Ahorcado {
  private char[] palabraABuscar;
    private int letrasEncontradas = 0;
    private int cantidadDeJugadas;

    public Ahorcado(char[] palabraABuscar, int letrasEncontradas, int cantidadDeJugadas) {
        this.palabraABuscar = palabraABuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadDeJugadas = cantidadDeJugadas;
    }

    public Ahorcado() {
    }
    public char[] getPalabraABuscar() {
        return palabraABuscar;
    }
    public void setPalabraABuscar(char[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }
    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }
    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    public int getCantidadDeJugadas() {
        return cantidadDeJugadas;
    }
    public void setCantidadDeJugadas(int cantidadDeJugadas) {
        this.cantidadDeJugadas = cantidadDeJugadas;
    }  
}
