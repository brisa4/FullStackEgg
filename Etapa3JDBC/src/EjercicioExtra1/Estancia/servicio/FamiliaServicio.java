package EjercicioExtra1.Estancia.servicio;

import EjercicioExtra1.Estancia.Entidades.Familia;
import EjercicioExtra1.Estancia.persistencia.FamiliaDAO;
import java.util.List;

public class FamiliaServicio {
  private final FamiliaDAO familiaDAO;

    public FamiliaServicio() {
        this.familiaDAO = new FamiliaDAO(); 
    }
    public Familia obtenerFamiliaPorId(int id) throws Exception {
        return familiaDAO.obtenerFamiliaPorId(id);
    }
    public List<Familia> obtenerTodasLasFamilias() throws Exception {
        return familiaDAO.obtenerTodasLasFamilias();
    }
    public void agregarFamilia(Familia familia) throws Exception {
        familiaDAO.agregarFamilia(familia);
    }
    public void actualizarFamilia(Familia familia) throws Exception {
        familiaDAO.actualizarFamilia(familia);
    }
    public void eliminarFamilia(int id) throws Exception {
        familiaDAO.eliminarFamilia(id);
    }
}
