package ClaseYMetodoFinal;

/**
 *
 * @author Fisher
 */
public class MainFiguras {

    /*
    CLASE Y METODO FINAL
    
    Sirve para bloquear la herencia de una clase, a su vez, un metodo final prohibe que las clases heredadas usen
    el mismo nombre del metodo Padre.
    
     */
    public static void main(String[] args) {
        
    Cuadrado square = new Cuadrado(15.56,4,10);
    square.dibujar();
        
    }
    
}
