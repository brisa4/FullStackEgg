package EjercicioExtra1.Estancia.persistencia;

import EjercicioExtra1.Estancia.Entidades.Familia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FamiliaDAO {
    private Connection connection;
    public FamiliaDAO(Connection connection) {
        this.connection = connection;
    }

    public FamiliaDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean insert(Familia familia) {
        String query = "INSERT INTO familias (nombre, edad_minima, edad_maxima, num_hijos, email) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, familia.getNombre());
            statement.setInt(2, familia.getEdadMinima());
            statement.setInt(3, familia.getEdadMaxima());
            statement.setInt(4, familia.getNumHijos());
            statement.setString(5, familia.getEmail());

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public List<Familia> getAllFamilias() {
        List<Familia> familias = new ArrayList<>();
        String query = "SELECT * FROM familias";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
    Familia familia = new Familia();
    familia.setId(resultSet.getInt("id_familia"));
    familia.setNombre(resultSet.getString("nombre"));
    familia.setEdadMinima(resultSet.getInt("edad_minima"));
    familia.setEdadMaxima(resultSet.getInt("edad_maxima"));
    familia.setNumHijos(resultSet.getInt("num_hijos"));
    familia.setEmail(resultSet.getString("email"));
    familias.add(familia);
}

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return familias;
    }

    public Familia obtenerFamiliaPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Familia> obtenerTodasLasFamilias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarFamilia(Familia familia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actualizarFamilia(Familia familia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminarFamilia(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
