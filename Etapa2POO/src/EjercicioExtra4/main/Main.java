package EjercicioExtra4.main;

import EjercicioExtra4.entidad.Cuenta;

public class Main {
  public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1000, "Jeremias");

        cuenta.retirar_dinero();
        cuenta.retirar_dinero();
    }
}
