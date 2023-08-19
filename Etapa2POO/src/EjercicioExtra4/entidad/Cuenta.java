package EjercicioExtra4.entidad;

import java.util.Scanner;

public class Cuenta {
   private double saldo;
    private String titular;

    public Cuenta() {
    }
    
    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void retirar_dinero() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        double dineroARetirar = leer.nextInt();
        if (dineroARetirar <= this.saldo) {
            this.saldo -= dineroARetirar;
            System.out.println("Se retiró " + dineroARetirar);
            System.out.println("Su saldo actual es de " + this.saldo);
        } else {
            System.out.println("Se retiró " + saldo + " y la cuenta quedó en 0");
        }
    }
}
