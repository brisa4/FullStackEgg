package Ejercicio9;

public class Ejercicio9 {
  /*Dado el método metodoC de la clase C, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?

class C {
void metodoC() throws TuException{
sentencia_c1
try {
sentencia_c2
sentencia_c3
} catch (MioException e){

13

sentencia_c4
} catch (TuException e){
sentencia_c5
throw (e)
}
finally
sentencia_c6

}
}  */
    
    /*
    a) Si se produce la excepción MioException:

Se ejecuta sentencia_c1.
Se ejecuta sentencia_c2.
Se ejecuta sentencia_c3.
Se ejecuta sentencia_c4
Se ejecuta sentencia_c6
    */
    
    /*
    b) Si no se produce la excepción MioException ni TuException:

Se ejecuta sentencia_c1.
Se ejecuta sentencia_c2.
Se ejecuta sentencia_c3.
Se ejecuta sentencia_c6
    */
    
    /*
    Si se produce la excepción TuException:

Se ejecuta sentencia_c1.
Se ejecuta sentencia_c2.
Se ejecuta sentencia_c3
Se ejecuta sentencia_c6
    */
}
