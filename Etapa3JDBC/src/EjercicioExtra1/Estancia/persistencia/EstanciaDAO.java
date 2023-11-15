package EjercicioExtra1.Estancia.persistencia;

import EjercicioExtra1.Estancia.Entidades.Casa;
import EjercicioExtra1.Estancia.Entidades.Clientes;
import EjercicioExtra1.Estancia.Entidades.Estancia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstanciaDAO {
    private final Connection connection;
    public EstanciaDAO(Connection connection) {
        this.connection = connection;
    }
    public Estancia getById(int id) {
        Estancia estancia = null;
        String query = "SELECT * FROM estancias WHERE id_estancia = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                estancia = new Estancia();
                estancia.setId(resultSet.getInt("id_estancia"));
                estancia.setIdCliente(resultSet.getInt("id_cliente"));
                estancia.setIdCasa(resultSet.getInt("id_casa"));
                estancia.setNombreHuesped(resultSet.getString("nombre_huesped"));
                estancia.setFechaDesde(resultSet.getDate("fecha_desde"));
                estancia.setFechaHasta(resultSet.getDate("fecha_hasta"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estancia;
    }
    public List<Estancia> getAll() {
        List<Estancia> estancias = new ArrayList<>();
        String query = "SELECT * FROM estancias";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Estancia estancia = new Estancia();
                estancia.setId(resultSet.getInt("id_estancia"));
                estancia.setIdCliente(resultSet.getInt("id_cliente"));
                estancia.setIdCasa(resultSet.getInt("id_casa"));
                estancia.setNombreHuesped(resultSet.getString("nombre_huesped"));
                estancia.setFechaDesde(resultSet.getDate("fecha_desde"));
                estancia.setFechaHasta(resultSet.getDate("fecha_hasta"));
                estancias.add(estancia);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estancias;
    }
    public boolean insert(Estancia estancia) {
        String query = "INSERT INTO estancias (id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, estancia.getIdCliente());
            statement.setInt(2, estancia.getIdCasa());
            statement.setString(3, estancia.getNombreHuesped());
            statement.setDate(4, Date.valueOf(estancia.getFechaDesde()));
            statement.setDate(5, Date.valueOf(estancia.getFechaHasta()));
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean update(Estancia estancia) {
        String query = "UPDATE estancias SET id_cliente = ?, id_casa = ?, nombre_huesped = ?, fecha_desde = ?, fecha_hasta = ? WHERE id_estancia = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, estancia.getIdCliente());
            statement.setInt(2, estancia.getIdCasa());
            statement.setString(3, estancia.getNombreHuesped());
            statement.setDate(4, Date.valueOf(estancia.getFechaDesde()));
            statement.setDate(5, Date.valueOf(estancia.getFechaHasta()));
            statement.setInt(6, estancia.getId());
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean delete(int id) {
        String query = "DELETE FROM estancias WHERE id_estancia = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public List<Casa> getCasasByEstanciaId(int idEstancia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<Clientes> getClientesByEstanciaId(int idEstancia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean deleteEstancia(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean updateEstancia(Estancia estancia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean insertEstancia(Estancia estancia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<Estancia> getEstanciasByClienteId(int idCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Estancia getEstanciaById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static class Date {
        private static java.sql.Date valueOf(java.util.Date fechaDesde) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        public Date() {
        }
    }
    }


