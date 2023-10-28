package EjercicioExtra1.Estancia.servicio;

import EjercicioExtra1.Estancia.Entidades.Casa;
import EjercicioExtra1.Estancia.persistencia.CasaDAO;
import java.sql.Connection;
import java.util.List;

public class CasaServicio {
    private Connection connection;
    private CasaDAO casaDAO;

    public CasaServicio(Connection connection) {
        this.connection = connection;
        this.casaDAO = new CasaDAO(connection);
    }

    public List<Casa> obtenerTodasLasCasas() {
        return casaDAO.getAllCasas();
    }

    public Casa obtenerCasaPorId(int id) {
        return casaDAO.getCasaById(id);
    }

    public void agregarCasa(Casa casa) {
        casaDAO.insertCasa(casa);
    }

    public void actualizarCasa(Casa casa) {
        casaDAO.updateCasa(casa);
    }

    public void eliminarCasa(int id) {
        casaDAO.deleteCasa(id);
    }
}
