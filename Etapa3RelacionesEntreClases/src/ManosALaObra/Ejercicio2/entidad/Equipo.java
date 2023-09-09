package ManosALaObra.Ejercicio2.entidad;

import java.util.ArrayList;

public class Equipo {
   ArrayList<Jugador> equipo;

    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }

    public Equipo() {
        this.equipo = new ArrayList();
    }  
    }

