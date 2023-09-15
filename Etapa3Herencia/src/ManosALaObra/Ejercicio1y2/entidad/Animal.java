package ManosALaObra.Ejercicio1y2.entidad;

import ManosALaObra.Ejercicio1y2.interfaces.IAnimalInterface;

public class Animal implements IAnimalInterface {

    public void hacerRuido() {
        System.out.println("Hola");
    }

    @Override
    public Animal crearAnimal() {
        return new Animal();
    }
}
