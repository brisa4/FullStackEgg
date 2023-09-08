package EjercicioExtra2.entidad;

public class Sala {
   private Asiento[][] asientos;
    public Sala() {
        this.asientos = new Asiento[8][6];
        for (int i = 0; i < asientos.length; i++) {
            int contador = 0;
            for (int j = 0; j < asientos[0].length; j++) {
                String letraJ = "";
                switch (j) {
                    case 0:
                        letraJ = "A";
                        break;
                    case 1:
                        letraJ = "B";
                        break;
                    case 2:
                        letraJ = "C";
                        break;
                    case 3:
                        letraJ = "D";
                        break;
                    case 4:
                        letraJ = "E";
                        break;
                    case 5:
                        letraJ = "F";
                        break;
                }
                Asiento asiento = new Asiento();
                asiento.setNombre(" " + (8 - i) + " " + letraJ + " ");
                asiento.setOcupado(false);
                asientos[i][j] = asiento;
            }
        }
    }

    public Sala(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }
}
