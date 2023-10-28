package EjercicioExtra1.Estancia.persistencia;

import EjercicioExtra1.Estancia.Entidades.Clientes;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientesDAO {
    private Connection connection;

    public ClientesDAO(Connection connection) {
        this.connection = connection;
    }
    public ClientesDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Clientes getById(int id) {
        Clientes clientes = null;
        String query = "SELECT * FROM clientes WHERE id_cliente = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                clientes = new Clientes();
                clientes.setId(resultSet.getInt("id_cliente"));
                clientes.setNombre(resultSet.getString("nombre"));
                clientes.setCalle(resultSet.getString("calle"));
                clientes.setNumero(resultSet.getInt("numero"));
                clientes.setCodigoPostal(resultSet.getString("codigo_postal"));
                clientes.setCiudad(resultSet.getString("ciudad"));
                clientes.setPais(resultSet.getString("pais"));
                clientes.setEmail(resultSet.getString("email"));
            }
        } catch (SQLException e) {
        }
        return clientes;
    }
    public List<Clientes> getAll() {
        List<Clientes> clientes = new ArrayList<>();
        String query = "SELECT * FROM clientes";

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Clientes cliente = new Clientes();
                cliente.setId(resultSet.getInt("id_cliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setCalle(resultSet.getString("calle"));
                cliente.setNumero(resultSet.getInt("numero"));
                cliente.setCodigoPostal(resultSet.getString("codigo_postal"));
                cliente.setCiudad(resultSet.getString("ciudad"));
                cliente.setPais(resultSet.getString("pais"));
                cliente.setEmail(resultSet.getString("email"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }
    public boolean insert(Clientes cliente) {
        String query = "INSERT INTO clientes (nombre, calle, numero, codigo_postal, ciudad, pais, email) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getCalle());
            statement.setInt(3, cliente.getNumero());
            statement.setString(4, cliente.getCodigoPostal());
            statement.setString(5, cliente.getCiudad());
            statement.setString(6, cliente.getPais());
            statement.setString(7, cliente.getEmail());
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }
    public boolean update(Clientes clientes) {
        String query = "UPDATE clientes SET nombre = ?, calle = ?, numero = ?, codigo_postal = ?, ciudad = ?, pais = ?, email = ? WHERE id_cliente = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, clientes.getNombre());
            statement.setString(2, clientes.getCalle());
            statement.setInt(3, clientes.getNumero());
            statement.setString(4, clientes.getCodigoPostal());
            statement.setString(5, clientes.getCiudad());
            statement.setString(6, clientes.getPais());
            statement.setString(7, clientes.getEmail());
            statement.setInt(8, clientes.getId());
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }
    public boolean delete(int id) {
        String query = "DELETE FROM clientes WHERE id_cliente = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    public Clientes obtenerClientesPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Clientes> obtenerTodosLosClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminarClientes(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actualizarCliente(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarClientes(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Clientes obtenerClientePorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}