package Ejercicio8;

 class Tres {
  private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("W");
            System.out.println("Valor final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
    }
}
/*
mostrara por pantalla :
Valor final del finally: 2
Excepcion en metodo()
java.lang.NumberFormatException: For input string: "W"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at Ejercicio8.entidad.Tres.metodo(Tres.java:12)
	at Ejercicio8.entidad.Tres.main(Tres.java:25)

PORQUE El valor "W" no es un valor válido para la conversión a un número entero, pero si lo cambio por un numero no da error(si lo cambio por un 42 quedaria asi:)
Valor final del catch: 43
Valor final del finally: 44
Valor antes del return: 45
45
*/