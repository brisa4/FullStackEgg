package Ejercicio2y3.servicio;

import Ejercicio2y3.entidad.Electrodomestico;
import Ejercicio2y3.entidad.Lavadora;

public class LavadoraServicio extends ElectrodomesticoServicio {
    public Lavadora crearLavadora() {
        Electrodomestico elec = crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        int carga = leer.nextInt();
        return new Lavadora(elec.getPrecio(), elec.getColor(), elec.getConsumoEnergetico(), elec.getPeso(), carga);
    }
    public double precioFinal(Lavadora lavadora) {
        super.precioFinal(lavadora);
        if (lavadora.getCarga() > 30) {
            lavadora.setPrecio(lavadora.getPrecio() + 500);
        }
        return lavadora.getPrecio();
    }
}
