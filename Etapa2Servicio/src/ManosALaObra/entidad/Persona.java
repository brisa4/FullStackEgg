package ManosALaObra.entidad;

public class Persona {
  private String nombre;
    private int edad;
    private String correoElectronico;

    public Persona(String nombre, int edad, String correoElectronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }  
}


ArrayList<Integer> numerosA = new ArrayList();
int x = 20;
numerosA.add(x);

HashSet<Integer> numerosB = new HashSet();
Integer Y = 20;
numerosB.add(y);

HashMap<Integer, String> alumnos = new HashMap();
int dni = 34576189
String nombreAlumno = "pepe"
alumnos.put(dni, nombreAlumno)