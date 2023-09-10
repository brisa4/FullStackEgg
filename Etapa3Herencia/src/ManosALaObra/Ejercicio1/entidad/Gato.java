package ManosALaObra.Ejercicio1.entidad;

public class Gato extends Animal {

    @Override
    public void hacerRuido() {
        System.out.println("Miau");
    }

    @Override
    public Animal crearAnimal() {
        return new Gato();
    }
}
