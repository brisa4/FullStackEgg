package EjercicioExtra1.servicio;

import EjercicioExtra1.entidad.Mes;
import java.util.Random;

public class MesServicio {
   private Mes[] meses = {
        new Mes("enero"), new Mes("febrero"), new Mes("marzo"), new Mes("abril"),
        new Mes("mayo"), new Mes("junio"), new Mes("julio"), new Mes("agosto"),
        new Mes("septiembre"), new Mes("octubre"), new Mes("noviembre"), new Mes("diciembre")
    };

    public Mes obtenerMesSecreto() {
        Random random = new Random();
        int indiceMesSecreto = random.nextInt(meses.length);
        return meses[indiceMesSecreto];
    }  
}
