package EjercicioExtra1.Estancia.servicio;

import EjercicioExtra1.Estancia.Entidades.Comentario;
import EjercicioExtra1.Estancia.persistencia.ComentarioDAO;
import java.sql.Connection;
import java.util.List;

public class ComentarioServicio {
    private ComentarioDAO comentarioDAO;

    public ComentarioServicio(Connection connection) {
        this.comentarioDAO = new ComentarioDAO(connection);
    }
    public Comentario obtenerComentarioPorId(int id) {
        return comentarioDAO.getComentarioById(id); // Manejo de excepciones, log o rethrow según sea necesario
    }
    public List<Comentario> obtenerComentariosDeCasa(int idCasa) {
        return comentarioDAO.getComentariosByCasaId(idCasa); // Manejo de excepciones, log o rethrow según sea necesario
    }
    public boolean agregarComentario(Comentario comentario) {
        return comentarioDAO.insertComentario(comentario); // Manejo de excepciones, log o rethrow según sea necesario
    }
    public boolean actualizarComentario(Comentario comentario) {
        return comentarioDAO.updateComentario(comentario); // Manejo de excepciones, log o rethrow según sea necesario
    }
    public boolean eliminarComentario(int id) {
        return comentarioDAO.deleteComentario(id); // Manejo de excepciones, log o rethrow según sea necesario
    }
}

