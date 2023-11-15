package EjercicioExtra1.Estancia.servicio;

import EjercicioExtra1.Estancia.Entidades.Estancia;
import EjercicioExtra1.Estancia.Entidades.Clientes;
import EjercicioExtra1.Estancia.Entidades.Casa;
import EjercicioExtra1.Estancia.persistencia.EstanciaDAO;
import java.sql.Connection;
import java.util.List;

public class EstanciaServicio {
    private final EstanciaDAO estanciaDAO;

    public EstanciaServicio(Connection connection) {
        this.estanciaDAO = new EstanciaDAO(connection);
    }
    public Estancia obtenerEstanciaPorId(int id) {
        return estanciaDAO.getEstanciaById(id); 
    }
    public List<Estancia> obtenerEstanciasDeCliente(int idCliente) {
        return estanciaDAO.getEstanciasByClienteId(idCliente); 
    }
    public boolean agregarEstancia(Estancia estancia) {
        return estanciaDAO.insertEstancia(estancia); 
    }
    public boolean actualizarEstancia(Estancia estancia) {
        return estanciaDAO.updateEstancia(estancia); 
    }
    public boolean eliminarEstancia(int id) {
        return estanciaDAO.deleteEstancia(id); 
    }
    public List<Clientes> obtenerClientesDeEstancia(int idEstancia) {
        return estanciaDAO.getClientesByEstanciaId(idEstancia); 
    }
    public List<Casa> obtenerCasasDeEstancia(int idEstancia) {
        return estanciaDAO.getCasasByEstanciaId(idEstancia); 
    }
}



