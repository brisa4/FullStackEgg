package Ejercicio2y3.servicio;

import Ejercicio2y3.entidad.Electrodomestico;
import Ejercicio2y3.entidad.Televisor;

public class TelevisorServicio extends ElectrodomesticoServicio {

    public Televisor crearTelevisor() {
        Electrodomestico elec = crearElectrodomestico();
        System.out.println("Ingresa la resolución (en pulgadas) del televisor");
        int pulgadas = leer.nextInt();
        System.out.println("Tiene sintonizador? (S/N)");
        boolean sintonizador = false;
        if (leer.next().equalsIgnoreCase("S")) {
            sintonizador = true;
        }
        return new Televisor(elec.getPrecio(), elec.getColor(), elec.getConsumoEnergetico(), elec.getPeso(), pulgadas, sintonizador);
    }

    public double precioFinal(Televisor televisor) {
        super.precioFinal(televisor);
        if (televisor.getResolucion() > 40) {
            televisor.setPrecio(televisor.getPrecio() * 1.3);
        }
        if (televisor.isSintonizadorTDT()) {
            televisor.setPrecio(televisor.getPrecio() + 500);
        }

        return televisor.getPrecio();
    }
}
