package EjercicioExtra1.Estancia.persistencia;

import EjercicioExtra1.Estancia.Entidades.Comentario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ComentarioDAO {
  private Connection connection;
    public ComentarioDAO(Connection connection) {
        this.connection = connection;
    }
    public boolean insert(Comentario comentario) {
        String query = "INSERT INTO comentarios (id_casa, comentario) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, comentario.getIdCasa());
            statement.setString(2, comentario.getComentario());

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public List<Comentario> getComentariosByCasa(int idCasa) {
        List<Comentario> comentarios = new ArrayList<>();
        String query = "SELECT * FROM comentarios WHERE id_casa = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idCasa);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Comentario comentario = new Comentario();
                    comentario.setIdComentario(resultSet.getInt("id_comentario"));
                    comentario.setIdCasa(resultSet.getInt("id_casa"));
                    comentario.setComentario(resultSet.getString("comentario"));
                    comentarios.add(comentario);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comentarios;
    }  

    public Comentario getComentarioById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Comentario> getComentariosByCasaId(int idCasa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean insertComentario(Comentario comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateComentario(Comentario comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean deleteComentario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
