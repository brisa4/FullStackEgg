package ManosALaObra.Ejercicio1y2.entidad;

public class Perro extends Animal {

    public Perro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau");
    }

    @Override
    public Animal crearAnimal() {
        return new Perro();
    }
}
