package ManosALaObra.Ejercicio1.entidad;

public class Dni {
   private char serie;
    private int numero;
    public Dni() {
    }
    public Dni(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }
    public void setSerie(char serie) {
        this.serie = serie;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }  
}
