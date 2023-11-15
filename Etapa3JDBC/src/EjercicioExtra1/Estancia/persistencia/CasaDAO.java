package EjercicioExtra1.Estancia.persistencia;

import EjercicioExtra1.Estancia.Entidades.Casa;
import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CasaDAO {
    private final Connection connection;
    public CasaDAO(Connection connection) {
        this.connection = connection;
    }
    public Casa getCasaById(int id) {
        Casa casa = null;
        String query = "SELECT * FROM casas WHERE id_casa = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                casa = new Casa();
                Casa.setId(resultSet.getInt("id_Casa"));
                casa.setCalle(resultSet.getString("calle"));
                casa.setNumero(resultSet.getInt("numero"));
                casa.setCodigoPostal(resultSet.getString("codigo_postal"));
                casa.setCiudad(resultSet.getString("ciudad"));
                casa.setPais(resultSet.getString("pais"));
                casa.setFechaDesde(resultSet.getDate("fecha_desde"));
                casa.setFechaHasta(resultSet.getDate("fecha_hasta"));
                casa.setTiempoMinimo(resultSet.getInt("tiempo_minimo"));
                casa.setTiempoMaximo(resultSet.getInt("tiempo_maximo"));
                casa.setPrecioHabitacion(resultSet.getBigDecimal("precio_habitacion").doubleValue());
                casa.setTipoVivienda(resultSet.getString("tipo_vivienda"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return casa;
    }
    public List<Casa> getAllCasas() {
        List<Casa> casasList = new ArrayList<>();
        String query = "SELECT * FROM casas";

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Casa casa = new Casa();
                casa.setId(resultSet.getInt("id_casa"));
                casa.setCalle(resultSet.getString("calle"));
                casa.setNumero(resultSet.getInt("numero"));
                casa.setCodigoPostal(resultSet.getString("codigo_postal"));
                casa.setCiudad(resultSet.getString("ciudad"));
                casa.setPais(resultSet.getString("pais"));
                casa.setFechaDesde(resultSet.getDate("fecha_desde"));
                casa.setFechaHasta(resultSet.getDate("fecha_hasta"));
                casa.setTiempoMinimo(resultSet.getInt("tiempo_minimo"));
                casa.setTiempoMaximo(resultSet.getInt("tiempo_maximo"));
                casa.setPrecioHabitacion(resultSet.getBigDecimal("precio_habitacion").doubleValue());
                casa.setTipoVivienda(resultSet.getString("tipo_vivienda"));
                casasList.add(casa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return casasList;
    }
    public boolean insertCasa(Casa casa) {
        String query = "INSERT INTO casas (calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, casa.getCalle());
            statement.setInt(2, casa.getNumero());
            statement.setString(3, casa.getCodigoPostal());
            statement.setString(4, casa.getCiudad());
            statement.setString(5, casa.getPais());
            statement.setDate(6, (Date) casa.getFechaDesde());
            statement.setDate(7, (Date) casa.getFechaHasta());
            statement.setInt(8, casa.getTiempoMinimo());
            statement.setInt(9, casa.getTiempoMaximo());
            statement.setBigDecimal(10, BigDecimal.valueOf(casa.getPrecioHabitacion()));
            statement.setString(11, casa.getTipoVivienda());
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean updateCasa(Casa casa) {
        String query = "UPDATE casas SET calle = ?, numero = ?, codigo_postal = ?, ciudad = ?, pais = ?, fecha_desde = ?, fecha_hasta = ?, tiempo_minimo = ?, tiempo_maximo = ?, precio_habitacion = ?, tipo_vivienda = ? WHERE id_casa = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, casa.getCalle());
            statement.setInt(2, casa.getNumero());
            statement.setString(3, casa.getCodigoPostal());
            statement.setString(4, casa.getCiudad());
            statement.setString(5, casa.getPais());
            statement.setDate(6, (Date) casa.getFechaDesde());
            statement.setDate(7, (Date) casa.getFechaHasta());
            statement.setInt(8, casa.getTiempoMinimo());
            statement.setInt(9, casa.getTiempoMaximo());
            statement.setBigDecimal(10, BigDecimal.valueOf(casa.getPrecioHabitacion()));
            statement.setString(11, casa.getTipoVivienda());
            statement.setInt(12, casa.getId());
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean deleteCasa(int id) {
        String query = "DELETE FROM casas WHERE id_casa = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
