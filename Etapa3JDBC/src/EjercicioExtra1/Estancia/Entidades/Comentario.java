package EjercicioExtra1.Estancia.Entidades;

public class Comentario {
  private int idComentario;
  private int idCasa; 
  private String comentario;  
  
  public Comentario() {
    this.idComentario = 0;
    this.idCasa = 0;
    this.comentario = "";
}
public Comentario(int idComentario, int idCasa, String comentario) {
        this.idComentario = idComentario;
        this.idCasa = idCasa;
        this.comentario = comentario;
    }  
    public int getIdComentario() {
        return idComentario;
    }
    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }
    public int getIdCasa() {
        return idCasa;
    }
    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
