/*
 * NOMBRE: Fisher
 * FECHA: 1/02/22
 * PROYECTO: POO
 */
package ToString;

/**
 * Clase que almacena los datos de la persona.
 *
 * @author Fisher
 */
public class Persona {

    private int edad = 24;
    private final static String NOMBRE = "Fisher";
    private float altura = 1.76f;

    //Puedes insertar este metodo de forma automatica con todos los datos si estos NO SON ESTATICOS ya que estos le pertenecen al objeto y no a la clase
    @Override
    public String toString() { //Este metodo mostrara todos los datos del objeto que retornamos aqui: 
        return "Edad: "+edad
                +"\nNombre: "+NOMBRE
                +"\nAltura: "+altura
                +"\n_____________________";
    }
    
    
    
}
