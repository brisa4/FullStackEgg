package EjercicioExtra1.Estancia.servicio;

import EjercicioExtra1.Estancia.Entidades.Clientes;
import EjercicioExtra1.Estancia.persistencia.ClientesDAO;
import java.util.List;

public class ClientesServicio {
    private ClientesDAO clientesDAO;

    public ClientesServicio() {
        this.clientesDAO = new ClientesDAO();  
    }
    public Clientes obtenerClientePorId(int id) throws Exception {
        return clientesDAO.obtenerClientePorId(id);
    }
    public List<Clientes> obtenerTodosLosClientes() throws Exception {
        return clientesDAO.obtenerTodosLosClientes();
    }
    public void agregarCliente(Clientes cliente) throws Exception {
    }
    public void actualizarCliente(Cliente cliente) throws Exception {
    }
    public void eliminarCliente(int id) throws Exception {
        clientesDAO.eliminarCliente(id);
    }
}


